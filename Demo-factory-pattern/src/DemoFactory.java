import factory.ModernFurnitureFactory;
import furniture.Chair;

public class DemoFactory {
    public static void main(String[] args) {

        // Create chair
        FurnitureFactory factory = new ModernFurnitureFactory();
        
        Chair chair = factory.createChair(); // decouple

        //Runtime Polymorphism
        Chair mc = new ModernChair();
        Chair vc = new VictorianChair();

        System.out.println(mc.sitOn());
        System.out.println(mc.hasLegs());
        System.out.println(vc.sitOn());
        system.out.println(vc.hasLegs());

    }
}
