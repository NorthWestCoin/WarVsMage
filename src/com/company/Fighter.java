package com.company;

class Fighter{
    public Integer health;
    public Integer damage;
    public Integer survive;


    Fighter( Integer hp, Integer dmg, Integer surv){
        this.health = hp;
        this.damage = dmg;
        this.survive = surv;
    }
    public  int attack(){
        return damage;
    }
    public void recovery(){
        this.health = health + survive;
    }
    public Integer getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public Integer getDamage(){
        return damage;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public  Integer getSurvive(){
        return survive;
    }
    public  void setSurvive(int survive){
        this.survive = survive;
    }
}
