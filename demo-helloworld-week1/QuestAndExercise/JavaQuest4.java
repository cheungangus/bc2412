package QuestAndExercise;

public class JavaQuest4 {
  public static void main (String[] args){
      /**
       * Exercise: Print 10 numbers: they must be even and > 0, and divisible by 3
       * and divisible by 2 (Search it from 1)
       * 
       * Expected Output: 6 12 18 24 30 36 42 48 54 60
      //  */
      for (int i = 0; i < 70; i++) {
        // code here ...
        if ( i > 0 && i % 3 == 0 && i % 2 ==0){
          System.out.println(i); // 6,12,18,24,30,36,42,48,54,60
        }
      }
        // Print first ten numbers, which fulfill the followings criteria:
        // 1. Even numbers
        // 2. Divisible by 3
        // 3. > 0
        for (int i = 0; i <= 30; i++) {
          // code here ...
          if ( i > 0 && i % 3 == 0){
            System.out.println(i); // 3,6,9,12,15,18,21,24,27,30
          }
        }



        
      }
    }
    