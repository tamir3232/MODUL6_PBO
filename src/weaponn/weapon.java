package weaponn;

public class weapon {
    private int attackP;
    public weapon( int attackP){
       
        this.attackP = attackP;
    }
    
    public int getAttackP(){
        return this.attackP;
    }
    public class Type{
        public String nama;
        public Type(String nama){
            this.nama = nama;
        }
        public String getnama(){
            return this.nama;
        }

    }
}
