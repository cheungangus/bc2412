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
    int Maxhp , int Maxmp, String role, int pa, 
    int pd, int ma, int md, String cc,int cd,int ag ) {
        
        super (hp, mp, level, id,Maxhp,Maxmp);
        this.role = "Archer";
       
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
    
   
// ==================================================
    public void levelUp(){
            setLevel(getLevel() + 1);
            setHp(getHp() + 50);
            setMp(getMp() + 50);
            setMaxHp(getMaxHP() + 50);
            setMaxMp(getMaxMP() + 50);
            this.pa += 5;        
            this.pd += 5;
            this.ma += 5;        
            this.md += 5;
            this.cd += 5;
            this.ag += 10;
            // this.cc += 2 ; // how to 70.1% ?
            
    }
// ==================================================

    public static void main(String[] args) {
        
        Archer archer = new Archer(100,100,1,"A12312",100,100,
        "Archer",30,30,20,30,"70%",70,100); 
        
        System.out.println("Role: " + archer.getRole()); // Archer
        System.out.println("Level: " + archer.getLevel()); // 1 
//Basic status: 
        System.out.println("HP: "+ archer.getHp()); // 100
        System.out.println("MP: " + archer.getMp()); // 100
        System.out.println("MaxHP: " + archer.getMaxHP()); // 100
        System.out.println("MaxMP: " + archer.getMaxMP()); // 100
        System.out.println("physical Attrack: " + archer.getPa());  // 30
        System.out.println("physical defence: " + archer.getPd()); // 30 
        System.out.println("Magical Attack: " + archer.getMa()); // 20
        System.out.println("Magical defense: " + archer.getMd()); // 30
        System.out.println("Critical Damage Chance: " + archer.getCc()); // 70%
        System.out.println("Critical Damage: " + archer.getCd()); // 70
        System.out.println("Agility : " + archer.getAg()); // 100
        System.out.println("========================================");
// After LevelUp; 1 -> 2
        archer.levelUp();
        System.out.println("Level: " + archer.getLevel()); //2
        System.out.println("HP: "+ archer.getHp()); // 150
        System.out.println("MP: " + archer.getMp()); // 150
        System.out.println("MaxHP: " + archer.getMaxHP()); // 150
        System.out.println("MaxMP: " + archer.getMaxMP()); // 150
        System.out.println("physical Attrack: " + archer.getPa()); //35
        System.out.println("physical defence: " + archer.getPd()); //35
        System.out.println("Magical Attack: " + archer.getMa());  //25
        System.out.println("Magical defense: " + archer.getMd()); // 35
        System.out.println("Critical Damage Chance: " + archer.getCc()); //70%
        System.out.println("Critical Damage: " + archer.getCd()); // 75
        System.out.println("Agility : " + archer.getAg()); //110
        System.out.println("========================================");

    }

}
// Archer
// HP = 100
// MP = 100
// Max HP = 100 + 50
// Max MP = 100 + 50
// id = A12312
// Physical Attack = 30
// Physical defense = 30
// Magical Attack = 20
// Magical defense  =30
// Critical Damage Chance = 70%
// Critical Damage = + 70
// Agility = 100

// private static final int[] ARC_MAX_HP_TAB;
// private static final int[] WAR_MAX_HP_TAB;
// private static final int[] MAG_MAX_HP_TAB;


// static{
//     ARC_TAB = new int[] {1,2,3,4,5,6,7,8,9,10};
//     WAR_TAB = new int[] {1,2,3,4,5,6,7,8,9,10};
//     MAG_TAB = new int[] {1,2,3,4,5,6,7,8,9,10};
// }
// public static int getMaxHP(Role role, int level){
//     switch(role){
//         case ARCHER:
//         return ARC_MAX_HP_TAB;[levle - 1];
//         case WARRIOR:
//         return WAR_MAX_HP_TAB;[level - 1];
//         case MAGE:
//         return MAG_MAX_HP_TAB;[level - 1];
//         default:
//         break;
//     }
//     return -1;
// }
