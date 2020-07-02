package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.facade.SearchFacade;
import com.kodilla.hibernate.manytomany.facade.SearchProcessingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {

    @Autowired
    SearchFacade searchFacade;

    @Test
    public void testSearchFacade () {
        try {
            searchFacade.processSearching("rey", "oo");
        } catch (
                SearchProcessingException e) {
            //business exception
        }
    }
}
