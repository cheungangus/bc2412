import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

// 1.     //建立 LinkedList => LinkedList<String > xxx = new HashSet<>();
        LinkedList<String> fruits = new LinkedList<>();
        
// 2.    // add. 添加 => // xxx.add(""); ( Remarks:重複添加亦不會被顯示 )

        fruits.add("Apple");  
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

// 3.   // 查看當前數量
        int size = fruits.size();
        System.out.println(fruits.size()); 

// 4.   // 顯示HashSet 內容
        System.out.println("fruits list: " + fruits);

// 5.   // 刪除 ”項目“
        fruits.remove("Banana");
        System.out.println("The list of fruits after revised :" + fruits);

// 6.   // 檢查 ”某項目“ 是否存在        
        if(fruits.contains("Cherry")){
            System.out.println("Cherry is in the fruit list ");
        }else{
            System.out.println("Cherry is not in the fruit list");
        }

// 7.   // 反轉   
        LinkedList<String> reversed = new LinkedList<>();
        for (int i = fruits.size() - 1; i >= 0; i--){
            reversed.add(fruits.get(i));
        }
        System.out.println("The list of after reversed: " + reversed);

// 8.   //儲存整數並計算綜合
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        System.out.println("the totla of numbers: "+ sum);

        
    }
}
