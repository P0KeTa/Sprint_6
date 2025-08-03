package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    private Feline feline;

    @Before
    public void createClass() {
        feline = new Feline();
    }

    @Test
    public void checkEatMeatFelineTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Список еды не соответствует выбранному животному", expected, feline.eatMeat());
    }

    @Test
    public void checkFamilyFelineTest() {
        assertEquals("Семейство не Кошачьи","Кошачьи", feline.getFamily());
    }

    @Test
    public void checkKittensFelineTest() {
        assertEquals("Кол-во детёнышей не 1",1, feline.getKittens());
    }

    @Test
    public void checkKittensFeline2Test() {
        assertEquals("Кол-во детёнышей не соответствует переданному значению",3, feline.getKittens(3));
    }
}