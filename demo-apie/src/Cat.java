public class Cat extends Animal { 
    // Animal.class is a parent Class
    // Cat. class is a chlid Class
    // Inherit all attribute from parent class 
    
    //private String name; - 
    private int age;
    // constructor
    public Cat( String name ,int age){
        // this.name = name;
        super(name); // calling parent contructor 
        //( must the be the first line to call super())
        this.age = age;

    }

    // Inherit Parent all instance methods 
    // public String getName(){
    //     return this.name;
    // }

    // walk()
    public void walk(){
            System.out.println("Cat is walking");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("ABC" , 8);
        System.out.println(cat.getName()); // ABC
        cat.walk();

    }



}

