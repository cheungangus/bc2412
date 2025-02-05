import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {
    public static void main(String[] args) {

// 1.   //建立
        LinkedList <String> strings = new LinkedList<>();
// 2.   // 添加
        strings.add("ABC");
        strings.add("DEF");
        strings.add("ABC"); //  add() belongs to Collection Family
// 3.   // 查詢總共有多少個數值
        System.out.println(strings.size()); //3
        System.out.println("===================");
// 4.  // 默認移除首位strings.remove(0);
        strings.remove(0);
        System.out.println(strings); // [DEF, ABC]
        System.out.println("===================");
// 5.   // 指定移除數值
        strings.remove("ABC");
        System.out.println(strings); //[DEF]
        System.out.println("===================");

        strings.add("Oscar");
        strings.add("Jenny");
// 6.   strings.remove(); 默認移除首位
        strings.remove(); // remove the head
        System.out.println(strings); // [Oscar, Jenny]

// 7.   strings.contains("Jenny"));  是否包含？ 有 true; 沒有 false
        System.out.println(strings.contains("Jenny")); // true
        System.out.println(strings.contains("Vencent")); // false
        System.out.println("===================");

// 8.   顯示所有項目內所有的數值
        for (String s : strings){
            System.out.println(s); // Oscar, Jenny
        }

        //contains(), add(), remove(Object obj), etc are common method for ArrayList and LinkedList.
// 9.   項目內是否empty
        System.out.println(strings.isEmpty()); // false
        strings.clear(); // clear all elements
        System.out.println(strings.size()); // 0\

        // LinkedList advantages : can be  add / remove  head/ tail
        // Array / ArrayList advantages : Point to the object directly if you know the position
        // Person.class(name)

        // Polymophism
        // List<Integer> ss = new Arraylist<>();
        List<Integer> ss = new LinkedList<>();
        ss.add(100);
        ss.add(1000);
        // Because of Interface List, ss object can invoke add() at comile time.
        // During the runtime, we found the object is LinkedList, the add() will be the LinkedList one.
        
        // ss.remove(); //  Not ok, list doesn't contain remove()
        LinkedList<Integer> ss2 = (LinkedList<Integer>) ss;
        ss2.remove();

        // List<Animal> animals = new ArrayList<>();
        // animals.add(new Tiger()) ;
        // animals.add(new Panda());
        //     for(Animal animal : animals){
        //         System.out.println(animal.run());
        // }

    }
}
