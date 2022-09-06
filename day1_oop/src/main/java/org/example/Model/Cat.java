package org.example.Model;

import java.util.ArrayList;

public class Cat extends Animal{

    static String gozRengi;

    private String kuyrukRengi;

    private boolean tuyuVarmi;

    public Cat(String name, Integer age, boolean isAlive, String kuyrukRengi, boolean tuyuVarmi) {
        super(name, age, isAlive);
        this.kuyrukRengi = kuyrukRengi;
        this.tuyuVarmi = tuyuVarmi;
    }

    public String getKuyrukRengi() {
        return kuyrukRengi;
    }

    public void setKuyrukRengi(String kuyrukRengi) {
        this.kuyrukRengi = kuyrukRengi;
    }

    public boolean isTuyuVarmi() {
        return tuyuVarmi;
    }

    public void setTuyuVarmi(boolean tuyuVarmi) {
        this.tuyuVarmi = tuyuVarmi;
    }

    @Override
    public void sesCikar() {
        System.out.println("Kedi Miyavlıyor");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "kuyrukRengi='" + kuyrukRengi + '\'' +
                ", tuyuVarmi=" + tuyuVarmi +
                '}';
    }

    public static String getGozRengi() {
        return gozRengi;
    }

    public static void setGozRengi(String gozRengi) {
        Cat.gozRengi = gozRengi;
    }
}
