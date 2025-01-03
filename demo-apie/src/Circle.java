import java.math.BigDecimal;

public class Circle extends Shape { // parent class : color
    // square, triangle
    // area() return double
    private double radius;

    public Circle(String color , double radius){
        super(color);
        this.radius = radius;
    }
    public String color(){
        return this.color();
    }

   public double setRadius() {
    return this.radius;
   }
    public double calculateArea (){
        return BigDecimal .valueOf(this.radius) //
        .multiply(BigDecimal.valueOf(this.radius)) //
        .multiply(BigDecimal.valueOf(Math.PI))//
        .doubleValue();
    }

    public static void main(String[] args){
        Circle c1 = new Circle("Red", 5.0);
        System.out.println(c1.getColor() + " " + c1.calculateArea());
    }

}
