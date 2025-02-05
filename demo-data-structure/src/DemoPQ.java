
import java.util.PriorityQueue;

public class DemoPQ { 

    public static class Person {

        private int age;
        private String name;

        public Person(int age, String name){
            this.age = age;
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setName(String name){
            this.name = name;
        }
        
        public int  getAge(){
            return this.age;
        }
        public String getName(){
            return this.name;
        }
        
    }
    // Queue
    
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Vincent");
        System.out.println(pq); // [Vincent]

        pq.add("Oscar");
        System.out.println(pq); // [Oscar, Vincen]

        pq.add("Lucas");
        System.out.println(pq);  //[Lucas, Vincen, Oscar]

        System.out.println(pq.size());

        // for poll() , ordering -> String natural order 
        System.out.println(pq.poll()); //Lucas
        System.out.println(pq.poll()); // Oscar
        System.out.println(pq.poll()); // vincent


PriorityQueue<Person> pq2 = new PriorityQueue<>();
        
        pq2.add(new Person(80,"ABC"));
        System.out.println(pq2);

        pq2.add(new Person(90, "IJK"));
        System.out.println(pq2); 

        pq2.add(new Person(70, "AEC"));
        System.out.println(pq2);

    
        

        



        

    }
}

