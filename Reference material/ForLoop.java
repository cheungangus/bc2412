
    // for loop & while loop 區別：
    // for loop : 知道循環次數 or 範圍
    // while loop : 只知道循環的結束條件
    
public class ForLoop {
    public static void main(String[] args) {

//* for loop*/ 
        // for loop => for(初始；判斷；控制 ){
        // 循環 System.out.println() };
        // 1. 執行初始(只執行一次) 。 
        // 2. 判斷：false:結束; true:執行控制。 
        // 3. 重新循環
        
        // 正向
        for (int i = 1; i < 6 ; i++){
            System.out.println(i);
        }
        System.out.println(" ==================");
        // 反向
        for (int i = 6; i >=1  ; i--){
            System.out.println(i);
        }

        for(int i = 1; i <= 5 ;i++){
            System.out.println("第" + i + "次執行斷線重連線");
        }
        System.out.println(" ==================");

        // 1-5之間的和
//         int sum = 0;     // main之內, 均可使用

//         for(int i = 0; i < 101 ; i++){
//             //int sum = 0; // for loop之內

//             sum += i;    // sum = sum + 1
//            // System.out.println(sum); // 當前變量只在本次循環有效，結束後變量再內存中消失，第二次循環開始後重新定義新變量
//         }
//          System.out.println(sum);

// 求和：
        //  int sum = 0;
        //  for ( int i = 0 ; i < 101 ; i++){
        //     if(i % 2== 0 ){
        //         sum = sum + i;
        //      }
        //  }
        //  System.out.println(sum);
         
        // int sum = 0;
        // for (int i = 0 ; i < 100 ; i++){
        //     if ( i % 3 == 0 && i % 5 ==0) {
        //         sum = sum +i;
        //     }
        // }
        // System.out.println(sum);

//求總數        // int count = 0;  
        // for (int i = 0 ; i < 100 ; i++){
        //     if ( i % 3 == 0 && i % 5 ==0) {
        //         count++;
        //     }
        // }
        // System.out.println(count);
         
    


//* WhileLoop */ :
    int i = 1;
    while(i < 101){
        System.out.println(i);
        i++;
    }

// Question 1 : 
// 世界最高山峰是珠穆朗瑪峰(8844.43米 = 8844430毫米),加入有一張紙，它的厚度是0.1毫米。要折疊多少次才可以這成珠穆朗瑪峰的高度？
    double mountHeight = 8844430; // 定義變量為山峰高度
    double paperHeight = 0.1; // 定義變量為紙張高度
    int count= 0; //統計次數
    while(paperHeight < mountHeight){    // 選擇while loop原因為只知道循環的結束條件
        paperHeight = paperHeight * 2 ; // 折疊紙張
        count++;    // 每折疊一次，統計次數要++
    } 
    System.out.println(count); // 27
System.out.println(" ========================");
// Question 2 : 
// 如果整數x是回文數，打印true。 否則返回false。 (回文數指正序及倒敘都是一樣的整數e.g 121是回文數，123不是)
    
    int x = 12345;
    int temp = x; // 定義臨時變量x的值，用於最後比較
    int num = 0;
    while (x != 0) { 
        int 個位 = x % 10;    //從右往左獲取每個數字
        x = x / 10;
        num = num * 10 + 個位; // 把當前獲取到的數字拼接到最右邊
    }
    System.out.println(x); //0
    System.out.println(num); // 54321
    System.out.println(num == temp); // false
    System.out.println(" ========================");

// Question 3 : 
// 給定兩個整數，被除數和除數(均是整數，且不能超過int)。 兩數相除，不能使用乘法，除法及 %。 得到商和餘數 
// (被除數 / 除數 = 商...餘數)
    int divided = 100; // 定義被除數
    int divisor = 40; // 定義除數
    int TotalCount = 0; //定義變量統計相見多少次
    while (divided >= divisor) {  // 在循環中，不斷用被除數 - 除數； 只要被除數大於除數，就一直循環
        divided = divided - divisor;
        TotalCount++; //只要減一次統計變量就自增一次
    }
    System.out.println(divided); // 26
    System.out.println(TotalCount); //2
    System.out.println(" ========================");

// Continue;
//     for (int i = 1; i <= 5; i++){
//         if(i == 3){
//             continue; // 跳過本次循環,繼續下次循環
//         }
//         System.out.println(i); // 1,2,4,5
//     }

//  Break
//     for (int i = 1; i <= 5; i++){
//         if(i == 3){
//             break; // 結束整個循環
//         }
//         System.out.println(i); // 1,2
//     }
    
//      or 

//  for (int i = 1; i <= 5; i++){
//         System.out.println(i); // 1,2,3
//     if(i == 3){
//             break; // 結束整個循環
//         }
//     }
// Question 4 : 
// 從任意一個數字開始報數， 包含7或7的倍數都說pass。
// for(int i = 0; i < 101; i++){
//     if (i % 10 ==7 || i/ 10 % 10 ==7 || i % 7 ==0){
//         System.out.println("pass");
//         continue;
//     }
//     System.out.println(i);
// }

    }
}
