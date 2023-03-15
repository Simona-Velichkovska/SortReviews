package com.challenge.sortreviews.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Getter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Review {

    private Long id;
    private String reviewId;
    private String reviewFullText;
    private String reviewText;
    private int numLikes;
    private int numComments;
    private int numShares;
    private int rating;
    private String reviewCreatedOn;
    private String reviewCreatedOnDate;
    private Long reviewCreatedOnTime;
    private Long reviewerId;
    private String reviewerUrl;
    private String reviewerName;
    private String reviewerEmail;
    private String sourceType;
    private boolean isVerified;
    private String source;
    private String sourceName;
    private String sourceId;
    private List<String> tags;
    private String href;
    private String logoHref;
    private List<String> photos;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewFullText() {
        return reviewFullText;
    }

    public void setReviewFullText(String reviewFullText) {
        this.reviewFullText = reviewFullText;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public int getNumLikes() {
        return numLikes;
    }

    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
    }

    public int getNumComments() {
        return numComments;
    }

    public void setNumComments(int numComments) {
        this.numComments = numComments;
    }

    public int getNumShares() {
        return numShares;
    }

    public void setNumShares(int numShares) {
        this.numShares = numShares;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReviewCreatedOn() {
        return reviewCreatedOn;
    }

    public void setReviewCreatedOn(String reviewCreatedOn) {
        this.reviewCreatedOn = reviewCreatedOn;
    }

    public String getReviewCreatedOnDate() {
        return reviewCreatedOnDate;
    }

    public void setReviewCreatedOnDate(String reviewCreatedOnDate) {
        this.reviewCreatedOnDate = reviewCreatedOnDate;
    }

    public Long getReviewCreatedOnTime() {
        return reviewCreatedOnTime;
    }

    public void setReviewCreatedOnTime(Long reviewCreatedOnTime) {
        this.reviewCreatedOnTime = reviewCreatedOnTime;
    }

    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getReviewerUrl() {
        return reviewerUrl;
    }

    public void setReviewerUrl(String reviewerUrl) {
        this.reviewerUrl = reviewerUrl;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getReviewerEmail() {
        return reviewerEmail;
    }

    public void setReviewerEmail(String reviewerEmail) {
        this.reviewerEmail = reviewerEmail;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getLogoHref() {
        return logoHref;
    }

    public void setLogoHref(String logoHref) {
        this.logoHref = logoHref;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }



    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", reviewId='" + reviewId + '\'' +
                ", reviewFullText='" + reviewFullText + '\'' +
                ", reviewText='" + reviewText + '\'' +
                ", numLikes=" + numLikes +
                ", numComments=" + numComments +
                ", numShares=" + numShares +
                ", rating=" + rating +
                ", reviewCreatedOn='" + reviewCreatedOn + '\'' +
                ", reviewCreatedOnDate=" + reviewCreatedOnDate +
                ", reviewCreatedOnTime=" + reviewCreatedOnTime +
                ", reviewerId=" + reviewerId +
                ", reviewerUrl='" + reviewerUrl + '\'' +
                ", reviewerName='" + reviewerName + '\'' +
                ", reviewerEmail='" + reviewerEmail + '\'' +
                ", sourceType='" + sourceType + '\'' +
                ", isVerified=" + isVerified +
                ", source='" + source + '\'' +
                ", sourceName='" + sourceName + '\'' +
                ", sourceId='" + sourceId + '\'' +
                ", tags=" + tags +
                ", href='" + href + '\'' +
                ", logoHref='" + logoHref + '\'' +
                ", photos=" + photos +
                '}';
    }
}
