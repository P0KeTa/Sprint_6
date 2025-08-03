package com.example;

public class LionAlex extends Lion {

    public LionAlex(String sex, Feline feline) throws Exception {
        super(sex , feline);
    }

    public String getFriends() {
        return "Марти, Глория, Мелман";
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
