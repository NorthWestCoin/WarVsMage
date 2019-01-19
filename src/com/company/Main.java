package com.company;

public class Main {

    public static void main(String[] args) {
        Fighter warrior = new Fighter(15, 4, 3);
        Fighter mage = new Fighter(30, 2, 2);
        System.out.println("Warrior start hp: " + warrior.getHealth());
        System.out.println("Mage start hp: " + mage.getHealth());


        while (warrior.getHealth() > 0 && mage.getHealth() > 0){
            int attack1 = warrior.attack();
            int f2HealthLeft = mage.getHealth()-attack1;
            mage.setHealth(f2HealthLeft);
            mage.recovery();
            System.out.println("Mage hp left: " + mage.getHealth());


            int attack2 = mage.attack();
            int f1HealthLeft = warrior.getHealth()-attack2;
            warrior.setHealth(f1HealthLeft);
            warrior.recovery();
            System.out.println("Warrior hp left:" + warrior.getHealth());

        }
    }
}

