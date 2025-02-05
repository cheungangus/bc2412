
import java.util.Scanner;

public class Logicoperator {
    public static void main(String[] args) {
        //邏輯運算符

    
    // !取反
        //要麼不寫，要麼寫一次
    System.out.println(!false); // true
    System.out.println(!true); //false

    //短路邏輯運算符
    // &&
    // ||

    //三元運算符(三元表達式)： 關係表達式? 表達式1 : 表達式2 
        // 先計算問號前面的值(num1 > num2) ，如果值為true,表達式1的值就是運算結果
    // int max = a > b ? a : b;
    // System.out.println(a > b ? a : b);
        int num1 = 10;
        int num2 = 20;
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max); // 20
        System.out.println(num1 > num2 ? num1 : num2); // 20
    
        //鍵盤
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入第一隻老虎的體重");
        int weight1 = sc.nextInt();
        System.out.println("請輸入第二隻老虎的體重");
        int weight2 = sc.nextInt();
        //比較
        // System.out.println( weight1 == weight2); // true or false

        String result = weight1 == weight2 ? "相同" : "不相同";  // 兩個進行比較
        System.out.println(result);  
        
        // 定義三個變量
        int height1 = 150;
        int height2 = 222;
        int height3 = 245;
        //第一個和第二個進行比較
        int temp =height1 > height2 ? height1 : height2;  // 三個數值進行比較
        int total = temp > height3? temp : height3; // 使用temp暫時儲存後再與第三個數值進行比較
        //拿著上述結果與第三個進行比較
        System.out.println(total);

        // 運算符優先級
        // ()優先於所有符號
    }   
    
    
}
