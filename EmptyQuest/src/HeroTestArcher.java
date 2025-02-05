public class HeroTestArcher extends HeroTest {
    private int level; //
    private int pa; // Physical Attack
    private int pd; // Physical Defense
    private int ma; // Magical Attack
    private int md; // Magical Defense
    private String cc; // Critical Damage Chance
    private int cd; // Critical Damage
    private int ag; // agility
        public HeroTestArcher(int level, int pa, int pd, int ma, int md, String cc,int cd,int ag){

            super("Archer","123121",1,1000,1000,1000,1000);
            this.level = level;
            this.pa = pa;        
            this.pd = pd;
            this.ma = ma;        
            this.md = md;
            this.cc = cc;         
            this.cd = cd;
            this.ag = ag;  
        }
    public void setLevel(int level){
        this.level = level;
    }
    public int getLevel(){
        return level;
    }
    public void setPa(int pa){
    this.pa = pa;
    }
    public int getPa(){
        return pa;
    }
    public void setPd(int pd){
        this.pd = pd;
    }

    public int getPd(){
        return pd;
    }
    public void setMa(int ma){
        this.ma = ma;
    }
    public int getMa(){
        return ma;
    }
    public void setMd(int md){
        this.md = md;
    }
    public int getMd(){
        return md; 
    } 
    public void setCc(String cc){
        this.cc = cc;
    }
    public String getCc(){
        return cc;
    }
    public void setCd(int cd){
        this.cd = cd;
    }
    public int getCd(){
        return cd;
    }
    public void setAg(int Ag){
        this.ag = ag;
    }
    public int getAg(){
        return ag;
    }
    public void SetRole(int Ag){
        this.ag = ag;
    }
    

    // public void showArcherInfo(){
    //     System.out.println("level : " + getLevel());
    //     System.out.println("Physical Attack : " + getPa());
    //     System.out.println("Physical Defense : " + getPd());
    //     System.out.println("Magical Attack : " + getMa());
    //     System.out.println("Magical Defense : " + getMd());
    //     System.out.println("Critical Damage Chance : " + getCc());
    //     System.out.println("Critical Damage : " + getCd());
    //     System.out.println("Agility : " + getAg());

    // }

    @Override
    public void showArcherInfo() {
        super.showArcherInfo();
        System.out.println("Level: " + level + "\n" + "Physical Attack: " + pa + "\n"+
                           "Physical Defense: " + pd + "\n" + "Magical Attack: " + ma +  "\n"+
                           "Magical Defense: " + md + "\n" + "Critical Damage Chance : "+ cc + "\n"+
                           "Critical Damage: " + cd + "\n" + "Agility : " + ag);
    }
    public String levelUp(){
                    this.level++;
                    setHp(getHp() + 50);
                    setMp(getMp() + 50);
                    setMaxhp(GetMaxhp() + 50);
                    setMaxmp(GetMaxmp() + 50);
                    this.pa += 5;        
                    this.pd += 5;
                    this.ma += 5;        
                    this.md += 5;
                    this.cd += 7;
                    this.ag += 10;
                    return "Archer leveled up to Level " + level;
    }
         
    public static void main(String[] args) {
        
        HeroTest a1 = new HeroTest("Archer", "A123121",1, 1000, 1000, 1000, 1000);
        HeroTestArcher a2 = new HeroTestArcher(1,100, 110, 120, 130, "140%", 150, 160);
        
        a2.showArcherInfo();
        a2.levelUp();
    }
}
