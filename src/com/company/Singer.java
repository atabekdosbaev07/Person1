package com.company;

public class Singer extends Person {

    private String bandName;

    public Singer(String name, String designation,String bandName) {
        super(name, designation);
        this.bandName=bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    void learn(){
        System.out.print("He can learn, ");
    }
    void walk(){
        System.out.print("walk, ");;
    }
    void eat(){
        System.out.print("eat, ");;
    }
    void singing(){
        System.out.print("singing, ");
    }
    void playGuitar(){
        System.out.print("play on Guitar ");
    }


    @Override
    public String toString() {
        return "\n"+super.toString()+
                "bandName='" + bandName + '\'' +
                '}';
    }
}
