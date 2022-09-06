package org.example;

import org.example.Model.Animal;
import org.example.Model.Cat;
import org.example.Model.Dog;
import org.example.Model.People;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!1" );

        /*People enes = new People("enes","kaya",21,"Öğrenci","Erkek");

        People asude = new People("asude","fışkın",21,"öğrenci");

        People havva = new People();

        People serdar = new People();

        havva.tanimla();

        asude.tanimla();

        enes.Talk();

        enes.Walk();

        enes.tanimla();

        System.out.println("*****************************************************");

        System.out.println(asude.getAge());

        asude.setAge(20);

        asude.setGender("Kadın");

        System.out.println(asude.getAge());

        havva.setName("Havva");
        System.out.println(havva.getName());*/

        Animal animal = new Animal("Karabaş",4,true);

        animal.sesCikar();

        Cat kedi = new Cat("Tekir",5,true,"Sarı",true);

        kedi.sesCikar();


        Cat.setGozRengi("kırmızı");

       Integer sayi = 5;

       Double ondalikliSayi = 10.00;









        Dog kopek = new Dog("Kopek",3,true,4,"siyah",true);

        kopek.sesCikar();


        System.out.println(kedi.toString());

        kopek.yasHesapla();


    }
}
