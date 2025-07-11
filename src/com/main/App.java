package com.main;

import com.entities.*;

import java.util.Scanner;

import com.Items.*;

public class App {
    public static void main(String[] args) throws Exception {
        Player test = new Player();
        Enemy bad = new Enemy(5,"wolf",2,0);

        test.playerCreator();
        
        test = combat(test, bad);
    }

    public static Player combat(Player p, Enemy e){
        Scanner scan = new Scanner(System.in);
        String choice;
        
        while (p.Get_Health() > 0 && e.Get_Health() > 0) {
            System.out.println("1. Attack"); 
            System.out.println("2. Run");   
            System.out.print("Your choice: ");
            choice = scan.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("You attacked for" + p.Get_Attack());
                    p.doAttack(e);
                    break;
                case "2":
                    System.out.println("Escaped");
                    return p;
                     
                default:
                    break;
            }

            if (e.Get_Health() < 0){
                System.out.println("Enemy defeated");
                break;
            }
            System.out.println("Enemy attacks for "+ e.Get_Attack());
            e.doAttack(p);
        }

        //scan.close();
        return p;
    }
}
