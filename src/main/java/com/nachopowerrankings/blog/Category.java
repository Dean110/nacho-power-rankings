package com.nachopowerrankings.blog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    private String typeOfServingLocation;
    private String description;
    @OneToMany(mappedBy = "category")
    private Collection<Review> reviews;

    protected Category(){}
    public Category(String typeOfServingLocation, String description) {
        this.typeOfServingLocation = typeOfServingLocation;
        this.description = description;
    }

    public String getTypeOfServingLocation() {
        return typeOfServingLocation;
    }

    public String getDescription() {
        return description;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) &&
                Objects.equals(typeOfServingLocation, category.typeOfServingLocation) &&
                Objects.equals(description, category.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeOfServingLocation, description);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", typeOfServingLocation='" + typeOfServingLocation + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Collection<Review> getReviews() {
        return reviews;
    }
}
