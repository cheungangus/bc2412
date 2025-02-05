import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
 // 1.    //建立 HashSet => HashSet<String / Integer / Character> xxx = new HashSet<>();
                                // HashSet<String> 可以進行更換 e.g： < Integer > ,<Character>
        HashSet<String> frutis = new HashSet();
    
 // 2.    // add. 添加 => // xxx.add(""); ( Remarks:重複添加亦不會被顯示 )
        frutis.add("Apple");
        frutis.add("Apple");
        frutis.add("Orange");
        frutis.add("Mango");
        frutis.add("Apple");
    

// 3.   // 顯示HashSet 內容
        System.out.println("Frutis in the set: " + frutis);

// 4.   // 檢查 ”某項目“ 是否存在
        String frutisToCheck = "Orange";
        if(frutis.contains(frutisToCheck)){
            System.out.println(frutisToCheck + "is in the set.");
        } else {
            System.out.println(frutisToCheck + "is not int the set");
        }
    
// 5.   // 刪除 ”項目“

        frutis.remove("Orange");
        System.out.println("Frutis after removing Orange: "+ frutis);

// 6.   // 嘗試添加重複的姓名
         boolean added = frutis.add("Apple");
         if (!added) {
             System.out.println("Apple 已存在於名單中，無法重複添加。");
         }

        }
    
    
}
