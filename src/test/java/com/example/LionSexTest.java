package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionSexTest {

    private final String sex;

    public LionSexTest(String sex) {
        this.sex = sex;
    }


    @Parameterized.Parameters(name = "Тестовые данные: {0}")
    public static Object[][] getSumData() {
        return new Object[][] {
                {"Самка"},
                {"Самец"},
                {"Нечто"}
        };
    }

    @Test
    public void checkLionMaleSexTest() {
        Feline feline = new Feline();
        try {
            Lion lionSex = new Lion(sex, feline);
            if (sex.equals("Самка")) {
                assertFalse("У самок нет гривы", lionSex.doesHaveMane());
            } else if (sex.equals("Самец")) {
                assertTrue("У самцов есть грива", lionSex.doesHaveMane());
            }
        } catch (Exception e) {
            System.out.println("Существует только Самец или Самка");
        }

    }
}
