
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DemoHashMap {

    public static class Book {
        private int id;
        private String name;

        public Book(String name, int id){
            this.name = name;
            this.id = id;
        }
        public int getId(){
            return this.id;
        }
        
    }
    @Override
    public int hashCode(){
        return Objects.has(this.id, this.name);
    }

    public static void main(String[] args) {
        

        // key and value
        HashMap<String, Integer> fruitMap = new HashMap<>();
        // put an entry to Map
        // key - > apple
        fruitMap.put("Apple",1);
        fruitMap.put("APPLE",3);
        // If the key is same, the entry will be replaced.
        System.out.println(fruitMap); // {Apple=3}         
        System.out.println(fruitMap.size()); // 1, entry count
        fruitMap.put("APPLE", 3); 
        System.out.println(fruitMap);  //{Apple=3, APPLE=3}
        System.out.println(fruitMap.size()); // 2, entry count

        // According to Strng.class enquals(), "Apple " and 'APPLE' are not equals

        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
        System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (String key : fruitMap.keySet()){
            System.out.println(key);
        }

        for (Integer value: fruitMap.values()){
            System.out.println(value);
        }

        // get value by key
        System.out.println(fruitMap.get("APPLE")); //3 
        System.out.println(fruitMap.get("apple")); // 3

        // contains()
        System.out.print(fruitMap.containsKey("APPLE")); // true
        System.out.println(" ===========================");

        // Find the entry of "Apple", and then +1 to the integer.
        if (fruitMap.containsKey("Apple")){
            fruitMap.put("Apple", fruitMap.get("Appele") + 1);
        }
        
      Integer value = fruitMap.get("Apple");
      if (value != null){
        fruitMap.put("Apple", value = 1 );
        
      }System.out.println(fruitMap.get("Apple")); //5


      // Can we put null value to the entry?
      fruitMap.put("ABC", null);
      System.out.println(fruitMap.size()); //3

    // Can we put null key to the entry?
      fruitMap.put(null, 999);
      fruitMap.put(null, 1000);
      System.out.println(fruitMap); // {null = 1000, Apple= 5, ABC = null, APPLE =3 }
      System.out.println(fruitMap.size()); // 4

      System.out.println(fruitMap.containsValue(1000)); // true

      System.out.println(fruitMap.isEmpty()); // false
      System.out.println(fruitMap.getOrDefault("Orange", 0)); //0
      System.out.println(fruitMap.getOrDefault("Apple", 0)); // 5
      Integer removeEntryValue = fruitMap.remove("APPLE");
      System.out.println(removeEntryValue); // 3

      fruitMap.put("Cherry", fruitMap.getOrDefault("Cherry", 0) + 1);

        fruitMap.clear();
        System.out.println(fruitMap.size()); // 0, entry count
        System.out.println(fruitMap.isEmpty());

        // 
        HashMap<Integer, Book> bookMap = new HashMap<>();
        // creat books and put some books in map
        // 1 ABC
        // 2 IJK
        // 3 DEF
        // print Map size

        Book b1 = new Book("ABC", 1);
        Book b2 = new Book("IJK", 2);
        Book b3 = new Book("DEF", 3);

        bookMap.put(b1.getId(), b1);
        bookMap.put(b2.getId(), b2);
        bookMap.put(b3.getId(), b3);
        System.out.println(bookMap.size());
        
        //Store the book count
        HashMap<Book, Integer> bookMap2 = new HashMap<>();
        // put some books in map
        // 1 ABC
        // 2 IJK
        // 3 DEF
        // 3 DEF
        
        Book b4 = new Book("ABC",1);
        Book b5 = new Book("IJK",2);
        Book b6 = new Book("DEF",3);
        Book b7 = new Book("DEF",3);

        bookMap2.put(b4, bookMap2.getOrDefault(b4, 0 ) + 1);
        bookMap2.put(b5, bookMap2.getOrDefault(b5, 0 ) + 1);
        bookMap2.put(b6, bookMap2.getOrDefault(b6, 0 ) + 1);
        bookMap2.put(b7, bookMap2.getOrDefault(b7, 0 ) + 1);



        System.out.println(bookMap2.size()); //3
    }
}
