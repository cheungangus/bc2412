public class Pig extends Animal {
    // more attributes

    public Pig() {
    // implicitly calling super()
    // super(); // Animal()
    //super("XYZ"); // Animal("ABC")
    }

    private int age;
    
    public Pig(String name,int age ){
        super(name);
        this.age = age;
    }

   
    public void sleep(){
        System.out.println("Pig is sleeping");

    }

    public static void main(String[] args){
        Pig pig = new Pig("HIJ",6);
        Pig pig2 = new Pig();
        System.out.println(pig.getName());
        pig.sleep();
        System.out.println(pig2.getName());
         
    }
}
