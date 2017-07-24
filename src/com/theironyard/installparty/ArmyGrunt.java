package com.theironyard.installparty;

public class ArmyGrunt extends Soldier implements Shooting {

     public ArmyGrunt(String name, String rank, int serialNum, String specialty) {



     }

    @Override
    void speak() {
        System.out.println("Army Strong, Sir!!");
    }

    @Override
    public String gunFire() {
        return "Bang Bang!!";

    }
    @Override
    public String Bomb(){

        return "Aaarrrggghhhhh..why?";
    }
    @Override
    public String toString(){
        return Bomb();
    }

}
