public class DemoForLoopday3 {
  public static void main(String[] args) {
// 2^100
    int x = 2; 
    x = x * 2;
    x *= 2;
    System.out.println(x); // 8

    // For loop
    // for( ; ; ) {
    //  }
    
    // "i < 3" -> continue criteria
    // "i++" -> modifier
    // ! You have to let the modifier work with "continue criteria", 
    // ! so that continue crtieria at the end become false
    for (int i = 0; i < 3; i++) {  // 3 - 0 or 0,1,2
      System.out.println("hello");
    }
    // Step 1 : int i = 0
    // Step 2 : i < 3 (question) -> true
    // Step 3 : if true, enter into code block
    // Step 4 : i++, i become 1
    // Step 5 : i < 3 (question) -> true 
    // Step 6 : if true, print hello
    // Stpe 7 : i++, i become 2
    // Step 8 : 1 < 3 (question) -> true
    // Step 9 : if true, print hello
    // Step 10 : i++, i become 3 
    // Step 11 : i < 3 (question) -> false
    // Step 12 : exit for loop

    for (int i = 0; i <5; i++) { // 0,1,2,3,4
      System.out.println(i);
    }

    // print even numbers (i % 2 == 0)
    for (int i = 0; i < 10; i++){
       if (i % 2 == 0 ) { // even number definition
      System.out.println(i);
       }
    }

    // print 0 - 100, divided by 3 and divided by 4
    for (int i = 0; i < 101; i++){
       if (i % 3 == 0 && i % 4 == 0){
        System.out.println(i);
       }
    }

    // sum up 0 - 20 : 0 + 1 + 2... + 20
    int sum = 0;
    for (int i = 0; i <= 20; i++) {
      sum = sum + i;
    }
    System.out.println(sum); // 210
    // System.out.println(i); // ! i is declared within the for loop

    // sum up all odd numbers between 0 - 10
    // sum up all even number between 0 - 10
    // ! find the difference between evenSum and oddSum -> positive number
     sum = 0;
    for (int i = 0; i < 11; i++) {
      if ( i % 2 == 1){
        sum += i;
      }
    }
    System.out.println(sum); // 25
  
    String str = "abcdefijk";
    boolean found = false;
    // 1. Check if 'd' exists in the string.
    // for loop + if + charAt
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'd'){
        found = true;
        break; // break the nerest loop
      }
    }
    System.out.println(found);

    // Test Case:
    // 1. "abcdefijk"
    // 2. "abcefijk"
    // 3. ""
    // 4. "abcdefijkd"

    // 2. check if the string value contain given sub-string
    String substr = "loq";
    String str2 = "hello";
    // hel vs loq
    // ell vs loq
    // llo vs loq

    // for loop + substring
    boolean isSubstringExist= false;
    for (int i =0; i < str2.length(); i++) {
      if (str2.substring(i, i + substr.length()).equals(substr)) {
        isSubstringExist = true;
        break;
      }
      }
      System.out.println(isSubstringExist); // true
    }

  }
}