package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User robcio = new Millenials("Robert Sobczynski");
        User justa = new YGeneration("Justyna Dobrowolska");
        User katerina = new ZGeneration("Katarzyna Bodziak");

        //When
        String robcioSocial = robcio.sharePost();
        System.out.println("Robcio lubi " + robcioSocial);
        String justaSocial = justa.sharePost();
        System.out.println("Justa lubi " + justaSocial);
        String katerinaSocial = katerina.sharePost();
        System.out.println("Katerina lubi " + katerinaSocial);

        //Then
        Assert.assertEquals("Facebook", robcioSocial);
        Assert.assertEquals("Twitter", justaSocial);
        Assert.assertEquals("Snapchat", katerinaSocial);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User justa = new YGeneration("Justyna Dobrowolska");

        //When
        String justaSocial = justa.sharePost();
        System.out.println("Justa lubi " + justaSocial);
        justa.setSocialPublisher(new FacebookPublisher());
        justaSocial = justa.sharePost();
        System.out.println("Justa lubi " + justaSocial);

        //Than
        Assert.assertEquals("Facebook", justaSocial);
    }
}