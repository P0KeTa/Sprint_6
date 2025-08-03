package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    private Lion lion;

    @Before
    public void createClass() throws Exception {
        Feline feline = new Feline();
        lion = new Lion("Самка", feline);
    }

    @Test
    public void checkLionKittensTest() {
        assertEquals("Кол-во детёнышей 1", 1, lion.getKittens());
    }

    @Test
    public void checkLionFoodTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(expected);
        assertEquals("Список еды не соответствует выбранному животному", expected, lion.getFood());
    }
}