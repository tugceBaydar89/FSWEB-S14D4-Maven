package org.example.rpg;

public class Main {

    public static void main(String[] args) {


    Monster shrek = new Troll ("shrek",5,8);
    Monster wolf = new Warewolf("wolf",6,9);

    printAttack(shrek);
    printAttack(wolf);
    }


    private static void printAttack(Monster monster) {
        System.out.println("attack " + monster.getName() + monster.attack());
    }


}
