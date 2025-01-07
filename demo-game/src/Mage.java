public class Mage extends Hero {
    private String role;
    private int pa; // Physical Attack
    private int pd; // Physical Defense
    private int ma; // Magical Attack
    private int md; // Magical Defense
    private String cc; // Critical Damage Chance
    private int cd; // Critical Damage
    private int agility; 


    public Mage(    int hp, int mp, int level, String id,
                    String role, int pa, int pd,int ma, 
                    int md, String cc,int cd,int agility) {
        
        super(hp, mp, level, id);
        this.role = "Mage";
        this.pa =pa;        this.pd = pd;
        this.ma =ma;        this.md=md;
        this.cc =cc;         this.cd=cd;
        this.agility=agility;
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
    public int getAgility(){
        return this.agility;
    }

    
    public void levelUp(){
        
    }

    public static void main(String[] args) {
        Mage mage = new Mage( 100,100,1,"B23112","Mage",
        10,10,60,40,"50%",80,50 );//
        
         System.out.println("Role: " + mage.getRole());
         System.out.println("Level: " + mage.getLevel());
         System.out.println("physical Attrack: " + mage.getPa());
         System.out.println("physical defence: " + mage.getPd());
         System.out.println("Magical Attack: " + mage.getMa());
         System.out.println("Magical defense: " + mage.getMd());
         System.out.println("Critical Damage Chance: " + mage.getCc());
         System.out.println("Critical Damage: " + mage.getCd());
         System.out.println("Agility : " + mage.getAgility());
    }

}

// HP = 100
// MP =100
// Max Hp = +70
// Max MP = +80
// id = B23112
// Physical Attack = 10
// Physical defense = 10
// Magical Attack = 60
// Magical defense  =40
// Critical Damage Chance = 50%
// Critical Damage = + 80
// Agility = 50