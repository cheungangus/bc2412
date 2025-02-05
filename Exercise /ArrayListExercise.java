
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.jar.Attributes;
import javax.naming.ldap.ControlFactory;

public class ArrayListExercise {
    public static void main(String[] args) {
      // Exercise 1: Array List Basic Operations
  
      // 1a. Create an ArrayList of integers.
      // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
      // 1c. Print all the elements in the list.
      // 1d. Remove the number 30 from the list.
      // 1e. Print the size of the list.
  
      // Exercise 2: Search and Update
  
      // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
      // "Orange".
      // 2b. Check if "Grapes" exists in the list.
      // 2c. If it doesn’t exist, add it to the list.
      // 2d. Update "Mango" to "Peach".
      // 2e. Print the final list.
  
      // Exercise 3: Remove Duplicates
      // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
      // 3b. Remove duplicates from the list using a HashSet.
      // 3c. Print the list after removing duplicates.
  
  
      // Exercise 4: HashSet Basic Operations
  
      // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
      // 4b. Add "Canada" to the set.
      // 4c. Add "India" again. Print the result.
      // 4d. Print all elements in the set.
  
      // Exercise 5: Check the numbers
  
      // 5a. Create a HashSet of integers: 1.1, 2.2, 3.3, 4.4, 5.5
      // 5b. Check if the set contains the number 3.3
      // 5c. Remove the number 2.2 from the set.
      // 5d. Print the size of the set.
  
      // Exercise 6: Intersection of Sets
  
      // 6a. Create two HashSets:
      // 6b. Set 1: 10, 20, 30, 40
      // 6c. Set 2: 30, 40, 50, 60
      // 6d. Find the common numbers of the two sets.
      // 6e. Print the resulting set.
  
      // Exercise 7: Convert HashSet to ArrayList
  
      // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
      // 7b. Convert the HashSet to an ArrayList.
      // 7c. Print the converted list.
  
      // Exercise 8: ArrayList of Students
      // 8a. Create an ArrayList to store Student objects.
      // Add the following students:
      // ID: 1, Name: Alice
      // ID: 2, Name: Bob
      // ID: 3, Name: Charlie
      // 8b. Iterate over the ArrayList and print each student's details.
      // 8c. Remove the student Bob.
      // 8d. Write a static method to search for a student by ID and return their name. If the student is
      // not found,
      // return "Student not found".
      // 8e. Create another ArrayList to store student with name starts with 'A'
  
      // Exercise 9: HashSet of Students
      // 9a. Create two HashSets of Student objects:
      // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
      // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
      // 9b. Find the common students of the two sets
      // 9c. Print the result.
      
    }
  
    public static class Student {
      private int id;
      private String name;
      
  
      // Constructor
      // getter, setter, etc.
      public void setId(){
        this.id = id;
      }
      public int getId (int id){
        return this.id;
      }
      public void setName(){
        this.name = name;
      }
      public String getName (){
        return this.name;
      }

    }
    
public static class Fruit{
    private String FruitsName;

    public Fruit(String FruitsName){
        this.FruitsName = FruitsName;
    }
    public String getFruitsName(){
        return this.FruitsName;
    }
    public void setFruitsName(){
        this.FruitsName = FruitsName ;
    }
    
      }

public static class Studentname{
    private String name;
}

public static void main(String[] args) {
    //1
    ArrayList<String>  integer = new ArrayList<>();
    integer.add("10");
    integer.add("20");
    integer.add("30");
    integer.add("40");
    integer.add("50");
    System.out.println(integer.size());
    integer.remove("30");
    System.out.println(integer.size());

    //2
    ArrayList<Fruit> fruits  = new ArrayList<>(); 
    // Grapes FruitsName
    fruits.add(new Fruit("Apple"));
    fruits.add(new Fruit("Banana"));
    fruits.add(new Fruit("Mango"));
    fruits.add(new Fruit("Orange"));
    String Fruit = "Not Found.";
    for (Fruit Fruits : fruits){
        if (Fruits.getFruitsName().contains("Grapes")){
            String fruitsString = Fruits.getFruitsName();
            break;
        }
    fruits.add(new Fruit("Grapes"));
    System.out.println(fruits.size());
    }
    
    // 3
    HashSet<Integer> numbers = new HashSet<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(10);
    numbers.add(30);
    numbers.add(40);
    numbers.add(20);
    numbers.add(50);

    if(numbers.contains(10)){
    } else if(numbers.contains(20)){
    };
    numbers.remove(10);
    numbers.remove(20);
    for (Integer number : numbers){
        System.out.println(numbers);
    }
    
    // 4


    HashSet<String> country = new HashSet<>();
    country.add("USA");
    country.add("India");
    country.add("China");
    country.add("Japan");
    country.add("Canda");
    System.out.println(country.add("Canda"));
    country.add("India");
    System.out.println(country.add("India"));

    //5
    HashSet<Double> doubleHashSet = new HashSet<>();
    doubleHashSet.add(1.1);
    doubleHashSet.add(2.2);
    doubleHashSet.add(3.3);
    doubleHashSet.add(4.4);
    doubleHashSet.add(5.5);
    if(doubleHashSet.contains(3.3)){
    };
    numbers.remove(2.2);
    System.out.println(doubleHashSet);

    //6
    HashSet<Integer> i1 = new HashSet<>();
    HashSet<Integer> i2 = new HashSet<>();

    i1.add(10);
    i1.add(20);
    i1.add(30);
    i1.add(40);
    i2.add(30);
    i2.add(40);
    i2.add(50);
    i2.add(60);
    
    if(i1 !=i2){
System.out.println(true);
System.out.println();
}

    //7
    HashSet<String> string = new HashSet<>();
    string.add("Cherry");
    string.add("Steve");
    string.add("chole");
    string.add("Jenny");
    string.add("Vicky");

    //8
    ArrayList<String> student = new ArrayList<>();
    student.add("ID: 1" + "Alice");
    student.add("ID: 2" + "Bob");
    student.add("ID: 3" + "Charilie");

    //9
    HashSet<String> o1 = new HashSet<>();
    HashSet<String> o2 = new HashSet<>();

    o1.add("Alice (ID: 1)" +"Bob (ID: 2)" + "Charlie (ID: 3)" );
    o2.add("Bob (ID: 2)" +"Charlie (ID: 3)" + "David (ID: 4)" );

    if(o1 !=o2){
    System.out.println(true);
    System.out.println();
    }


    }
}
    
    



