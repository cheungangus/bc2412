public class DemoHelloworldday1 {
  public static void main(String[] args) {
    // double -> int (downcast)

    //!Store Integer. Java: int , byte, short, long
    int value = 1000000;
    int value2 = 1_000_000;
    int maxInteger = 2_147_483_647;
    int minInteger = -2_147_483_648;
    // int maxInteger = 2_147_483_648;
    // int minInteger = -2_147_483_649;

    // !byte -128 to 127
    // -128 -> int value
    //assign an int value to byte type variable
    byte b1 = -128;
    byte b2 = 127;

    // !short -32768 to 32767
    // -32768 -> int value
    short s1 = -32768;
    short s2 = 32767;

    // !long
    // 2_147_483_648 -> int value 
    // int value -> double type variable


    long l1 = 2147483648L; 
    // ! Step 1: declare an int value (NOT OK)
    // ! Step 2: convert an int value to long type 

    // ! Declare a hardcode long value, you should always add "L"
    long l2 = 2147483648L; // "L" -> declare it is a long value

    // float -> double 
    double d1 = 10.2; // 10/2 -> double value
    double d2 = 10.2d; // 10.2d -> double value
    float f1 = 10.2f; // 10.2f -> float value 
    float f2 = 10.22f;


    //conversion
    float f4 = 10.2f;
    double d3 = f4; // safe. assign float value to double variable 

    //float f5 = d3; // ! not safe

    double d4 = 10.2f; // upcastng (float -> double)

    double d5 = f4 + 10.2d;
    //float + double -> double 
    System.out.println(d5); //

    double d6 = 0.2 + 0.1;
    System.out.println(d6); //

    double d7 = 0.2 + 0.2;
    System.out.println(d7); //

    // - * / on double

    char c = 'x';
    char c2 = '1';
    char c3 = '!';
    char c4 = ' '; // space
    // char c5 = ''; // ! at least on character

    //boolean
    boolean b = true;
    boolean b10 = false;
  
    boolean isSmoker = false;
    int age = 66;
    boolean isElderly = age >65;// "age > 65" -> asking if age > 65 (yes/no question)
    System.out.println(isElderly); // true

    int age2 = 18;
    boolean isAdult = age2 >= 18;
    System.out.println(isAdult); // true
  }
}
