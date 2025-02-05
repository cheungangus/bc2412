



public class methodExample{
    // 最簡單的方法定義和調用 : 先定義 後調用
public static void main(String[] args) {
        playGame(); //調用方法
        playGame(); // 調用兩次
        getSum(10, 20); // 30
        getLength(10.2, 5.2); //30.799999999999997
        getArea(5.2); //84.94866535306801
        //直接調用
        getSum(10, 20, 30); //60
        //賦值調用
        int sum = getSum(10, 20, 30);
        System.out.println(sum); // 60
        //輸出調用
        System.out.println(getSum(10, 20, 30)); // 60

        int sum1 = getSum(10, 20, 30);
        int sum2 = getSum(20, 30, 40);
        int sum3 = getSum(20, 30, 40);
        int sum4 = getSum(20, 30, 40);
        int sumFinal = sum1 + sum2 + sum3 + sum4;
        System.out.println(sumFinal); // 330
        compare((long)10, (long)20);
}

    public static void playGame () { //(playGame = 方法名) -> 定義
        System.out.println("選人物");// 方法體
        System.out.println("準備開局"); 
        System.out.println("對線");
        System.out.println("崩盤");
        System.out.println("罵隊友");
        System.out.println("送人頭");
        System.out.println("GG");

    }
    public static void getSum(int num1, int num2) { 
        int result = num1 + num2;
        System.out.println(result);
    }

    public static void getLength(double len, double width){
        double result = (len + width) * 2;
        System.out.println(result);
    }

    public static void getArea(double radius){
        double result = radius * radius * Math.PI;
        System.out.println(result);
        
    }
    //有返回值定義格式
    public static int getSum(int num1, int num2, int num3){
        int result = num1 + num2 + num3;
        return result; // 返回給方法的調用處
    }
    
    // 方法的重載 -> 同一個類中， 方法名相同，參數(個數)(類型)(順序) 不同的方法
    //會吧相同功能的方法名起成一樣； 
    // 減少不同單詞
    // 調用不會太麻煩
    public static void compare(byte b1, byte b2){
        System.out.println("byte");
        System.out.println( b1 == b2 );
    }
    public static void compare(short s1, short s2){
        System.out.println("short");
        System.out.println( s1 == s2 );
    }
    public static void compare(int i1, byte i2){
        System.out.println("int");
        System.out.println( i1 == i2 );
    }
    public static void compare(long n1, long n2){
        System.out.println("long");
        System.out.println( n1 == n2 );
    }

}
