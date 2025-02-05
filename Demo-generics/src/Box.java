
import java.math.BigDecimal;

// Generics

// The T in "Class, instance variable, instance method" are with same definition
// The T in static method is completely different thing. so, we need redefine.
public class Box <T extends Shape> {
    private T[] shapes;

    public Box(){
          this.shapes = (T[]) new Shape[2];
    }

    // the T in instance method refers to the definition T of Class
    public void addShape(int index, T shape){
        this.shapes[index] = shape;
    }

    public double totalArea(){ // shapes[0].area()
        // this. shapes[0].area()
        BigDecimal total = BigDecimal.valueOf(0.0);
        for ( Shape shape : this.shapes){
            total = BigDecimal.valueOf(shape.area()).add(total);
        }
        return total.doubleValue();
    }

    // the T in static method is not referring the T in Class
    public static <T extends Shape> double totalArea2(T[] shapes ){
        return 0.1;
    }


    public static void main(String[] args) {
        
    Box<Circle> box1 = new Box<>();
    box1.addShape(0, new Circle(3.0));
    box1.addShape(1, new Circle(4.0));
    System.out.println(box1.totalArea());

    // add Circle to shape[0]
    // add Square to shape[0]

    Box<Shape> b2 = new Box<>();
    b2.addShape(0, new Circle(3.0));
    b2.addShape(1, new Square(3.0));
    System.out.println(b2.totalArea());

    }
    
}
