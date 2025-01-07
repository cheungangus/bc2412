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
    int hp, int mp, int level,  
    String id){
        
        this.id = id;       this.hp = hp;
        this.mp = mp;       this.level = level;
        
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
    public String getId(){
        return this.id;
    }
   

    // Method:
    // Presentation: isAlive
    // Action : level up : +MaxHp, MaxMp()

    //Hero is parent class
    // child class: Archer, Mage, Warrior

    //attackPower
    //Weapon,  
    
}

