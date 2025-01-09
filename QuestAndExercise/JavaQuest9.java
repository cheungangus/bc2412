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
    System.out.println(str.indexOf('t')); //3
    System.out.println(str.indexOf('x')); //9
    System.out.println(str.indexOf('L')); //10


    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println("ab " + "c"); // ab c

    // Use String replace() method
    // prints VenturenixLAB, Coding
    // code here ...

    // int length()
    // prints 19
    // code here ...
    System.out.println("venturenixlab, Java".length()); // 19

    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...
    
    int start =5;
    int end=8;
    System.out.println(str.substring(5,8)); // abc
    

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    // code here ...
    System.out.println("VenturenixLAB, Java".toUpperCase()); //VENTURENIXLAB, JAVA
    System.out.println("VenturenixLAB, Java".toLowerCase()); //venturenixlab, java

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...
    System.out.println("V" + '*' + "NTUR" + '*' + "NIXLAB," +" JAVA!!!"); //V*NTUR*NIXLAB, JAVA!!!

  }
}
