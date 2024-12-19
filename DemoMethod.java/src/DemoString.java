public class DemoString {
  public static void main(String[] args) {
      
    String s1 = "hello";
    System.out.println(s1.length()); //5
    System.out.println(s1.charAt(1)); //e
    System.out.println("hello". equals(s1)); // true
    System.out.println(s1.substring(0,2)); // he

    System.out.println(s1.contains("ll")); // true
    System.out.println(s1.contains("lll")); // false
    System.out.println(s1.concat("!!!")); // hello!!!
    System.out.println(s1.startsWith("h")); //true
    System.out.println(s1.startsWith("ha")); //false
    System.out.println(s1.endsWith("lo")); //true
    System.out.println(s1.endsWith("oo")); //false
    System.out.println(s1.toUpperCase()); // HELLO
    System.out.println("HeLLo".toLowerCase()); // hello

    System.out.println(s1.replace("ll", "xxx")); // hexxxo
    System.out.println(s1.replace('l','m')); // hemmo
    System.out.println(s1.equalsIgnoreCase("HeLLO")); // true
    
    // !!!###
    System.out.println(s1.indexOf('e')); //1
    System.out.println(s1.indexOf('h')); //0
    System.out.println(s1.indexOf('x')); //-1
    System.out.println(s1.indexOf("ll")); //2

    System.out.println(s1.lastIndexOf('l')); //3
    System.out.println("hellollo".lastIndexOf("ll"));//5
    System.out.println(s1.isEmpty()); // false
    System.out.println("".isEmpty()); // true

    System.out.println(s1.isBlank()); //false
    System.out.println("".isBlank()); // true
    System.out.println(" ".isBlank()); // true

    System.out.println(" hel lo ".trim()); // hel lo
    System.out.println("abc".compareTo("bbb")); //-1
    System.out.println("abc".compareTo("dbb")); //-3
    System.out.println("aac".compareTo("azb")); //-25

    // Chain Method
    System.out.println("hello".concat("ijk").concat("def").toUpperCase()); //HELLOIJKDEF

    // charAt() -> Find char by index
    // indexOf() -> Find index by char
  }
}
