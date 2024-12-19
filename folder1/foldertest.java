
public class foldertest {
    public static void main(String[] args){
     
     // 9. Count the number of char value in the given String s9
      // print "count=2"
      // Use: for loop + if
      char c9 = 'p';

      String s9 = "pampers";
    // count the number of 'l'
    // for + if
    int count = 0;
    for (int i = 0; i < s9.length(); i++) { // loop all values + filtering
      if (s9.charAt(i) == 'p') {
        count++;
      }
    }
    System.out.println(count);

    

}
}