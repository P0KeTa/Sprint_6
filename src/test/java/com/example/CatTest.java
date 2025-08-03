package com.example;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    private Cat cat;

    @Before
    public void createClass() {
        cat = new Cat(felineCat);
    }

    @Mock
    Feline felineCat;

    @Test
    public void checkSoundCatTest() {
        assertEquals("Кот не произносит звук 'Мяу'", "Мяу", cat.getSound());

    }

    @Test
    public void checkFoodCatTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(cat.getFood()).thenReturn(expected);
        assertEquals("Список еды не соответствует выбранному животному",expected, cat.getFood());
    }


}