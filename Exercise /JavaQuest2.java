/**
 * Expected Output:
 * 
 * a > 9
 * str length < 27
 */
// Primitive types and operators
public class JavaQuest2 {
  public static void main(String[] args) {
    int a = 10;
    if (a == 9) {
      System.out.println("a is equals to 9");
    } else if ( a < 9) {
      System.out.println("a is between 0 and 8");
    // how about a > 9?
    } else {
      System.out.println("a < 0");
    }

    String str = "I love Java. I love coding";
    if (str.length() == 27) {
      System.out.println("str length=27");
    } else if (str.length() < 27 ) { // code here ... add the condition
      System.out.println("str length < 27");
    } else  { // code here ... complete the code
      System.out.println("str length > 27");
    }
  }
}