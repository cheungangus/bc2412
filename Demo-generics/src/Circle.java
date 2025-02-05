import java.util.Objects;

public class Circle extends Shape { // parent class : color
    // square, triangle
    // area() return double
    private double radius;

    // if you don't specify the constructor , implicitly you have an empty constructor
    
    public Circle(double radius){
       
        this.radius = radius;
    }
    

   public double setRadius() {
    return this.radius;
   }

   public double getRadius(){
    return this.radius;
   }


   // Override the parent given method
   // compiler will help to check if the parent class has a area() method
   
   @Override 
   public double area (){
        return BigDecimal .valueOf(this.radius) //
        .multiply(BigDecimal.valueOf(this.radius)) //
        .multiply(BigDecimal.valueOf(Math.PI))//
        .doubleValue();
    }



 
}
