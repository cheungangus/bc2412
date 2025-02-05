public class SortByColor {

    public class SortByColor implements Comparator<Ball>{
        
        @Override
        public int compara(Ball b1, Ball b2){
            return b1.getValue() > b2.getValue() ? -1 : 1;
         }
    }
}
