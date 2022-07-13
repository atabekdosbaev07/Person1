package com.company;

public class Programmer extends Person {

    private String companyName;


    public Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.companyName=companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }



    void learn(){
        System.out.print("He can learn");
    }
    void walk(){
        System.out.print(", walk");;
    }
    void eat(){
        System.out.print(", eat");;
    }
    void coding(){
        System.out.print(", coding");

    }



    @Override
    public String toString() {
        return  super.toString()+
                "companyName='" + companyName + '\'' +
                '}';
    }
}
