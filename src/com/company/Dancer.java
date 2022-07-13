package com.company;

public class Dancer extends Person {

    private String groupName;

    public Dancer(String name, String designatoion,String groupName ){
        super(name,designatoion);
        this.groupName=groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    void learn(){
        System.out.print("She can learn, ");
    }
    void walk(){
        System.out.print("walk, ");;
    }
    void eat(){
        System.out.print("eat, ");;
    }
    void dancing(){
        System.out.print("dancing ");
    }

    @Override
    public String toString() {
        return "\n"+super.toString()+
                "groupName='" + groupName + '\'' +
                '}';
    }
}
