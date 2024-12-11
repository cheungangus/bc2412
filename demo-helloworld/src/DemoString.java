public class DemoString {
  public static void main(String[] args) {

    char x = 'a';
    x = 1; // ! ????
    // x = 1.1;
    // x = true;
    x = 'x'; 
    // char x = 'o'; 

    // ! define a string value by double quote ""
    // ! define a char value by single quote ''
    String password = "abcd1234";
    String emailAddress = "abc@gmail.com";

    // + operation
    password = password + "!"; 
    System.out.println("helloworld");
    System.out.println(password); // abcd1234!

    // Java Method (Instance method)
    // action/ tools

    char result = password.charAt(0); // 0 represents the first position of the string value
    System.out.println(result); // a

    // charAt
    // ! index strts from 0 to length-1
    System.out.println(password.charAt(8)); // !
    // System.out.println(password.charAt(-1)); // error
    // System.out.println(password.charAt(9)); // error

    // print the last character of string. 
    String password2 = "helloworld";
    char lastChar = password2.charAt(password2.length() - 1);
    System.out.println(lastChar); // d

    // equals() -> true
    String s1 = "abc";
    String s2 = "abc";
    boolean result2 = s1.equals(s2);
    System.out.println(result2); 

    // equals() -> flase
    String s3 = "abc";
    String s4 = "def";
    boolean result3 = s3.equals(s4);
    System.out.println(result3);

    // length()
    int result4 = password.length();
    System.out.println(result4); // 9, the length of String value


    // Empty String
    String emptyString = "";
    System.out.println(emptyString.length()) ; // 0
    boolean isStringEmpty = "".equals(emptyString); // asking if emptyString equals to ""
    System.out.println(isStringEmpty); // true

    String s = "hello";
    System.out.println("hello".equals(s)); // askig if s equals to "hello"
    System.out.println("hello". charAt(2)); // l
    System.out.println("hello".length()); // 5

    
    // 'c'.charAt() // Primitive has no method (tool)
  }
  
}
