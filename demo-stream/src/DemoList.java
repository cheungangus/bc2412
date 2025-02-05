
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
      // wath are the different between as below: 
      // ArrayList 
      // Arrays.asList()
      // List.of() 


      // 1. new ArrayList<>()
      // able to add / remove / modify
      List<String> strings1 = new ArrayList<>();
      strings1.add("ABC");
      strings1.add("DEF");

      List<String> strings2 = new ArrayList<>(Arrays.asList("ABC", "DEF")); // 可調整，可添加或刪除
      strings2.add("IJK");
      strings2.remove("DEF");
      strings2.set(0,"XYZ");
      
      // 2. Arrays.asList()
      // cannot to add and remove ONLY. able to  modify element only // 長短不能改變
      List<String> string3 = Arrays.asList("ABC", "DEF", "IJK");
      // strings3.add("XYZ");
      // strings3.remove("IJK");
      string3.set(0,"OPQ");

      // 3. List.of() 
      // able to read only
      List<String> strings4 = List.of("ABC", "DEF", "IJK"); // 只可以
      // strings4.add("XYZ");
      // strings4.remove("ABC");
      // strings4.set(0,"LLL");
      System.out.println(strings4.get(2));

    }
  }