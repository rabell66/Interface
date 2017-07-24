package com.theironyard.installparty;

abstract class Soldier {

     static String name;
     String rank;
     int serialNum;
     String specialyt;

    void sleep(){
        System.out.println("Snore....");
    }
    void eat(){
        System.out.println(("Num num num"));
    }

    void patrol() {
        System.out.println("Patrolling the Northern Perimeter Sir!!");
    }

    abstract void speak();


}
