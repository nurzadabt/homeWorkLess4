package com.company;

import java.util.Random;

public class Main {


    
    public static int bossHealth = 700;
    public static int bossDamage = 50;

    public static int[] heroesHealth = {250, 250, 250};
    public static int[] heroesDamage = {20, 20, 20};
    public static String[] heroesAttackType = {"Physikal", "Magic", "Mental", "Medical"};

    public static int medicalHealth = 100;


    public static void main(String[] args) {
        printStatistic();
        while (!isFinished()) {
            round();
            printStatistic();
        }

    }

    public static void round() {
        printStatistic();
        heroesHit();
        bossHit();
        isFinished();
    }

    public static boolean isFinished() {
        if (bossHealth <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        if (heroesHealth[0] <= 0 && heroesHealth[1] <= 0 && heroesHealth[2] <= 0) {
            System.out.println("Boss won!!!");
            return true;
        }
        return false;
    }

    public static void bossHit() {
        for (int i = 0; i < heroesHealth.length; i++) {
            heroesHealth[i] = heroesHealth[i] - bossDamage;

        }
    }

    public static void heroesHit() {
        for (int i = 0; i < heroesDamage.length; i++) {
            bossHealth = bossHealth - heroesDamage[i];

        }
    }


    public static void printStatistic() {
        System.out.println("____________________________");
        System.out.println("Boss health" + bossHealth);
        System.out.println("Warrior health" + heroesHealth[0]);
        System.out.println("Magic health" + heroesHealth[1]);
        System.out.println("Kinetik health" + heroesHealth[2]);
        System.out.println("Lekar health" + heroesHealth[3]);
        System.out.println("______________________________");

    }


    public static void Lekar(){
        if ((heroesHealth[0] >= 0 || heroesHealth[1] >= 0 || heroesHealth [2] >= 0 || heroesHealth[3] >= 0) && (heroesHealth[0]<= 100 || heroesHealth[1]<= 100 || heroesHealth[2] <= 100)) {
            Random r = new Random();
            int randomNumber = r.nextInt(3);
            switch (randomNumber) {
                case 0:
                    heroesHealth[0] = heroesHealth[0] + medicalHealth;
                    System.out.println("Medic helped" + heroesAttackType[0]);
                    break;

                case 1:
                    heroesHealth[1] = heroesHealth[1] + medicalHealth;
                    System.out.println("Medic helped" + heroesAttackType[1]);
                    break;

                case 2:
                    heroesHealth[2] = heroesHealth[2] + medicalHealth;
                    System.out.println("Medic helped" + heroesAttackType[2]);
                    break;

            }
        }
    }


}





