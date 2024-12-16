public class DemoComparsionday1 {
  public static void main(String[] args) {

    // >, <, >=, <=, !+, == (true  or false)
    // "==" -> asking if they are equals
    // "=" -> assignment

    int age = 20;
    boolean isAdult = age >= 18; // adult defintion
    System.out.println(isAdult); // true

    double pi = 3.14159;
    boolean isCorrect = pi == 3.14159;
    System.out.println(isCorrect); // true

    char gender = 'F';
    boolean isMale = gender == 'M';
    System.out.println(isMale); // false

    float price = 10.2f;
    System.out.println(price != 10.2f); // false
    // System.out.println(price !=10.2); // ture, during comparsion, convert price to double before comparision

    // ! operator (NOT)
    boolean result = !isAdult;
    System.out.println(result); // false


    if (!(age >= 18)){ // age < 18
      // do something...
      }
    if (!isAdult){
      // do something...

    }
    // && AND
    int age2 = 30;
    char gender2 = 'F';
    boolean result2 = age2 >= 30 && gender2 == 'M';
    // event 1 : age2 >= 30 -> true
    // event 2 : gender2 == 'M'-> false
    System.out.println(result2); // false

    // || OR
    boolean result3 = age2 >= 30 || gender2 == 'M';
    // event 1 : age2 >= 30 -> true
    // event 2 : gender2 == 'M' -> false
    System.out.println(result3); // true

    // || OR (false || false)
    boolean result4 = age2 < 30 || gender2 != 'F';
    // event 1 : age2 >= 31 -> true
    // event 2 : gender2 == 'M'-> false
    System.out.println(result4); // false

    // AND OR (true AND (false or true))
    boolean result5 = age2 >= 30 && (gender2 == 'M' || age2 > 18);
    System.out.println(result5); // true
    // Step 1 : (gender2 == 'M' || age2 > 18) -> false || true -> ture
    // Step 2 : age2 >= 30 -> true, true && true -> true

    // ! The ordering of event checking is different
    // AND go first
    boolean result6 = age2 >= 18 && age2 == 30 || gender2 == 'M';
    System.out.println(result6); // true
    // Step 1 : age2 >= 30 && gender2 == 'M' -> true && false -> false
    // Step 2 : true || false -> ture

  }
}
