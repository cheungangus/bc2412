public class DemoStringBuilder {
    public static void main(String[] args) {
        String s = "Hello";
        s += "!!!";
        s += "???";


        s = "";
        long before = System.currentTimeMillis(); //1737012391348
        
        for( int i = 0 ; i < 100_000; i ++){
            s += "!";
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before); // 608ms

        System.out.println("================");

        StringBuilder sb = new StringBuilder("");
        before = System.currentTimeMillis();
        for( int i = 0 ; i < 100_000; i ++){
            sb.append("!"); // similar to setter
        }
        after = System.currentTimeMillis();
        System.out.println(after - before); // 6ms

        sb = new StringBuilder("abcd");
        sb.reverse(); // String does not have reverse()
        System.out.println(sb); // cba
        
        System.out.println(sb.charAt(2));
        sb.replace(0, 2, "yy");
        System.out.println(sb); // yyba

        sb.deleteCharAt(2); // for loop
        System.out.println(sb); // yya

        sb.setCharAt(2, 'o');
        System.out.println(sb); // yyo

        sb.insert(1, "!!!");
        System.out.println(sb); // y!!!yo


    }
}
