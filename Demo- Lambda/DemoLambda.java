import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambda {
  public static void main(String[] args) {
    // Java Lambda Expression -> Stream, Optional
    // 2014 Java 8

    // Java Bulit-in Lambda Functions
    // y = f(x), input -> output

    // stringLength -> functionName

    // define function
    // s (input)
    // s.length() (output)
    Function<String, Integer> stringLength = s -> s.length(); // skip "return" keyword
    System.out.println(stringLength.apply("hello")); // 5
    stringLength = s -> s.length() + 10;

    // Input (String & String) s1 & s2
    // Output (Integer)
    BiFunction<String, String, Integer> totalLength =
        (s1, s2) -> s1.length() + s2.length(); // skip "return" keyword
    System.out.println(totalLength.apply("oscar", "lucas"));

    // SuperFunction (Interface), 3 Input 1 Output

    Consumer<String> printString =
        s -> System.out.println("The String is " + s);
    printString.accept("hello");
    printString.accept("goodbye");

    Supplier<Integer> randomMarkSixNumber = () -> new Random().nextInt(49) + 1;
    System.out.println(randomMarkSixNumber.get());

    // Custom FunctionInterface Swimable
    // Java before 8: Interface -> Class -> Object
    // Java after 8: Interface -> object
    Swimable lucas = () -> System.out.println("Lucas is swimming");
    lucas.swim(); // Lucas is swimming
    // Lambda Assumption: FunctionalInterface -> one method only -> lambda expression

    // MathOperation
    MathOperation addition = (x, y) -> x + y;
    MathOperation subtract = (x, y) -> x - y;
    System.out.println(addition.operate(1, 2)); // 3
    System.out.println(subtract.operate(1, 2)); // -1

    List<Book> books = new ArrayList<>();
    books.add(new Book(1));
    books.add(new Book(3));
    books.add(new Book(10));

    for (Book book : books){

    }
    books.forEach(b -> System.out.println(b.getId()));
    // one than 1 line
    books.forEach(b -> {
      String message = "message";
      System.out.println(b.getId() + " " + message);
    });
    Map<String, String> fruitMap = new HashMap<>();
    fruitMap.put("orange", "abc");
    fruitMap.put("apple","def");
    String fruit = "fruit";

    fruitMap.forEach((key, value)->{
      System.out.println("Key= " + key + ", value=" + value);
    });
    // predicate
  // x > 8 -> boolean
  // x -> x > 8 -> Predicate (formula)

  int x1 = -1;
  boolean islargeThanEight = x1 > 8;
  Predicate<Integer> isLargeThan8 = x -> x > 8; // Predicate
  System.out.println(isLargeThan8.test(9));
  System.out.println(isLargeThan8.test(8));

  // check if the integer is even number
  Predicate<Integer> isEvenNumber = x -> x % 2 ==0;
  System.out.println(isLargeThan8.and(isEvenNumber).test(10));
  System.out.println(isLargeThan8.or(isEvenNumber).test(9));

System.out.println(books.size());
books.removeIf(Book -> Book.getId() % 2 == 1);
System.out.println(books.size());

BiFunction<String,String,String> appendHello = (s1,s2) -> "Hello";
fruitMap.merge("lemon", "xyz", appendHello);
fruitMap.merge("apple", "mno", appendHello);
fruitMap.merge("orange", "yyy", appendHello);
System.out.println(fruitMap);

SuperFunction<String, String, String, Integer> formula = (s1,s2,s3) -> {
  int result = s1.length() + s2.length() + s3.length();
  return result;
};
System.out.println(formula.apply("abc", "" , "ppp")); // 6

// UnaryOperator<String> -> Function<String, String>
UnaryOperator<String> toUpperCase = s -> s.toUpperCase();
System.out.println(toUpperCase.apply("Hello")); // HELLO

UnaryOperator<String> transform = s -> {
  if(s.length()>5){
    return s.substring(0,5);
  }else{
    if(s.startsWith("a")){
      return "Wong String.";
    }
    return s;
  }
};
System.out.println(transform.apply("abcdef")); // babcde
System.out.println(transform.apply("abcde")); // Wong String
System.out.println(transform.apply("edcba")); // edcba

  }

  

  public static class Book{
    private int id;
    public Book (int id){
      this.id = id;
    }
    public int getId(){
      return this.id;
    }
  }


  // Similar to Consumer.class
  public static void printString(String s) {
    System.out.println("The String is " + s);
  }

  // Similar to Supplier.class
  public static int randomMarkSixNumber() {
    return new Random().nextInt(49) + 1; // 1-49
  }

  // Similar to Function.class
  public static Integer stringLength(String s) {
    return s.length();
  }
}