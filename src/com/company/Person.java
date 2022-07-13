package com.company;

public class Person {

    private String name;
   private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    void method1(){
        System.out.println("");
    }
    void method2(){
        System.out.println("");;
    }
    void method3(){
        System.out.println("");;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;}

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = '" + name + '\'' +
                ", designation = '" + designation + '\'' +", "
                ;
    }


}
