package abstrak;
import Interface.Hero_interface;
import weaponn.weapon;
public abstract class Hero implements Hero_interface { // adalah paretn class
    private String name; // tidak berbeda dengan public string name
    private int hp;
    public int mana;
    private int defenseP;
    private int nambahdarah = 5;
    private weapon weapon;

    public Hero(String nama, int hp,int mana,int defenseP){
        this.name = nama;
        this.hp = hp;
        this.mana = mana;
        this.defenseP = defenseP;
    }

    public void equip(weapon weapon){
        this.weapon = weapon;
    }
    public void Attack(){
        System.out.println(this.name+" menyerang ");
    }
    public void nambahDarah(){
        sethp(this.nambahdarah);
    }

    private void sethp(int nilai){
        this.hp = this.hp+nilai;
    }
    public int gethp(){
        return this.hp;
    }
    public String getname(){
        return this.name;
    }
    public void display(){
        System.out.println("NAMA : "+ this.name);
        System.out.println("health  : "+ this.hp);
        System.out.println("mana    : "+ this.mana);
        // System.out.println("weapon  : "+this.weapon.getnama());
        System.out.println("attack Power : "+this.weapon.getAttackP());
        System.out.println("Defense : "+ this.defenseP);
    }
}
