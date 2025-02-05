public class GirlFriendTest {

public static void main(String[] args) {
    
    GirlFriend gf1 = new GirlFriend(); //空参顯示位置
    gf1.setName("apple");
    gf1.setAge(28);
    gf1.setGender("famel");
    String name = gf1.getName();

    System.out.println(gf1.getName());
    System.out.println(gf1.getAge());
    System.out.println(gf1.getGender());

    //行為(方法) 顯示
    gf1.call();
    gf1.playGame();

    System.out.println("==========");

    GirlFriend gf2 = new GirlFriend();//空参顯示位置
    gf2.setName("orange");
    gf2.setAge(28);
    gf2.setGender("famel");

   
    gf2.call();
    gf2.playGame();

    //空参的構造方法
    //GirlFriend gf3 = new GirlFriend();

    //帶參構造
    GirlFriend gf4 = new GirlFriend("Water", 25, "Man");

}
}
