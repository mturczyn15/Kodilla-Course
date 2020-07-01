package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //Given
        Country poland = new Country(new BigInteger("12344"));
        Country germany = new Country(new BigInteger("1265344"));
        Country russia = new Country(new BigInteger("1235444"));
        Country china = new Country(new BigInteger("12364344"));
        Country japan = new Country(new BigInteger("1234344"));
        Country egipt = new Country(new BigInteger("125654344"));
        Country nigeria = new Country(new BigInteger("12343454"));
        Country camerun = new Country(new BigInteger("13452344"));
        Continent africa = new Continent(egipt, nigeria, camerun);
        Continent asia = new Continent(russia, china, japan);
        Continent europe = new Continent(poland, germany);
        World world = new World(africa, asia, europe);

        //When
        BigInteger actualPeopleQuantity = world.getPeopleQuantity();
        BigInteger expectedPeopleQuantity = new BigInteger("167561962");


        //Then
        Assert.assertEquals(expectedPeopleQuantity,actualPeopleQuantity);
    }
}
