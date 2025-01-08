public class Mage extends Hero {
    private String role;
    private int pa; // Physical Attack
    private int pd; // Physical Defense
    private int ma; // Magical Attack
    private int md; // Magical Defense
    private String cc; // Critical Damage Chance
    private int cd; // Critical Damage
    private int ag; // agility
    private int maxHP;
    private int maxMP;


    public Mage(  int hp, int mp, int level, String id,
    int maxHP, int maxMP, String role, int pa, 
    int pd, int ma, int md, String cc,int cd,int ag ) {
        
        super (hp, mp, level, id);
        this.role = "Mage";
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
        this.maxHP += 50;
        this.maxMP += 80;
        this.pa += 5;        
        this.pd += 5;
        this.ma += 5;        
        this.md += 5;
        this.cd += 5;
        this.ag += 10;
}
// ==================================================

    public static void main(String[] args) {
        Mage mage = new Mage(100,100,1,"B23112",100,100,
        "Mage",10,10,60,40,"50%",80,50);
        
    
         System.out.println("Role: " + mage.getRole());
         System.out.println("Level: " + mage.getLevel());
         System.out.println("physical Attrack: " + mage.getPa());
         System.out.println("physical defence: " + mage.getPd());
         System.out.println("Magical Attack: " + mage.getMa());
         System.out.println("Magical defense: " + mage.getMd());
         System.out.println("Critical Damage Chance: " + mage.getCc());
         System.out.println("Critical Damage: " + mage.getCd());
         System.out.println("Agility : " + mage.getAg());
         System.out.println("========================================");

         // After LevelUp;
        mage.levelUp();
        System.out.println("HP: "+ mage.getHp());
        System.out.println("MP: " + mage.getMp());
        System.out.println("Max HP: " + mage.getMaxHP());
        System.out.println("Max HP: " + mage.getMaxMP());
        System.out.println("physical Attrack: " + mage.getPa());
        System.out.println("physical defence: " + mage.getPd());
        System.out.println("Magical Attack: " + mage.getMa());
        System.out.println("Magical defense: " + mage.getMd());
        System.out.println("Critical Damage Chance: " + mage.getCc());
        System.out.println("Critical Damage: " + mage.getCd());
        System.out.println("Agility : " + mage.getAg());
        System.out.println("========================================");

    }

}

// HP = 100
// MP =100
// Max Hp = 100 +50
// Max MP = 100 +80
// id = B23112
// Physical Attack = 10
// Physical defense = 10
// Magical Attack = 60
// Magical defense  =40
// Critical Damage Chance = 50%
// Critical Damage = + 80
// Agility = 50