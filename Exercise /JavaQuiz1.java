public class JavaQuiz1 {
    public static void main(String[] args){
//  Question    1

        int price = 150;
        int quantity = 10;
        int discount = 0.9;
        System.out.println(price % quantity * discount);

        // what is the output?
        // A : run time error
        // B : compile time error
        // C : 1350 (No error)
        // D : 1350 (but overflow)

//  Question    2

            byte hoursOfDay = 24;
            byte daysOfWeek = 7;
            byte hoursOfWeek = (byte) (hoursOfDay * daysOfWeek);
            System.out.println(hoursOfWeek);
        // what is the output?
        // A : -88
        // B : 168
        // C : 88
        // D : runtime error ( data type "byte" can only store value from -128 to 127.)
        // E : -168

//  Question    3

        String str = "Welcome to programming";
        String newStr = str.replace("WELCOME TO", "");
        char c = newStr.trim().charAt(2);
        System.out.println(c);
        // what is the output?
        // A : p
        // B : r
        // C : o
        // D : l
        // E : e
        
//Question      4

        String s = "hello";
        String newStr = "";

        if(s.length() > 5 || s.indexOf("he") == 1){
            newStr = s;
        }else {
            newStr += "str";
        }
        System.err.println(newStr);
        // what is the output?
        // A : str
        // B : hello
        // C : strhello
        // D : hellostr
        // E : (output an empty line)

//Question      5

        String str = "";

        for (byte i = 127;i < 128; i++){
            str += i;
            if(i < 0){
                break;
            }
        }
        System.out.println(str);
        // what is the output?
        // A : 127
        // B : 127 - 128
        // C : -1
        // D : (infinite loop)
        // E : (output an empty line)

//Question      6

        String str = "";
        for(byte i = 127; i < 128; i++){
            if(i < 0){
                continue;
            }
            str +=i;
        }
        System.out.println(str);
        // what is the output?
        // A : 127
        // B : 127 - 128
        // C : -1
        // D : (infinite loop)
        // E : (output an empty line)

//Question      7

        int[] integers = {20, 10, 40};
        byte[] bytes = new byte[] {2,4,1};
        int score = 0;

        for (int i = 0; i < 3; i++) {
            if (i %2 == 1){
                score += integers[i];
            }else{
                score += bytes[i];
            }
        }
        System.out.println(score);
        // what is the output?
        // A : 31
        // B : 64
        // C : runtime error (array index outbound)
        // D : 13
        // E : 25

//Question      8

        String[] strings = new String[3];
        String sum = "";

        for (int i = 0; i < 3; i++) {
            strings[i] = String.valueOf(i);
            sum += strings[i];
        }
        System.out.print(sum);
        // what is the output?
        // A : 6
        // B : Compile error
        // C : Runtime error
        // D : 123
        // E : 0123

//Question      9

        int a = 0;
        while(a<3){
            switch(a){
                case 0:
                System.out.println("0");
                case 2:
                System.out.println("2");
            }
            a++;
        }
        // what is the output?
        // A : 0202
        // B : 022
        // C : 02
        // D : 0222
        // E : runtime error (No default case in switch statement)

//Question      10

        int g = 3;
        System.out.println(++g *8);
        // what is the output?
        // A : 32
        // B : 33
        // C : 24
        // D : 16
        // E : 40
        }
    }

