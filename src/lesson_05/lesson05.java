package lesson_05;

public class lesson05 {
    public static void main(String[] args) {

//        Выравнивание кода Ctrl + Alt + L

        int a = 5;
        int b = 10;
        boolean boll = true;
        boolean boll1 = false;
        boolean b1 = (a == b); // a равно b -> ложь / false

        System.out.println(b1); //false
        System.out.println(a == b); //false

        boolean b2 = a != b; // a не равно b -> истина / true
        System.out.println(b2); //true
        System.out.println(b != 10); //false

        boolean b3 = a > b; // a больше b -> ложь / false
        boolean b4 = a < b; // a меньше b -> истина / true
        boolean b5 = b > 10; //  b больше 10 -> ложь / false
        System.out.println("b3 " + b3 + " b4: " + b4 + " b5: " + b5);

        boolean b6 = a >= b; // a больше или равно b -> ложь / false
        boolean b7 = a <= b; // a меньше или равно b -> истина / true
        boolean b8 = b >= 10;
        System.out.println("b6 " + b6 + " b7: " + b7 + " b8: " + b8);
    }
}
