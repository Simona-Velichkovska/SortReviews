package com.challenge.sortreviews.web;

import com.challenge.sortreviews.model.Review;
import com.challenge.sortreviews.service.FilteringService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
