public abstract class Hero  {
//Mage 
//Warrior
//Archer

    private int hp; // health point
    private int mp; // magic point
    private int level;
    private String id;
   

    // static final
    //private int maxHP
    //private int maxMP

    // level 
    // attacPower

    public Hero(
    int hp, int mp, int level, String id){
        
        this.id = id;       this.hp = hp;
        this.mp = mp;       this.level = level;
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
    

    // Method:
    // Presentation: isAlive
    // Action : level up : +MaxHp, MaxMp()

    //Hero is parent class
    // child class: Archer, Mage, Warrior

    //attackPower
    //Weapon,  
    
}

