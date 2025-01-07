public class Warrior extends Hero {
    private String role;
    private int pa; // Physical Attack
    private int pd; // Physical Defense
    private int ma; // Magical Attack
    private int md; // Magical Defense
    private String cc; // Critical Damage Chance
    private int cd; // Critical Damage
    private int agility; 


    public Warrior(    int hp, int mp, int level, String id,
                    String role, int pa, int pd,int ma, 
                    int md, String cc,int cd,int agility) {
        
        super(hp, mp, level, id);
        this.role = "Warrior";
        this.pa =pa;        this.pd = pd;
        this.ma =ma;        this.md=md;
        this.cc=cc;         this.cd=cd;
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
        Warrior warrior = new Warrior( 100,100,1,"C32113","Warrior",
        50,50,10,20,"30%",100,80);//
        
         System.out.println("Role: " + warrior.getRole());
         System.out.println("Level: " + warrior.getLevel());
         System.out.println("physical Attrack: " + warrior.getPa());
         System.out.println("physical defence: " + warrior.getPd());
         System.out.println("Magical Attack: " + warrior.getMa());
         System.out.println("Magical defense: " + warrior.getMd());
         System.out.println("Critical Damage Chance: " + warrior.getCc());
         System.out.println("Critical Damage: " + warrior.getCd());
         System.out.println("Agility : " + warrior.getAgility());

    }

}

// HP = 100
// MP =100
// Max Hp = +80
// Max MP = +60
// id = "C32113"
// Physical Attack = 50
// Physical defense = 50
// Magical Attack = 10
// Magical defense  =20
// Critical Damage Chance = 30%
// Critical Damage = + 100
// Agility = 80
