import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoAlinkedList {
    public static void main(String[] args) {
        LinkedList <String> strings = new LinkedList<>();

        strings.add("ABC");
        strings.add("DEF");
        strings.add("ABC"); //  add() belongs to Collection Family
        System.out.println("===================");
        System.out.println(strings.size()); //3
        strings.remove(0);
        System.out.println(strings); // [DEF, ABC]
        strings.remove("ABC");
        System.out.println(strings); //[DEF]
        strings.add("Oscar");
        strings.add("Jenny");
        strings.remove(); // remove the head
        System.out.println(strings); // [Oscar, Jenny]
        System.out.println(strings.contains("Jenny")); // true
        System.out.println(strings.contains("Vencent")); // false
        System.out.println("===================");

        for (String s : strings){
            System.out.println(s); // Oscar, Jenny
        }

        //contains(), add(), remove(Object obj), etc are common method for ArrayList and LinkedList.
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

        List<Animal> animals = new ArrayList<>();
        animals.add(new Tiger());
        animals.add(new Panda());
            for(Animal animal : animals){
                System.out.println(animal.run());
        }

    }
}
