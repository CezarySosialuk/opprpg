package com.entities;

import java.util.Scanner;

public class Player extends Creature {
    int strength=1;
    int dexterity=1;
    int health=1;
    int inteligence=1;
    int charisma=1;

    int gold;

    public void playerCreator(){
        this.gold = 50;

        Scanner scanner = new Scanner(System.in);
        int skillpoints = 5;

        System.out.print("Enter your name: ");
        this.name = scanner.nextLine();
        System.out.println(" ");

        int choice;
        while (skillpoints > 0){
            System.out.println("You have: " + skillpoints + " skillpoints left");
            System.out.println("Pick a stat to boost by 1");
            System.out.println("1. Strength: " + this.strength);
            System.out.println("2. Dexterity: " + this.dexterity);
            System.out.println("3. Health: " + this.health);
            System.out.println("4. Inteligence: " + this.inteligence);
            System.out.println("5. Charisma: " +  this.charisma);
            System.out.print("Your pick: ");
            choice = scanner.nextInt(); 
            System.out.println(" ");
            
            switch (choice) {
                case 1:
                    this.strength++;
                    break;
                case 2:
                    this.dexterity++;
                    break;
                case 3:
                    this.health++;
                    break;
                case 4:
                    this.inteligence++;
                    break;
                case 5:
                    this.charisma++;
                    break;
                default:
                    break;
            }
            skillpoints--;
        }
        scanner.close();
    }

    public void showInventory(){

    }
}
