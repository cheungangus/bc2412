import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeExample  {

    public static void main(String[] args) {
// 1.   // 建立  Deque<String> strings = new LinkedList<>();

        Deque<String> strings = new LinkedList<>();
// 2.   // 添加
        strings.add("Lucas"); // addLast
        strings.add("Vincent");
        strings.add("Oscar");

// 3.   // addFirst -> 直接添加至首位
        strings.addFirst("Jenny");
        System.out.println(strings); //[Jenny, Lucas, Vincent, Oscar]
        System.out.println("========================");

// 4.   //  poll() 默認揀選出首位 ; pollLast() 揀選出末尾 => 揀選後移除
        System.out.println(strings.poll()); //Jenny,  pollFirst();
        System.out.println(strings.pollLast()); // Oscar
        System.out.println("========================");

// 5.   // peek() 默認鎖定出首位 ; peekLast() 揀選出末尾
        System.out.println(strings.peek()); // Lucas , peekFirst
        System.out.println(strings.peekLast()); // vincent

        //support for loop 
        // support remove
        // contains
        // size(), isEmpty

        // Practice ArrayDeque
        Deque<String> ss2 = new ArrayDeque<>();
        Queue<String> ss3 = new ArrayDeque<>();

    }
}

