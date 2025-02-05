import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoDeque {
    public static void main(String[] args) {
        //
        Deque<String> strings = new LinkedList<>();
        strings.add("Lucas"); // addLast
        strings.add("Vincent");
        strings.add("Oscar");
        strings.addFirst("Jenny");

        System.out.println(strings); //[Jenny, Lucas, Vincent, Oscar]

        System.out.println(strings.poll()); //Jenny,  pollFirst();
        System.out.println(strings.pollLast()); // Oscar

        System.out.println(strings.peek()); // Lucas , peekFirst
        System.out.println(strings.peekLast()); // Cincent

        //support for loop 
        // support remove
        // contains
        // size(), isEmpty

        // Practice ArrayDeque
        Queue<String> ss3 = new ArrayDeque<>();
        int x = 3;
        if (x > 2) {
            ss3 = new ArrayDeque<>() ;           
        } else {
            ss3 = new LinkedList<>();
        }

            ss3.poll(); // different implementations -> performance according to scenario.
        Deque<String> ss2 = new ArrayDeque<>();
        ss2 = new LinkedList<>();
        // Deque has wider scope (i.e. add / remove / poll / peak first & last)


    }
}
