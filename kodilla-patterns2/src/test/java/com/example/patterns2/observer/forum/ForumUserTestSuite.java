package com.example.patterns2.observer.forum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        JavaHelpForumTopic javaHelpForum = new JavaHelpForumTopic();
        JavaToolsForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser john_smith = new ForumUser("John Smith");
        ForumUser ivone_escobar = new ForumUser("Ivone Escobar");
        ForumUser jessie_pinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(john_smith);
        javaToolsForum.registerObserver(ivone_escobar);
        javaHelpForum.registerObserver(jessie_pinkman);
        javaToolsForum.registerObserver(jessie_pinkman);
        //When
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop?");
        javaHelpForum.addPost("Better try to use while loop in this case.");
        javaToolsForum.addPost("Help pls, my MySQL db doesn't want to work :(");
        javaHelpForum.addPost("Why while? Is it better?");
        javaToolsForum.addPost("When I try to log in I got 'bad credentials' message.");
        //Then
        assertEquals(3, john_smith.getUpdateCount());
        assertEquals(2, ivone_escobar.getUpdateCount());
        assertEquals(5, jessie_pinkman.getUpdateCount());
    }
}
