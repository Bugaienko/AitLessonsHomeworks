package lesson_06;

public class Lesson06Main {
    public static void main(String[] args) {
        int x = 8;

//        if (x <= 10) System.out.println("Привет всем!");

        System.out.println("x before if: " + x);
        if (x == 10) {
            x = x - 1;
            System.out.println("x in if: " + x);
        }

        System.out.println("x after if: " + x);



    }
}
