package com.theironyard.installparty;

public class ArmyRanger extends Soldier implements Shooting,HandtoHand{

    public ArmyRanger(String name, String rank, int serialNum, String specialty) {


    }
    @Override
     public void Wound(){
        System.out.println("Get to cover!");;
    };

    @Override
    void speak() {
        System.out.println("Rangers lead the way!!");
    }

    @Override
    public String gunFire() {
       return "Pew, pew";
    }

    @Override
    public String attack() {
        return "Blam!!";
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
