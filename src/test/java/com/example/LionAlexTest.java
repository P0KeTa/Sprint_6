package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    Feline feline;

    private LionAlex lionAlex;

    @Before
    public void createClass() throws Exception {
        lionAlex = new LionAlex("Самец", feline);
    }

    @Test
    public void checkAlexFriendsTest() {
        String expected = "Марти, Глория, Мелман";
        assertEquals("Список друзей не верен", expected, lionAlex.getFriends());
    }

    @Test
    public void checkAlexPlaceOfLivingTest() {
        String expected = "Нью-Йоркский зоопарк";
        assertEquals("Место жительства не верное", expected, lionAlex.getPlaceOfLiving());
    }

    @Test
    public void checkAlexKittensTest() {
        assertEquals("Самцы не могут иметь детей", 0, lionAlex.getKittens());
    }

}