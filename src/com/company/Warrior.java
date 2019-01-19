package com.company;

 class Warrior extends Fighter {
     Warrior(Integer hp, Integer dmg, Integer surv) {
         super(hp, dmg, surv);
     }

     @Override
     public void recovery(){
         this.health = health + survive * 3;
     }
 }
