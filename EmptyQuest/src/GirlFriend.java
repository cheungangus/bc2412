public class GirlFriend {
    
//屬性 => 名詞
    private String name; //private = 私有關鍵字
    private int age;
    private String gender;

//有參(帶參)構造 -> 
    public GirlFriend(String name,int age ,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

// 空参(無參)的構造方法 -> 默認提供
    public GirlFriend(){ 
        // System.out.println("看看我執行了嗎");
    }

// set 賦值 : 給成員變量Name 賦值
    public void setName(String name){
        this.name = name;  // this.有就近原則 
    }

    public void setAge(int age){
    if(age >= 18 && age <= 50){
        this.age = age;
    } else{
        System.out.println("非法");
    }
   }

   public void setGender(String gender){
    this.gender = gender;
   }

// get 獲取 : 對外提供 Name屬性
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }

//行為（方法）=> 動詞
    public void call(){
        System.out.println("she is calling....");
    }
    public void playGame(){
        System.out.println("she is calling.....");
    }

    
}
