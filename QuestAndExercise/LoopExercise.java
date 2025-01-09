import java.math.BigDecimal;

public class LoopExercise {
    public static void main(String[] args) {
      // 1. Print 6 times hello
      // Use: for loop
            String j = "hello";
            for( int i = 0; i < 6 ; i++){
                System.out.println("hello"); // hello, hello, hello, hello, hello , hello
            }
      // 2. Expected output: "0,1,2,3,4"
      // Use: for loop
            for (int i = 0; i < 5 ; i++){
              System.out.println(i); // 0, 1,2,3,4
            }
      // 3. Print even numbers between 2 and 20
      // Use: for loop + if
            for (int i = 0; i < 21 + 1; i++) {
              if (i > 0 && i % 2 == 0 ){
                System.out.println(i); // 2,4,5,6,8,10,12,14,16,18,20
              }
            }
      // 4. Print the numbers, which can be divided by 3 or 5
      // Use: for loop + if
            for ( int i = 0; i < 50 ; i++){
              if ( i > 0 && i % 3 ==0 && i % 5 ==0){
                System.out.println(i); // 15,30,45
              }
            }
      // 5. Sum up the numbers between 0 and 15 and print it
      // Use: for loop
      int sum = 0;
      for (int i = 0; i <= 15; i++) {
        sum = sum + i;
      }
      System.out.println(sum); // 120
  
      // 6. sum up all odd numbers betwen 0 - 10
      // Sum up all even numbers betwen 0 - 10
      // Find the product of evenSum and oddSum
      // Use: for loop + if
      int oddSum = 0;
      int evenSum = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 1) {
        oddSum += i;
      } else {
        evenSum += i;
      }
    }
    System.out.println(evenSum + oddSum); // 55

      
      // 7. Check if 'd' exists in the string.
      // print "d is found."
      // otherwise, print "d is not found."
        String str7 = "ijkabcpodi";
        char lastChar = str7.charAt(str7.length() -2 );
        System.out.println(lastChar); // d
  
 // 8. Check if the string s8b is a substring of s8a
      // print "s8b is a substring."
      // otherwise, print "s8b is not a substring."
      // Use: for loop + if + substring method
      String s8a = "abcba";
      String s8b = "cba";

  
      // 9. Count the number of char value in the given String s9
      // print "count=2"
      // Use: for loop + if
      String s9 = "pampers";
      char c9 = 'p';

      int count = 0;
      for (int i = 0; i < s9.length(); i++) { // loop all values + filtering
        if (s9.charAt(i) == 'p') {
          count++;
        }
      }
      System.out.println(count); // 2
      
  
// 10. Replace all char value 'x' in the given String array by 'k'
      // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
      // Use: for loop + replace method
      String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
  
// 11. Count the number of Uppercase char value in the given string s11
      // Print "count uppercase=4"
      // Use: for loop + if
      String s11 = "kLKloOOu";
  
      // 12. Print the following pattern of * value
      // *****
      // *****
      // *****
      int o = 5;
      for ( int i = 0 ; i < 3 ; i++) {
        for( int p = 0; p < 5 ; p++) {
         System.out.print("*");
           }
             System.out.println("");  //******
                                        //******
                                        //******
               }
  
 // 13. Given a string value s13, each of the char value has its score.
      // Calculate the total score
      // Use: switch + for loop
  
      // l -> 1 score
      // r -> 3 score
      // d -> 2 score
      // u -> 4 score
      // for other character, -1 score
      String s13 = "lrlaudbucp";
      
      // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
      long[] arr14 = new long[4];
      arr14[0] = 1;
      arr14[1] = 4;
      arr14[2] = 9;
      arr14[3] = -4;
      for (int i = 0; i < arr14.length;i++) { 
        if (arr14[i] <= 10)
        System.out.println(arr14[i]); // 1,4,9,-4
        }

      // 15. Find the max value and min value in arr14
      // Use One Loop + if

      long min = arr14[0];
      long max = arr14[0];
      for(int i = 0; i < arr14.length; i++){
        if ( min > arr14[i]){
          min = arr14[i];
        }else max = arr14[i];
      }
      System.out.println(min); // -4
      System.out.println(max); // 9
  
// 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6
      float[] arr16 = new float[3];
      arr16[0] = 0.2f;
      arr16[1] = 0.3f;
      arr16[2] = 0.5f;
      
      // 17. Add value 0.1 to each of value in array arr16
      // Print: [0.3, 0.4, 0.7]
      // Use : BigDecimal
      
      BigDecimal bd1 = BigDecimal.valueOf(0.3);
      BigDecimal bd2 = BigDecimal.valueOf(0.4);
      BigDecimal bd3 = bd1.add(bd2);
      System.out.println(bd3.doubleValue()); //0.7

// 18. Count the number of target strings in the String[]
      String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
      String target = "Tommy";
      // Print "count name=2"

     /*  int count1 = 0;
      for (int i = 0; i < target.length(); i++) {
        if ( charAt(i) == "Tommy"); {
          count++;
        }
      }
      System.out.println(count1);  */

// 19. swap the max digit and min digit
      // Assumption: each digit value appear once in the String
      // Print: "49280"
      String s19 = "40289";
  
// 20. Find the longest String in the String array
      // Print "longest=programming"
      String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};
      
    }
  }