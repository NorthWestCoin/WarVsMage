package com.company;

 class Mage extends Fighter {
     Mage(Integer hp, Integer dmg, Integer surv) {
         super(hp, dmg, surv);
     }



     @Override
     public int attack(){
         int obratnuiYronMaga;
         obratnuiYronMaga = damage * 2;
         return obratnuiYronMaga;
     }
 }
