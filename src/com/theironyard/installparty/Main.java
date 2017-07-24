package com.theironyard.installparty;

public class Main {

    public static void main(String[] args) {

      ArmyGrunt armyGrunt = new ArmyGrunt("Jack Jackson", "Sgt", 1234567,"Rifleman");
        System.out.println("Army Grunt");
      armyGrunt.patrol();
      armyGrunt.eat();
      armyGrunt.sleep();
      armyGrunt.speak();
      System.out.println(armyGrunt.gunFire());

      ArmyRanger armyRanger = new ArmyRanger("Ranger Rick", "1st Sgt",9876543,"Sniper");
        System.out.println("Army Ranger");
      armyRanger.patrol();
      armyRanger.eat();
      armyRanger.sleep();
      armyRanger.speak();
      System.out.println(armyRanger.gunFire());
      System.out.println(armyRanger.attack());

      MarineGrunt marineGrunt = new MarineGrunt("Marine Mike", "Gunny", 3456789, "Infantry");
        System.out.println("Marine Grunt");
        marineGrunt.patrol();
        marineGrunt.eat();
        marineGrunt.sleep();
        marineGrunt.speak();
        System.out.println(marineGrunt.attack());







    }
}
