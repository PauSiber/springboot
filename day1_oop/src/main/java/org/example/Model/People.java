package org.example.Model;

import java.util.ArrayList;

public class People {

    private final Integer bacakSayisi = 4;



    private String name;

    private String surname;

    private Integer age;

    private String job;

    private String gender;

    static Profile[] profiles = new Profile[10];


    public People(String name, String surname, Integer age, String job, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.job = job;
        this.gender = gender;
    }

    public People(String name, String surname, Integer age, String job) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.job = job;
    }

    public People() {
    }

    public void Walk() {
        System.out.println("Insan yürüyor.");
    }

    public void Talk() {
        System.out.println("İnsan konusuyor");
    }


    public void tanimla() {
        System.out.println("People{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", gender='" + gender + '\'' +
                '}');
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static Profile[] getProfiles() {
        return profiles;
    }

    public static void setProfiles(Profile[] profiles) {
        People.profiles = profiles;
    }
}
