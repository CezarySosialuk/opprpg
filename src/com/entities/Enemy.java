package com.entities;

public class Enemy extends Creature {
    public Enemy(int h, String n, int a, int d){
        this.healthPoints = h;
        this.name = n;
        this.attack = a;
        this.deffence = d;
    }
}
