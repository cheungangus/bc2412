import java.math.BigDecimal;

public class Square extends Shape {
    private double side;

    public Square(double side,double length){
        this.side = side;
        this.length = length;
    }
    
    public double setSide(){
        return this.side;
    }
    public double SetLength(){
        return this.length;
    }

    public double getSide(){
        return this.side;
    }
    public double getLength(){
        return this.length;
    }
    

    public double calculateArea (){
        return BigDecimal .valueOf(this.side) //
        .multiply(BigDecimal.valueOf(this.side)) //
        .doubleValue();
    }
    
    public static void main(String[] args){
        Square s1 = new Square(Color.BlUE,5.0,1.0);
        System.out.println(s1.getColor() + " " + s1.calculateArea());
    }

}
