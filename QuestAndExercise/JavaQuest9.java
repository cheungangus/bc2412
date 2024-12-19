/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    // prints e (the 1st e)
    // code here ...
    System.out.println(str.charAt(15)); // J
    System.out.println(str.charAt(1)); // e
    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    // code here ...
    System.out.println(str.indexOf('')); //1


    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"

    // Use String replace() method
    // prints VenturenixLAB, Coding
    // code here ...

    // int length()
    // prints 19
    // code here ...

    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    // code here ...

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...

  }
}