public class test5 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        printArr(arr);
    }

    // System.out.println("abc"); // 先打印abc再換行
    // system.out.print("abc"); // 只打印abc,不換行
    // system.out.print(); //不打印任何數據，只換行

    //定義方法用於數組的遍歷

    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if( i == arr.length - 1){
                System.out.print(arr[i]); // 
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
