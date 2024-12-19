import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class DemoWhileLoop {
  public static void main(String[] args){

    for ( int i = 0; i < 3; i++){
      System.out.println(i);
    }
    // ! while loop vs For loop
    
    int j = 0; // ! 1. declare the counter outside the loop
    while (j < 3){ //coutinue criteria
      System.out.println(j);
    j++; // ! 2. flexible to control the j
    }
        
    String s = "hello";
    char target = 'e';
    boolean found = true;
    // while
    for (int i = 0; i < s.length() ; i ++ ) {
    if ( s.charAt(i) == target ){ 
        found = true;
        break;
    }
  }

    System.out.println(found);
    int k = 0;
    while ( k < s.length()){
      if (s.charAt(k) == target ){
        found = true;
        break;
      }
      k++;
    }
    System.out.println(found);

    // Random
     int number = new Random().nextInt(3); // 0-2 
     System.out.println(number);

     // 1-47
     int marksix = new Random().nextInt(47) + 1; // (0-48)+1
     System.out.println(number);

     int[] marksixArr = new int[6];
     int count = 0;
     int value = 6;
     while (count < 6) {
      value = new Random().nextInt(49) + 1; // 1-49
      if(!isDuplicated (marksixArr, value)){
        marksixArr[count] = value;
        count++;
      }
  System.out.println(Arrays.toString(marksixArr)); // random: [18,39,8,25,28,47]       
      }
    
      // 1 - 100
      // boom: 47

      // ! Game stars:
      // user: 4
      // please pick a number between 5-100
      // user: 67
      // please pick a number between 5-67
      // user: 47
      // boom!
      // while, Scanner, Random

      int min = 1;
      int max = 100;
      int bomb = new Random().nextInt(100) + 1; //1-100
      int input = -1;
      Scanner scanner = new Scanner(System.in);
      while (bomb != input){  
        System.out.println("Please pick up a number between " + min + "-" +max);
        input = scanner.nextInt();
        if (input < min || input > max)
        continue;
        // min , max
      if (input < bomb){
        min = input + 1;
      }else {
        max = input - 1;
      }
   }
      System.out.println("bomb!");
      scanner.close();
      
     // check if duplicated exists

public static boolean isDuplicated(int[] arr, int newValue){
      for (int i = 0; i < arr.length; i++){ 
        if (arr[i] == newValue)
        return false;
      }
     }



    }
  }

