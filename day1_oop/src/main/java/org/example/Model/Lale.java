package org.example.Model;

public class Lale implements IBitki, IAlive{
    @Override
    public void fotosentez() {
        System.out.println("Lale fotosentez yapmaz.");
    }

    @Override
    public void buyume() {
        System.out.println("Lale büyür");

    }

    @Override
    public void sulama() {

        System.out.println("Laleyi haftada 1 kere sulaman yeterli.");

    }

    @Override
    public void yasHesapla() {
        System.out.println("");
    }
}
