
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args){

    double result = 0.2 + 0.1;
    System.out.println(result); 
    if (result == 0.3 ){
      System.out.println("Result is 0.3");// 0.30000000000000004
    }else{
      System.out.println("Result is Not 0.3"); // Result is Not 0.3
    }

    // Solution : BigDecimal
    BigDecimal bd1 = BigDecimal.valueOf(0.2);
    BigDecimal bd2 = BigDecimal.valueOf(0.1);
    BigDecimal bd3 = bd1.add(bd2);
    System.out.println(bd3.doubleValue()); // 0.3

    System.out.println(0.3 - 0.1) ;  // 0.19999999999999998

    // subtract
    BigDecimal bd4 = BigDecimal.valueOf(0.3);
    BigDecimal bd5 = BigDecimal.valueOf(0.1);
    BigDecimal bd6 = bd4.subtract(bd5);
    System.out.println(bd6.doubleValue()); // 0.2

    // multiply
    BigDecimal bd7 = BigDecimal.valueOf(0.1);
    BigDecimal bd8 = BigDecimal.valueOf(0.2);
    BigDecimal bd9 = bd7.multiply(bd8);
    System.out.println(bd9.doubleValue()); // 0.02

    //divide
    BigDecimal bd10 = BigDecimal.valueOf(0.3);
    BigDecimal bd11 = BigDecimal.valueOf(0.1);
    BigDecimal bd12 = bd10.divide(bd11);
    System.out.println(bd12.doubleValue()); // 3.0
    
    // 10 /3
    BigDecimal bd13 = BigDecimal.valueOf(10);
    BigDecimal bd14 = BigDecimal.valueOf(3);
    BigDecimal bd15 = bd13.divide(bd14, BigDecimal.ROUND_DOWN);
    System.out.println(bd15.doubleValue()); // 3.0 ,Non-terminating decimal expansion

    BigDecimal bd16 = BigDecimal.valueOf(4.565).setScale(2,RoundingMode.HALF_DOWN);
    System.out.println(bd16.doubleValue()); // 4.56
    
    BigDecimal bd17 = BigDecimal.valueOf(4.566);
    System.out.println(bd17.setScale(2,RoundingMode.HALF_DOWN)); // 4.57
    System.out.println(bd17.setScale(2, RoundingMode.HALF_UP)); // 4.57

    BigDecimal bd18 = BigDecimal.valueOf(4.565);
    System.out.println(bd18.setScale(2, RoundingMode.HALF_DOWN)); //4.56
    System.out.println(bd18.setScale(2, RoundingMode.HALF_UP)); // 4.57

    BigDecimal bd19 = BigDecimal.valueOf(4.561);
    System.out.println(bd19.setScale(2, RoundingMode.UP)); // 4.57

    BigDecimal bd20 = BigDecimal.valueOf(4.569);
    System.out.println(bd20.setScale(2, RoundingMode.DOWN));// 4.56

    double length = 4.2;
    double squareArea = BigDecimal.valueOf(length) //
    .multiply(BigDecimal.valueOf(length))//
    .doubleValue();
    System.out.println(squareArea); // 17.64 -> 4.2*4.2

    // Math
    double pi = 3.14159;
    double radius = 4.5;
    double circleArea = BigDecimal.valueOf(radius) // 
    .multiply(BigDecimal.valueOf(radius)) // 
    .multiply(BigDecimal.valueOf( Math.PI))//
    .doubleValue();
    System. out.println(circleArea); // 63.61725123519331
    
    circleArea = BigDecimal . valueOf(Math.pow(radius, 2.0)) //
    .multiply(BigDecimal.valueOf(Math.PI)) // 
    .doubleValue();
    System.out.println(circleArea);// 63.61725123519331

    int x = 8;
    int y = 9;
    int max = Integer.MIN_VALUE;
    max = Math.max(x,max); // if(x > max){max = x;}
    max = Math.max(y,max);

    int[] arr = new int[] {10,9,3};
    max = Integer.MIN_VALUE;
    for (int i =0; i < arr.length; i++){
      max = Math.max (arr[i],max);
    }

    // Math.min()
    System.out.println(Math.sqrt(9)); // 3.0 // Java auto convert int value to double value
    System.out.println(Math.sqrt(10)); //3.1622776601683795
    System.out.println(Math.sqrt(-10)); // NaN

    // round() -> nearest to integer
    double u = 3.456;
    System.out.println(Math.round(u)); // 3

    // Nearest 2 d.p. - > 3.46
    System.out.println(Math.round( u * 100.0) / 100.0); // 3.46

    double u2 = 3.556;
    System.out.println(Math.round(u2)); // 4

    System.out.println(Math.abs(-9l)); // 9

  }
}
