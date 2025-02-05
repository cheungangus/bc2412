import java.util.Scanner;

public class JavaQuest3 {
  /**
   * Expected Output:
   * 
   * Example 1: Input a month number: 2 Input a year: 2016
   * 
   * February 2016 has 29 days
   * 
   * Example 2: Input a month number: 12 Input a year: 2014
   * 
   * December 2014 has 31 days
   */

  // Program the number of days that the month of a year has.

  public static void main(String[] strings) {

    Scanner input = new Scanner(System.in);

    int number_Of_DaysInMonth = 0;
    String monthOfName = "Unknown";

    System.out.print("Input a month number: ");
    int month = input.nextInt(); // assume 1 - 12

    System.out.print("Input a year: ");
    int year = input.nextInt(); // > 0

    // divided by 4, divided by 100, divided by 400
    switch (month) {
      // case 1
      case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
      number_Of_DaysInMonth = 31;
      monthOfName = getMonthOfName(month);
      
      break;
      case 4: // April
      case 6: // June
      case 9: // September
      case 11: // November
          number_Of_DaysInMonth = 30;
          monthOfName = getMonthName(month);
          break;

      case 2:
        if (year % 4 != 0 && year % 100 != 0 && year % 400 ==0 ) {
          number_Of_DaysInMonth = 28;
        } else {number_Of_DaysInMonth = 29;}    
          number_
        break;
      default:

    }
    // The February has 29 days: (Every 4 years and the year cannot divded by
    // 100) or The year can divided by 400
    // otherwise the February should have 28 days only

    System.out.println(
        monthOfName + " " + year + " has " + number_Of_DaysInMonth + " days");
  }

}