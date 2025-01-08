public abstract class Hero  {
//Mage 
//Warrior
//Archer

    private int hp; // health point
    private int mp; // magic point
    private int level;
    private String id;
    private int Maxhp;
    private int Maxmp;
   

    // static final
    //private int maxHP
    //private int maxMP

    // level 
    // attacPower

    public Hero(
    int hp, int mp, int level, String id, int Maxhp , int Maxmp){
        
        this.id = id;       this.hp = hp;
        this.mp = mp;       this.level = level;
        this.Maxhp = Maxhp; this.Maxmp = Maxmp;
    }
// set ==================================================
    public void setHp(int hp){
        this.hp = hp;
     }
    public void setMp(int mp){
        this.mp = mp;
     }
   public void setLevel(int level){
    this.level = level;
     }
     public void setMaxHp(int Maxhp){
        this.Maxhp = Maxhp;
    }
    public void setMaxMp(int Maxmp){
        this.Maxmp = Maxmp;
    }
// get ==================================================

    public String getId(){
        return this.id;
    }
    public int getHp(){
        return this.hp;
    }
    public int getMp(){
        return this.mp;
    }   
    public int getLevel(){
        return this.level;
    }
    public int getMaxHP(){
        return this.Maxhp;
    }
   
    public int getMaxMP(){
        return this.Maxmp;
    }

    private  final int MaxHp = 100;
}
// ==================================================

    
    // Method:
    // Presentation: isAlive
    // Action : level up : +MaxHp, MaxMp()

    //Hero is parent class
    // child class: Archer, Mage, Warrior

    //attackPower
    //Weapon,  
    


//
