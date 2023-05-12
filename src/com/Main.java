package com;
import java.util.jar.Attributes.Name;
import weaponn.*;
import class_hero.*;
import weaponn.weapon.Type;

public class Main {
    public static void main(String[] args) {

        // deklarasi hero
        Herosihir hero1 = new Herosihir("Sotong",100,20,4,5,"sarung");
        //deklarasi senjata utama
        weapon AXE = new weapon(10);
        weapon SWORD = new weapon(29);
        //deklarasikan Senjata Inner
        Type FIREAXE = AXE.new Type("Kapak Api");
        //innerclass namaobjekbaru = objekutama.new innerclass

    
        // hero1.equip(AXE);
        // hero1.display();
        // hero1.Attack(200);
    }
}