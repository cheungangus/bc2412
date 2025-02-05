
import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        // operator 運算符
    //算術運算符
    // +
    System.out.println(3 + 2); //5

    // -
    System.out.println(4 - 1); //3

    // *
    System.out.println(7 * 9); //63

    System.out.println(1.10+1.01); //2.1100000000000003

    // / 取得商
    System.out.println(10 / 2); // 5
    System.out.println(10 / 3); // 3
    System.out.println(10.0 / 3);

    // % 取模(取餘)  取得餘數
    System.out.println( 10 % 2); //0
    System.out.println(10 % 3);//1

    Scanner sc = new Scanner(System.in);
    // 123 = 3: 123%10; 2: 123/10 %10; 123/100 %10
    System.out.println("請輸入一個三位數");
    int number = sc.nextInt();

    int ge = number % 10;
    int shi = number / 10 % 10;
    int bai = number / 100 % 10;
    System.out.println(ge);
    System.out.println(shi);
    System.out.println(bai);

    // 轉換及轉換規則
    // 隱式轉換(自動類型提升) : 取值範圍小變大
    // 取值範圍小的和取值範圍大的,  小的會先提升為大的再進行運算
    // byte,short, char 都會先提升為int 才再進行運算
    int a = 10;
    double b = 12.3;
    double c = a + b; // 強制轉換

    // 強制轉換
    // 格式 : 目標數據類型 = 變量名 =(目標數據類型) 被強制轉換的數據;

    //字符串運算符
    // + 
    // 拼接
    System.out.println(1 +'a'); // 98
    System.out.println('a' + "abc"); //aabc

//自增自減運算符
    // ++  &  --
    int x = 10;
    int y = x++;
    // 後++ : 先用後加
    //  先把變量 x 的值拿出來用，賦值給 y, 然後再自增 , 賦值給y的值是自增前的。
    int z = ++x;
    // 先++ : 先加後用
    //  先把變量x 自增,然後把自增後的值賦值給z (先把x自增(12),然後把自增的值賦值給z)
    System.out.println("x: " + x); // 12
    System.out.println("y: " + y); // 10
    System.out.println("z: " + z); // 12
    }
    
}
