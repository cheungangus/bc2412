public class test6 {
    public static void main(String[] args) {
        // 求數組最大值
        int[] arr = {22,44,66,55,77,88,111};
        // 調用方法求最大值
        int max = getMax(arr); // 傳遞max到方法內
        //打印
        System.out.println(max);
        
    }
    
    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length ; i++){
            if (arr[i] > max ) {
                max = arr[i]; 
            }
        }
        return max;
    }
}
