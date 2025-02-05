import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
     //鍵盤錄入
    // 方法一： 
    // nextInt(); 接收整數
    // nextDouble();接收小數
    // next(); 接收字符串
    // 遇到空格，製表符，回車就停止接收，這些符號後面的數據就不會接受了
    
    // 方法二: 
    // nextLine();接收字符串
    // 可以接收空格,製表符,遇到回車才停止接受數據接收字符串
    Scanner sc = new Scanner(System.in);
    System.out.println("請輸入我們自己的衣服時髦度");
    int myFasion = sc.nextInt();
    System.out.println("請輸入約會對象的衣服時髦度");
    int girlFasion = sc.nextInt();

    boolean result = myFasion > girlFasion;
    System.out.println(result);   
    }
    






    

}
