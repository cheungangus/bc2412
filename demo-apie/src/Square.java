import java.math.BigDecimal;

public class Square extends Shape {
    private double side;

    public Square(String color, double side){
        super(color);
        this.side = side;
    }

    public String color(){
        return this.color();
    }
    public double setSide(){
        return this.side;
    }
    public double calculateArea (){
        return BigDecimal .valueOf(this.side) //
        .multiply(BigDecimal.valueOf(this.side)) //
        .doubleValue();
    }
    public static void main(String[] args){
        Square s1 = new Square("blue", 5);
        System.out.println(s1.getColor() + " " + s1.calculateArea());
    }

}
