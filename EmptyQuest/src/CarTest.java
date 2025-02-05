import java.util.Scanner;

public class CarTest {
    //創建數組
    Car[] arr = new Car[3];
    
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length;i++) {
        Car c = new Car();
        System.out.println("請輸入汽車的品牌");
        String brand = sc.next();
        c.setBrand(brand);
        System.out.println("請輸入汽車的價格");
        int price = sc.nextInt();
        c.setPrice(i);
        System.out.println("請輸入汽車的顏色");
        String color = sc.next();
        c.setColor(color);

        arr[i] = c;

    }
}
