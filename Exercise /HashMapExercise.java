
import java.util.HashMap;
import java.util.PriorityQueue;

public class HashMapExercise {

    public class Order {
        private String username;
        private int price;

    public Order(String username, int price){
        this.username = username;
        this.price = price;
    }
    public String getNameuser(){
        return this.username;
    }
    public int getPrice(){
        return this.price;
    }

    public void setNamesuer(String username){
        this.username=username;
    }
    public void setPrice(int price){
        this.price=price;
    }

    public static void main(String[] args) {
        HashMap<String,Integer> orderList = new HashMap<>();
        PriorityQueue <Integer> price = new PriorityQueue<>();

    public void addOrder(String username, String price){
        orderList.put("Apple", 100);
        System.out.println(orderList);

        orderList.put("Orange", 300);
        orderList.put("MacBook", 150);
        orderList.put("charge", 102);
        orderList.put("movies", 400);
        orderList.put("water", 200);
    
        System.out.println("add order: " + orderList +  " -> $" + price);

    }
        
    }







}







    }




   

            
        
