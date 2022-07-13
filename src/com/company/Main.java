package com.company;

public class Main {
    public static void main(String[] args) {

        Programmer pro = new Programmer("Ruslan","Programmer","Sberbank");

        Dancer dan = new Dancer("Alina","Dancer","Shadow");
        Singer sing = new Singer("Nurlan","Singer","Lukas Gram");

        System.out.println(pro);
        pro.learn();pro.walk();pro.eat();pro.coding();
        System.out.println();
        System.out.println(dan);
        dan.learn();dan.walk();dan.eat();dan.dancing();
        System.out.println();
        System.out.println(sing);
        sing.learn();sing.walk();sing.eat();sing.singing();sing.playGuitar();


    }
}