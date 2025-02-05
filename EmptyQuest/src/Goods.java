public class Goods {
    private String id;
    private String name;
    private double price;
    private int count;

        public Goods(){

        }
        public Goods(String id, String name, double price, int count){
            this.id = id;
            this.name = name;
            this.price = price;
            this.count = count;
        }

        public void setId(String id){
            this.id=id;
        }
        public String getId(){
            return id;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
        public void setPrice(double price){
            this.price=price;
        }
        public double getPrice(){
            return price;
        }
        public void setCount(int count){
            this.count = count;
        }
        public int getCount(){
            return count;
        }
    
}
