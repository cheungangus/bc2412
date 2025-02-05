import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {
    public static void main(String[] args) {
        
// 1.   // 建立        Queue<String> strings = new LinkedList<>(); 
//                          <String> 可更換其他類型
        //FIFO (遵守First in first out)
        Queue<String> strings = new LinkedList<>(); // linkedlist -> add/remove head/tail
// 2.   // 添加
        strings.add("Oscar");
        strings.add("Vincent");
        strings.add("Lucas"); // addLast
        
// 3.   // 顯示內容
        System.out.println(strings); //[Oscar, Vincent, Lucas]
        System.out.println("========================");
        String head = strings.poll(); // removeFirst
// 4.   // 只取首位
        System.out.println(head); // Oscar
        System.out.println(strings); // [Vincent, Lucas]
        System.out.println("========================");

        // Queue Interface hidden lost of funtions of Linkedlist
// 5.   // 刪除 => .remove(); 默認刪除首位
        strings.remove(); // similar to to  strings.poll();
        System.out.println(strings.contains("Lucas")); //*for loop */ Lucas
        System.out.println("========================");

// 6.   // 鎖定
        // lookup the head element, not pick up
        System.out.println(strings.peek()); //Lucas

        System.out.println(strings.size()); //1
        System.out.println("========================");

        strings.offer("Jenny");

// 7.   // ArrayBlockingQueue - e.g內容為3時true，第4個 為false
        Queue<String> qq = new ArrayBlockingQueue<>(3);
        System.out.println(qq.offer("ABC"));// true
        System.out.println(qq.offer("DEF"));// true
        System.out.println(qq.offer("IJK"));// true
//  qq.poll(); System.out.println(qq.offer("CKE"));// false

        System.out.println(qq.offer("CKE"));// false
        System.out.println("========================");

// 8.   //顯示Queue內容
        // for- each support Queue
        for(String s : strings){
            System.out.println(s); // lucas , Jenny
        }
// 9.   // 添加至末尾
        List<String> newStrings = new ArrayList<>();
        newStrings.add("AAA");
        newStrings.add("BBB");
        strings.addAll(newStrings);
        System.out.println(strings); // [Lucas, Jenny, AAA, BBB]

    }
}
