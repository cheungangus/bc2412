public class GoodsTes {
    public static void main(String[] args) {
        
        // 創建數組
        Goods[] arr = new Goods[3];
        //創建三個商品對象
        Goods g1 = new Goods("001", "Apple", 5999.00, 100);
        Goods g2 = new Goods("002", "保溫杯", 227.00, 50);
        Goods g3 = new Goods("003", "枸杞", 12.70, 70);
        // 把商品添加到數組中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        //遍歷
        for(int i = 0; i < arr.length; i++){
            // i 索引arr[i]元素
            Goods goods = arr[i];
            System.out.println(goods.getId() + ", " + goods.getName() + 
            ", " + goods.getPrice() + ", "+ goods.getCount());
        }

    }
}
