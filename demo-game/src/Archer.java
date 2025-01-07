
import javax.management.relation.Role;

public class Archer extends Hero {
    private String role;
    private int pa; // Physical Attack
    private int pd; // Physical Defense
    private int ma; // Magical Attack
    private int md; // Magical Defense
    private String cc; // Critical Damage Chance
    private int cd; // Critical Damage
    private int ag; //agility


    public Archer(  int hp, int mp, int level, String id,
                    String role, int pa, int pd,int ma, 
                    int md, String cc,int cd,int ag) {
        
        super(hp, mp, level, id);
        this.role = "Archer";
        this.pa =pa;        this.pd = pd;
        this.ma =ma;        this.md=md;
        this.cc=cc;         this.cd=cd;
        this.ag=ag;
    }

    public String getRole(){
        return this.role;
    }
    public int getPa(){
        return this.pa;
    }
    public int getPd(){
        return this.pd;
    }
    public int getMa(){
        return this.ma;
    }
    public int getMd(){
        return this.md;
    }
    public String getCc(){
        return this.cc;
    }
    public int getCd(){
        return this.cd;
    }
    public int getAg(){
        return this.ag;
    }

    public void levelUp(String role){
        if(role.equals ("Archer")){
            this.level += 1;
            this.pa += 5;        
            this.pd += 5;
            this.ma += 5;        
            this.md += 5;
            this.cd += 5;
            this.ag += 10;
        }
    }


    public static void main(String[] args) {
        Archer archer = new Archer( 100,100,1,"A12312","Archer", 
        30,30,20,30,"70%",70,100); //
        
         System.out.println("Role: " + archer.getRole());
         System.out.println("HP: "+ archer.getHp());
         System.out.println("MP: " + archer.getMp());
         System.out.println("Level: " + archer.getLevel());
         System.out.println("physical Attrack: " + archer.getPa());
         System.out.println("physical defence: " + archer.getPd());
         System.out.println("Magical Attack: " + archer.getMa());
         System.out.println("Magical defense: " + archer.getMd());
         System.out.println("Critical Damage Chance: " + archer.getCc());
         System.out.println("Critical Damage: " + archer.getCd());
         System.out.println("Agility : " + archer.getAg());
         System.out.println("=================");
         
    }

}
// Archer
// HP = 100
// MP = 100
// Max HP + 50
// Max MP + 60
// id = A12312
// Physical Attack = 30
// Physical defense = 30
// Magical Attack = 20
// Magical defense  =30
// Critical Damage Chance = 70%
// Critical Damage = + 70
// Agility = 100
