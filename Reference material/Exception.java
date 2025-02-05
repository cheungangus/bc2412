public class Exception {
    public static void main(String[] args) {
        

        //ArithmeticExceptionExample  - 常用於表示數學運算中的錯誤; 
        // 常見情況：整數除以零 or 溢出
        // public class ArithmeticExceptionExample {
        //     public static void main(String[] args) {
        //         try {
        //             int a = 10;
        //             int b = 0; // 除數為零
        //             int result = a / b; // 這一行將引發異常
        //         } catch (ArithmeticException e) {
        //             System.out.println("Caught an ArithmeticException: " + e.getMessage());
        //         }
        //     }
        // }

    // ArrayIndexOutOfBoundsException - 常用於訪問數組中不存在的索引。
    // 常見情況： 嘗試訪問一個負的索引 & 一個等於或大於數組的長度的索引。
        // public class ArrayIndexOutOfBoundsExample {
        //     public static void main(String[] args) {
        //         int[] numbers = {1, 2, 3, 4, 5};
        
        //         try {
        //             // 嘗試訪問不存在的索引
        //             System.out.println(numbers[5]); // 引發異常，因為最大索引是 4
        //         } catch (ArrayIndexOutOfBoundsException e) {
        //             System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        //         }
        //     }
        // }

    //NullPointerException 常用於訪問或操作一個為 null 的對象時，的異常。
    // 常見情況：嘗試訪問對象的成員（方法或屬性）；嘗試調用 length 屬性在數組上 及 調用方法在 null 對象上。
    // public class NullPointerExceptionExample {
    //     public static void main(String[] args) {
    //         String str = null; // 對象為 null
    
    //         try {
    //             // 嘗試訪問 null 對象的長度
    //             System.out.println("Length of the string: " + str.length());
    //         } catch (NullPointerException e) {
    //             System.out.println("Caught a NullPointerException: " + e.getMessage());
    //         }
    //     }
    // }

    // NumberFormatException 當您嘗試將字符串轉換為數字類型（如 int、double 等）時，若字符串的格式不正確，將引發此異常。
    // 常見情況： 字符串包含非數字字符 , 字符串為空 &  字符串表示的數字超出了目標數據類型的範圍
    
    // public class NumberFormatExceptionExample {
    //     public static void main(String[] args) {
    //         String invalidNumber = "123abc"; // 無法轉換的字符串
    
    //         try {
    //             // 嘗試將字符串轉換為整數
    //             int number = Integer.parseInt(invalidNumber);
    //             System.out.println("Parsed number: " + number);
    //         } catch (NumberFormatException e) {
    //             System.out.println("Caught a NumberFormatException: " + e.getMessage());
    //         }
    //     }
    // }
    
    
    }
}
