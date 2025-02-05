public class test7 {
    public static void main(String[] args) {
        int[] arr = {22,45,12,56,70,236,7,1};

        boolean flag = contains(arr, 2);
        System.out.println(flag);
    }

    public static  boolean contains(int[] arr , int number){
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] == number){
                return true;  //break = 結束for 循環， 跳到下面的return
            }else{

            }
        }
        //什麼時候才能斷定不存在
        //當數組裡所有的數字比較之後才可斷定
        return false;
    }
}
// return break 
// return 跟循環無關， 跟方法有關。 1.結束方法 ； 2.返回結果。 如果執行到return, 整個方法跟裡面的循環都結束
// break 跟方法無關， 跟結束循環或switch有關