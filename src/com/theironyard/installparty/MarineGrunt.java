package com.theironyard.installparty;

public class MarineGrunt extends Soldier implements HandtoHand {

    public MarineGrunt(String name, String rank, int serialNum, String specialty) {
    }

    @Override
    void speak() {
        System.out.println("Hoo-Rah");
    }

    @Override
    public String attack() {
        return "Judo Chop";

    }
    @Override
    public void Wound(){
        System.out.println("Its just a flesh wound");
    }

}
