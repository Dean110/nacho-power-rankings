package com.nachopowerrankings.blog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class JpaWiringTest {
    @Autowired
    CategoryRepository categoryRepo;
    @Autowired
    ReviewRepository reviewRepo;
    @Autowired
    TestEntityManager entityManager;

    @Test
    public void reviewsShouldHaveACategory() {
        Category testCategory = new Category("Type Of Serving Location", "Description of category");
        Review testReview = new Review("Name of Nachos", "Name of Vendor", "review content", 10, testCategory);
        categoryRepo.save(testCategory);
        reviewRepo.save(testReview);

        entityManager.flush();
        entityManager.clear();
// --------------------------------------------------------------------------------------------------------------------
        Review retrievedReview = reviewRepo.findById(testReview.getId()).get();
        Category retrievedCategory = categoryRepo.findById(testCategory.getId()).get();

        assertThat(retrievedReview).isEqualTo(testReview);
        assertThat(retrievedCategory.getReviews()).containsExactly(testReview);


    }


}
