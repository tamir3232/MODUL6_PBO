package class_hero;
import abstrak.Hero;

public class Herosihir extends Hero{
    String Armor;
    public Herosihir(String nama, int hp,int mana,int attackP,int defenseP, String Weapon){
        super(nama,hp,mana,defenseP);
    }
    public void Attack(int attackP){ 
        System.out.println(getname()+" menyerang dengan kekuatan "+attackP);
    }
}