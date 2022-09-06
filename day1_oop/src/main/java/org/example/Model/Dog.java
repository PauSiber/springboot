package org.example.Model;

public class Dog  extends Animal implements IAnimal {

    private int bacakSayisi;

    private String kuyrukRengi;

    private boolean tuyuVarmi;

    public Dog(String name, Integer age, boolean isAlive) {
        super(name, age, isAlive);
    }

    public Dog(String name, Integer age, boolean isAlive, int bacakSayisi, String kuyrukRengi, boolean tuyuVarmi){
        super(name,age,isAlive);
        this.bacakSayisi = bacakSayisi;
        this.kuyrukRengi = kuyrukRengi;
        this.tuyuVarmi = tuyuVarmi;
    }

    @Override
    public void sesCikar(){
        System.out.println("Köpek Havlıyor.");
    }

    public int getBacakSayisi() {
        return bacakSayisi;
    }

    public void setBacakSayisi(int bacakSayisi) {
        this.bacakSayisi = bacakSayisi;
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
    public void yasHesapla() {
        System.out.println("Küçük gözüküyor, yaşı 4ten küçük ama 2den büyük.");
    }
}
