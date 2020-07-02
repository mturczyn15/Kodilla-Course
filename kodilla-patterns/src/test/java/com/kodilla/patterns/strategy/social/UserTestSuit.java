package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuit {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John");
        User kamil = new YGeneration("kamilos");
        User mati = new ZGeneration("mateo");

        //When
        String johnPost = john.sharePost();
        System.out.println("John publish post on : " + johnPost);
        String kamilPost = kamil.sharePost();
        System.out.println("Kamil publish post on : " + kamilPost);
        String matiPost = mati.sharePost();
        System.out.println("Mateusz publish post on : " + matiPost);

        //Then
        Assert.assertEquals("Twitter", johnPost);
        Assert.assertEquals("Facebook", kamilPost);
        Assert.assertEquals("Snapchat", matiPost);
    }

    @Test
    public void testIndividualSharingStrategies() {

        //Given
        User john = new Millenials("John");

        //When
        String johnPost = john.sharePost();
        System.out.println("John publish post on : " + johnPost);
        john.setSocialPublisher(new FacebookPublisher());
        johnPost = john.sharePost();
        System.out.println("John publish post on: " + johnPost);

        //Then
        Assert.assertEquals("Facebook", johnPost);
    }
}
