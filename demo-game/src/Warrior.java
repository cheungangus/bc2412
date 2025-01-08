public class Warrior extends Hero {
    private String role;
    private int pa; // Physical Attack
    private int pd; // Physical Defense
    private int ma; // Magical Attack
    private int md; // Magical Defense
    private String cc; // Critical Damage Chance
    private int cd; // Critical Damage
    private int ag; //agility
    private int maxHP;
    private int maxMP;


    public Warrior(  int hp, int mp, int level, String id,
    int maxHP, int maxMP, String role, int pa, 
    int pd, int ma, int md, String cc,int cd,int ag ) {
        
        super (hp, mp, level, id);
        this.role = "Archer";
        this.maxHP= maxHP;
        this. maxMP = maxMP;
        this.pa =pa;        this.pd = pd;
        this.ma =ma;        this.md=md;
        this.cc=cc;         this.cd=cd;
        this.ag=ag;         
    }
// set ==================================================
    public void setRole(){
        this.role = role;
    }
    public void setpa(){
        this.pa = pa;
    }
    public void setpd(){
        this.pd = pd;
    }
    public void setMa(){
        this.ma = ma;
    }
    public void setMd(){
        this.md = md;
    }
    public void setcc(){
        this.cc = cc;
    }
    public void setCd(){
        this.cd = cd;
    }
    public void setAg(){
        this.ag = ag;
    }
    public void setMaxHP(){
        this.maxHP = maxHP;
    }
    public void setMaxMP(){
        this.maxMP = maxMP;
    }
// get ==================================================
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
    
    public int getMaxHP(){
        return this.maxHP;
    }
   
    public int getMaxMP(){
        return this.maxMP;
    }
// ==================================================
    public void levelUp(){
            // setMp(getMp() + 10);
            // setHp(getHp() + 10);
            this.maxHP += 80;
            this.maxMP += 50;
            this.pa += 5;        
            this.pd += 5;
            this.ma += 5;        
            this.md += 5;
            this.cd += 5;
            this.ag += 10;
    }
// ==================================================

    public static void main(String[] args) {
        
        Warrior warrior = new Warrior(100,100,1,"C32113",100,100,
        "Warrior",50,50,10,20,"30%",100,80); 

        System.out.println("Role: " + warrior.getRole());
        System.out.println("Level: " + warrior.getLevel());
//Basic status: 
        System.out.println("HP: "+ warrior.getHp());
        System.out.println("MP: " + warrior.getMp());
        System.out.println("Max HP: " + warrior.getMaxHP());
        System.out.println("Max HP: " + warrior.getMaxMP());
        System.out.println("physical Attrack: " + warrior.getPa());
        System.out.println("physical defence: " + warrior.getPd());
        System.out.println("Magical Attack: " + warrior.getMa());
        System.out.println("Magical defense: " + warrior.getMd());
        System.out.println("Critical Damage Chance: " + warrior.getCc());
        System.out.println("Critical Damage: " + warrior.getCd());
        System.out.println("Agility : " + warrior.getAg());
        System.out.println("========================================");
// After LevelUp;
        warrior.levelUp();
        System.out.println("HP: "+ warrior.getHp());
        System.out.println("MP: " + warrior.getMp());
        System.out.println("Max HP: " + warrior.getMaxHP());
        System.out.println("Max HP: " + warrior.getMaxMP());
        System.out.println("physical Attrack: " + warrior.getPa());
        System.out.println("physical defence: " + warrior.getPd());
        System.out.println("Magical Attack: " + warrior.getMa());
        System.out.println("Magical defense: " + warrior.getMd());
        System.out.println("Critical Damage Chance: " + warrior.getCc());
        System.out.println("Critical Damage: " + warrior.getCd());
        System.out.println("Agility : " + warrior.getAg());
        System.out.println("========================================");

        
    }

}
// HP = 100
// MP =100
// Max Hp = 100 +80
// Max MP = 100 +50
// id = "C32113"
// Physical Attack = 50
// Physical defense = 50
// Magical Attack = 10
// Magical defense  =20
// Critical Damage Chance = 30%
// Critical Damage = + 100
// Agility = 80
