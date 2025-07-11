package com.entities;

public class Creature {
    protected int healthPoints;
    protected String name;

    protected int attack;
    protected int deffence;

    public int Get_Health(){
        return healthPoints;
    }
    public int Get_Attack(){
        return attack;
    }

    public void takeDamage(int damage){
        this.healthPoints -= (damage - this.deffence);
    }

    public void doAttack(Creature target){
        target.takeDamage(attack);
    }
}
