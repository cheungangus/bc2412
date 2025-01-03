import java.math.BigDecimal;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height){
        super(color);
        this.base = base;
        this.height = height;
    }
    public String color(){
        return this.color();
    }
    public double setBase(){
        return this.base;
    }
    public double setHeight(){
        return this.height;
    }
public double calculateArea (){
        return BigDecimal .valueOf(this.base) //
        .multiply(BigDecimal.valueOf(this.height)) //
        .divide(BigDecimal.valueOf(2))//
        .doubleValue();
    }
    public static void main(String[] args){
        Triangle t1 = new Triangle("Yellow",5.0,10.0);
        System.out.println(t1.getColor() + " " + t1.calculateArea());
    }
}
