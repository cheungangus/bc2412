/**
 * The sum is 55
 */
public class JavaQuest7 {
  // Sum values of an array
  public static void main(String[] args) {
    // Declare a int array, with value 1 to 10
    // code here

    int sum = 0;
    int[] arr = new int[10];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 5;
    arr[5] = 6;
    arr[6] = 7;
    arr[7] = 8;
    arr[8] = 9;
    arr[9] = 10;
     for (int i = 0; i < arr.length;i++) { 
       if (arr[i] < 11)
       System.out.println(arr[i]);
       }

    // Write a loop to sum up all value in the int array
    // code here ...
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    System.out.println( sum); // 55
  }
}