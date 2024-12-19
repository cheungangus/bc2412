public class DemoWrapperClass {
    public static void main(String[] args) {
        
    int x = 3; // x is Primitive Type variable
    Integer  x2 = x; // auto-box
    System.out.println(x2);//3
    System.out.println(x2.doubleValue()); // 3.0
    System.out.println(x2.longValue()); // 3
    System.out.println(x2); // 3

    String s = "hello";
    System.out.println("hello".length()); // 5

    double d = 3.3;
    Double d2 = d;
    System.out.println(d2); // 3.3
    System.out.println(d2.intValue()); //3

    float f = d2.floatValue();
    System.out.println(f); // 3.3

    double d3 = d2; // un-box
    double d4 = d2.doubleValue();

    // char -> Character
      char c1 = 'a';
      Character c2 = c1; // auto-box
      System.out.println(c2.compareTo('a'));// 0
    // 0 -> equals
      Character c3 = 'b';
      System.out.println(c3.compareTo('a')); // 2 (ascii of 'c' > ascii of 'a ')
      Character c4 = 'A';
      System.out.println(c4.compareTo('a')); // -32 (ascii of 'A' > ascii of 'A')

      int asciiOfA = 'A';
      int asciiOfa = 'a';
      System.out.println(asciiOfa - asciiOfA ); // 32
      System.out.println('a' - 'A'); // 32, char value - char value -> int value -> int value
    
      char c5 = c4; // un-box
      System.out.println(c5); //A

    // boolean -> Boolean
      boolean b1 = false;
      Boolean b2 = b1;
      System.out.println(b2); // false

      boolean b3 = b2; // un-box
      System.out.println(b3); // false


    // byte -> Byte
    // short -> Short
    // long -> Long
    // float -> Float

    }
}
