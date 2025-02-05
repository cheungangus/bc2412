import java.util.HashMap;

public class HashMapExample {
    
    public static void main(String[] args){


 // 1.  //建立 ： HashMap<String, Integer> studentGardes = new HashMap<>();
                           // <String, Integer>  可以進行更換： e.g<String, Double> , <Integer, String>
                          // 可自定義：
                        //   class Person {
                        //     private String name;
                        //     private int age;
                        
                        //     public Person(String name, int age) {
                        //         this.name = name;
                        //         this.age = age;
                        //     } =>         HashMap<Person, Integer> studentGardes = new HashMap<>();


        HashMap<String, Integer> studentGardes = new HashMap<>();

// 2.   // 添加
        studentGardes.put("alice", 85);
        studentGardes.put("bob", 90);
        studentGardes.put("Diana",80);
        studentGardes.put("alex", 85);
        System.out.println(" ========================");
//  3.  //顯示HashMap 內容
        System.out.println("Student and their grades: " + studentGardes); 
        //Student and their grades: {Diana=80, alex=85, bob=90, alice=85}

// 4.   // 檢查 ”某項目“ 是否存在
        String studentToCheck = "bob";
        if(studentGardes.containsKey(studentGardes)){
            System.out.println(studentToCheck + " grades is: " + studentGardes.get(studentToCheck));
            }else{
                System.out.println(studentToCheck + " not in the set"); //bob not in the set
            }

// 5.   //刪除 ”項目“
            studentGardes.remove("alice");
            System.out.println("revised the grades: " + studentGardes); 
            //revised the grades: {Diana=80, alex=85, bob=90}

// 6.   //可以加入不同的HashMap
            //計算字符出現次數的 HashMap:
            HashMap<Character, Integer> charCount = new HashMap<>();
            String input ="Diana";
            for(char c : input.toCharArray()){
                 c = Character.toLowerCase(c); //將字符轉為小寫以便不用區分大小寫
                charCount.put(c, charCount.getOrDefault(c,0) + 1);
            }
            System.out.println("Frequency : " + charCount);  //Frequency : {a=2, d=1, i=1, n=1}
            
        }
    }

