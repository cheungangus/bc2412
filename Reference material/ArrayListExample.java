import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
// 1.   //  建立 ArrayList     
//      ArrayList<String> fruits = new ArrayList<>();
//      ArrayList<Person> people = new ArrayList<>();
//  <String> 可以直接更換為 Integer , Double, Boolean or 

//  自定義：
//     class Person {
//     String name;
//     int age;

//     Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     @Override
//     public String toString() {
//         return name + " (" + age + ")";
//     }
// }

        ArrayList<String> fruits = new ArrayList<>();
// 2.   //  添加元素
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

// 3.   //  在指定位置添加元素
        fruits.add(0, "Orange"); 
        System.out.println("======================"); 

// 4.   //  顯示ArrayList
        System.out.println("fruits list are: " + fruits); //fruits list are: [Orange, Apple, Banana, Cherry]

// 5.   //  刪除元素
        fruits.remove("Banana");

// 6.   //  獲取指定位置元素
        String firstFruit = fruits.get(0);
        System.out.println("First fruit : " + firstFruit); //First fruit : Orange
        
// 7.   //  遍歷ArrayList
        System.out.println("All fruits list are: " );
        for(String fruit : fruits){
            System.out.println(fruit); //All fruits list are: Orange, Apple, Cherry
        }

    }
}
