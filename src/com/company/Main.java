package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int alter = 15;
        if (alter >= 18) {
            System.out.println("Yes! Ich darf hinein!");
        }else if (alter >= 16) {
            System.out.println("Auch Schnapps erlaubt");
        }else {
            {
            //hier gehen wir rein
            System.out.println("Gehe Pizza essen");
        }
        //hier wird den Code ausgeführt
            System.out.println("Warte gelangweilt im Auto");

            //Beispiel fuer einen switch
            int note = 2, stipendium;

            //Berechne Förderstipendium
            switch (note){
                case 1:
                    //hier steht der Code der ausgeführt wird wenn ich 1 bekomme
                   stipendium = 100;
                    break;
                case 2:
                    stipendium = 50;
                    break;
                case 3:
                    stipendium = 30;
                    break;
                default:
                    stipendium = 10;
                    break;
            }
            System.out.println("Stipendium: " + stipendium + "€" );
        }
    }
}
