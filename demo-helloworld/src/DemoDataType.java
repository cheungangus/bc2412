public class DemoDataType {
  public static void main(String[] args){
    // Comment. Welcome to bootcamp!#$%^&*
    // ! 1. Data Type (8 Primitive)
    // x, day0fWeek -> variable
    // int -> Integer
    int x = 3; // from right to left
    int dayOfWeek = 7;
    //int y = 3.2; // ! not OK , y is a variable that can store integer only. 

    double y2 = 3.2;
    // double 2w = 10.0; // ! not OK

    // variable Java naming convension
    // caml case; dayOfWeek, y2

    //Declaration 
    int x100;
    // Variable Assignment
    x100 = 9;

    // Re-assignmentg
    x = 101; // re-assign 101 to x
    x = x + 10; // right: 101 + 10, left: assign 111 to x
    x = x - 40; // 111 - 40 -> 71
    x = x * 3; // 71 * 3 -> 213
    x = x / 213 ; // 213 / 213

    // Print out
    System.out.println(x); // 1
    x = x + 8 * 2 / 4 + 1; 
    // 8 * 2 / 4 -> 4
    // 1 + 4 + 1
    // 6
    System.out.println(x); // 6

    x = (x + 2) * 2 / (3 + 1);
    System.out.println(x); // 4

    x = ((x + 3) / (6 + 1)) * (x + 1 );
    System.out.println(x); // 5

    // divide by 0
    // int f = 10 / 0; //  ! error
    // System.out.println(f);


    // 0 / 10 
    System.out.println(0 / 10);

    // divide 
    int x2 = 3 / 2;
    // Step 1: 3 -> int value, 2 -> int value 
    // Step 2: int value / int value -> int value 
    // Step 3: 3 / 2 -> 1 
    // Step 4: assign 1 (int value) to int type variable (OK!)
    System.out.println(x2); //1

    double x3 = 3 / 2;
    // Step 1: 3 -> int value, 2 -> int value 
    // Step 2: int value / int value -> int value 
    // Step 3: 3 / 2 -> 1 
    // Step 4: assign 1 (int value) to double type variable (convert 1 to 1.0)
    System.out.println(x3); // 1.0

    double x4 = 3.0 / 2;
    // Step 1: 3.0 -> double value, 2 -> int value 
    // Step 2: double value / int value -> double value 
    // Step 3: 3.0 / 2.0 -> 1.5
    System.out.println(x4); // 1.5 

    // ! int x5 = 3.0 / 2; 
    // Step 1: 3.0 -> double value, 2 -> int value 
    // Step 2: double value / int value -> double value 
    // Step 3: 3.0 / 2.0 -> 1.5
    // Step 4: assign 1.5 (double value) to int type variable (downcasting)
    // ! Not allow assign a higher level value to lower level type of variable

    // int -> double (upcast)
    // double -> int (downcastf)
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
