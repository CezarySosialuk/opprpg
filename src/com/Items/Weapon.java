package com.Items;

public class Weapon extends item {
    private int damage;
    private int durability;
    private int requiredStat; //minimum number stat required
    private String statType;  //which star the weapon relies on

    public int Get_Damage(){
        return damage;
    }

    public Weapon(int id, String n, float w, int g, int dam, int dur, int req, String stat){
        this.id = id;
        this.name = n;
        this.weight = w;
        this.goldValue = g;
        this.damage = dam;
        this.durability = dur;
        this.requiredStat = req;
        this.statType = stat;
    }
}
