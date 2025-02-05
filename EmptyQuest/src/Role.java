
import java.util.Random;

public class Role {
   private String name;
   private int blood;
   private char gender;
   private String face; //長相隨機

   String[] boyFaces = {"英俊瀟灑", "氣宇軒昂" , "相貌英俊" , "五官端正" ,"相貌平平" , "一塌糊塗" , "面目猙獰"};
   String[] girlFaces = {"金碧輝煌", "沈魚落雁", "亭亭玉立", "身材姣好", "相貌平平", "相貌簡陋", "慘不忍睹",};

   //attack 攻擊描述  // %s 佔位符 -> 一個佔位符要有一個填充數據
   String[] attacks_desc = {
    "%s使出了一招【背心訂】,轉到對方的身後,一掌向%s背心的靈台穴拍去。",
    "%s使出了一招【游空探爪】,飛起身形自半空中變掌為抓鎖向%s。",
    "%s大喝一聲,身形下伏,一招【劈雷墜地】,捶向%s雙腿。",
    "%s運氣於掌,一瞬間掌心變得血紅,一式【掌心雷】，推向%s。",
    "%s陰手翻起陽手跟進,一招【沒遮攔】,結結實實的捶向%s。",
    "%s上步搶身,招中套招,一招【劈掛連環】,連環攻向%s。",
   };

   //injured 受傷描述
   String[] injureds_desc = {
    "結果%s退了半步,毫髮無損",
    "結果給%s造成一處瘀傷", 
    "結果一擊命中,%s痛得彎下腰",
    "結果%s痛苦地悶哼了一聲,顯然受了點內傷",     
    "結果%s搖搖晃晃,一跤摔倒在地",     
    "結果%s臉色一下變得慘白,連退了好幾步",     
    "結果「轟」的一聲,%s口中鮮血狂噴而出",     
    "結果%s一聲慘叫,像灘軟泥塌了下去",     
   };


   public Role(){

   }

   public Role(String name, int blood, char gender, String face){
    this.name = name;
    this.blood = blood;
    this.gender = gender;
    //隨機長相
    setFace(gender);
}

   public void setName(String name){
    this.name = name;
   }
   public String getName(){
    return name;
   }
   public void setBlood(int blood){
    this.blood = blood;
   }
   public int getBlood(){
    return blood;
   }
   public void setGender(char gender){
    this.gender = gender;
   }
   public char getGender(){
    return gender;
   }

   public void setFace(char gender){
    Random r = new Random();
    if(gender == '男'){
        //從boy faces裡面隨機
        int index = r.nextInt(boyFaces.length);
        this.face = boyFaces[index];
    } else if (gender == '女') {
        // 從girl faces裡面隨機
        int index = r.nextInt(girlFaces.length);
        this.face = girlFaces[index];
    } else {
        this.face = "面目猙獰";
    }
    this.face = face;
   }
   
   public String getFace(){
    return face;
   }

   // 定義方法用於攻擊
   // 誰攻擊誰？ 
   // Role r1 = new role();
   // Role r2 = new role();
   // r1.attack (r2);
   public void attack(Role role){
    Random r = new Random();
    int index = r.nextInt(attacks_desc.length);
    String KungFu = attacks_desc[index];

    //輸出攻擊的效果
    System.out.printf(KungFu,this.getName(),role.getName());
    System.out.println();

    //計算造成的傷害 1- 20
    int hurt = r.nextInt(20) + 1;
    //剩餘血量
    int remainBlood = role.getBlood() - hurt;
    remainBlood =  remainBlood < 0 ? 0 : remainBlood; // 三元運算符
    // 修改挨揍的人的血量
    role.setBlood(remainBlood);

    // 受傷的描述
    // 血量 >  90 0索引的描述
    // 80 - 90 1索引的描述
    // 70 - 80 2索引的描述
    // 60 - 70 3索引的描述
    // 40 - 60 4索引的描述
    // 20 - 40 5索引的描述
    // 10 - 20 6索引的描述
    // 小於10的 7索引的描述
    if (remainBlood > 90) {
        System.out.printf(injureds_desc[0],role.getName());
    }else if(remainBlood > 80 && remainBlood <= 90){
        System.out.printf(injureds_desc[1],role.getName());
    }else if(remainBlood > 70 && remainBlood <= 80){
        System.out.printf(injureds_desc[2],role.getName());
    }else if(remainBlood > 60 && remainBlood <= 70){
        System.out.printf(injureds_desc[3],role.getName());
    }else if(remainBlood > 40 && remainBlood <= 60){
        System.out.printf(injureds_desc[4],role.getName());
    }else if(remainBlood > 20 && remainBlood <= 40){
        System.out.printf(injureds_desc[5],role.getName());
    }else if(remainBlood > 10 && remainBlood <= 20){
        System.out.printf(injureds_desc[6],role.getName());
    }else {
        System.out.printf(injureds_desc[7],role.getName());
    }

    
   }
    public void showRoleInfo(){
        System.out.println("姓名為 : " + getName());
        System.out.println("血量為 : " + getBlood());
        System.out.println("性別為 : " + getGender());
        System.out.println("長相為 : " + getFace());

    }
}

