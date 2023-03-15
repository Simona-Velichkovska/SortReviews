package com.challenge.sortreviews.web;

import com.challenge.sortreviews.Data.DataHolder;
import com.challenge.sortreviews.model.Review;
import com.challenge.sortreviews.service.FilteringService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class FilterController {

    private final FilteringService filteringService;

    public FilterController(FilteringService filteringService) {
        this.filteringService = filteringService;
    }

    @GetMapping
    public String getFilterPage(@RequestParam(required = false) String error, Model model){
        if(error!=null && !error.isEmpty()){
            model.addAttribute("hasError",true);
            model.addAttribute("error",error);
        }
        List<Review> reviews = this.filteringService.listAllReviews();
        model.addAttribute("reviews",reviews);
        return "filterpage";
    }

    @PostMapping("/filter")
    public String filterBalloon(@RequestParam String text,@RequestParam String date,@RequestParam String rating,@RequestParam Integer minrating, Model model){
        List<Review> reviews = this.filteringService.listAllReviews();
        if(rating.equals("Highest First")) {
            boolean low = false;
            reviews=this.filteringService.filterByRating(reviews, low);
            System.out.println("Rating Highest");
        }
        if(rating.equals("Lowest First")) {
            boolean low = true;
            reviews=this.filteringService.filterByRating(reviews, low);
            System.out.println("Rating Lowest");
        }
        if(date.equals("Oldest First")) {
            boolean old=true;
            reviews=this.filteringService.orderByDate(reviews, old);
            System.out.println("Date Oldest");
        }
        if(date.equals("Newest First")) {
            boolean old=false;
            reviews=this.filteringService.orderByDate(reviews, old);
            System.out.println("Date Newest");
        }
        if(text.equals("Yes")) {
            reviews=this.filteringService.prioritizeByText(reviews);
            System.out.println("Yes");
        }
        if(minrating>1){
            reviews=this.filteringService.filterMinRating(reviews,minrating);
        }
        model.addAttribute("reviews",reviews);
        return "filterpage";
    }
}
