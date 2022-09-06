package org.example.Model;

public class Papatya implements IBitki{
    @Override
    public void fotosentez() {
        System.out.println("Papatya fotosentez yapar.");
    }

    @Override
    public void buyume() {

        System.out.println("Papatya büyür.");

    }

    @Override
    public void sulama() {
        System.out.println("Papatyayı haftada en az 3 kere sulaman gerekir.");
    }
}
