package com.nachopowerrankings.blog;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.ui.Model;

import java.util.Collections;

public class CategoryControllerTest {

    @Test
    public void displayAllCategoriesInteractsWithRepoCorrectly(){
        //Arrangement
        CategoryRepository mockRepo = Mockito.mock(CategoryRepository.class);
        CategoryController underTest = new CategoryController(mockRepo);
        Model mockModel = Mockito.mock(Model.class);

        //Action
        underTest.displayAllCategories(mockModel);

        //Assertion
        Mockito.verify(mockRepo).findAll();
        Mockito.verify(mockModel).addAttribute("categories", Collections.EMPTY_LIST);
    }
}
