package org.example.Model;

public class Animal {

    private String name;

    private Integer age;

    private boolean isAlive;


    public Animal(String name, Integer age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }


    public void sesCikar(){
        System.out.println("Hayvan ses çıkarıyor.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }


}
