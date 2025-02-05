public class HeroTest {
    private String role;
    private String id;
    private int level;
    private int hp;
    private int mp;
    private int Maxhp;
    private int Maxmp;
    public HeroTest(){

    }

    public HeroTest( 
        String role, String id,int level, int hp, int mp, int Maxhp, int Maxmp){
        this.role = role;
        this.id = id;
        this.level = level;
        this.hp = hp;
        this.mp = mp;
        this.Maxhp = Maxhp;
        this.Maxmp = Maxmp;
    }
    public void SetRole(String role){
        this.role = role;
    }
    public String getRole(){
        return role;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
    public void setLevel(int level){
        this.level=level;
    }
    public int getLevel(){
        return level;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public int getHp(){
        return hp;
    }
    public void setMp(int mp){
        this.mp = mp;
    }
    public int getMp(){
        return mp;
    }
    public void SetMaxhp(int Maxhp){
        this.Maxhp = Maxhp;
    }
    public int GetMaxhp(){
        return Maxhp;
    }
    public void SetMaxmp(int Maxmp){
        this.Maxmp = Maxmp;
    }
    public int GetMaxmp(){
        return Maxmp;
    }

    public void showArcherInfo(){
        System.out.println("Role : " + getRole());
        System.out.println("Id : " + getId());
        System.out.println("Hp : " + getHp());
        System.out.println("Mp : " + getMp());
        System.out.println("MaxHp : " + GetMaxhp());
        System.out.println("MaxMp : " + GetMaxmp());   
     }

}

