package com.nachopowerrankings.blog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Long id;
    private String nachosName;
    private String vendorName;
    private String reviewContent;
    private int rating;
    @ManyToOne
    private Category category;

    protected Review(){}
    public Review(String nachosName, String vendorName, String reviewContent, int rating, Category category) {

        this.nachosName = nachosName;
        this.vendorName = vendorName;
        this.reviewContent = reviewContent;
        this.rating = rating;
        this.category = category;
    }

    public String getNachosName() {
        return nachosName;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public int getRating() {
        return rating;
    }

    public Category getCategory() {
        return category;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return rating == review.rating &&
                Objects.equals(id, review.id) &&
                Objects.equals(nachosName, review.nachosName) &&
                Objects.equals(vendorName, review.vendorName) &&
                Objects.equals(reviewContent, review.reviewContent) &&
                Objects.equals(category, review.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nachosName, vendorName, reviewContent, rating, category);
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", nachosName='" + nachosName + '\'' +
                ", vendorName='" + vendorName + '\'' +
                ", reviewContent='" + reviewContent + '\'' +
                ", rating=" + rating +
                ", category=" + category +
                '}';
    }
}
