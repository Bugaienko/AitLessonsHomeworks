package homework12;

import java.util.Random;

public class HW12 {
    public static void main(String[] args) {
        Random random = new Random();

        { // сравнение скорости работы двух методов
            int[] numbers = new int[100_000];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100_000);
            }

            long timeStart = System.currentTimeMillis(); // засекаем текущее время в мс

            int count = 0;
            for (int value : numbers) {
//            if (isNumberPrime(value)) { // 1106, 1176, 1053, 1078, 1086
                if (isNumberPrimeVar2(value)) { // 8, 6, 10, 10, 5
                    count++;
                }
            }
            System.out.println(count);

            long timeEnd = System.currentTimeMillis(); // опять засекаем время после завершения цикла
            System.out.println("Затрачено времени: " + (timeEnd - timeStart));
        }
    } // end main

    // Methods area

    /*
    Написать метод принимающий целое число и проверяющий является ли число простым.
    Если является, метод должен вернуть true, не является - false
     */

    public static boolean isNumberPrime(int number) {
//        boolean result = true;
        if (number <= 1) return false;

        //number = 1;   2 < 1 -> false
        //number = 5 -> i = 2; 2 < 5 -> true
        //number = 5 -> i = 3; 3 < 5 -> true
        //number = 6 -> i = 2; 2 < 6 -> true
        for (int i = 2; i < number; i++) { // 2, 3, 4 .. number -1) || 25 > (2, 3, 4, 5, 6, 7 ..24)
            // 5 % 2 -> (1 == 0)
            // 5 % 3 -> (2 == 0)
            // 6 % 2 -> (0 == 0)
            if (number % i == 0) {
                return false; // number 6 - > ^ false
            }
        }
        return true;
    }


    public static boolean isNumberPrimeVar2(int number) {
//        boolean result = true;
        if (number <= 1) return false;

        //number = 1;   2 < 1 -> false
        if (number % 2 == 0 || number % 3 == 0) return false;
        // number = 64. Цикл проверит только делители 5, 7 - т.е. всего 2 итерации
        for (int i = 5; i < Math.sqrt(number); i += 6) { //  5, 7, 11, 13, 17, 19, 23, 25, 29, 31)

            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void sayHello() { //работа return в void методах
        int count = 0;
        System.out.println("Hello");
        count++;
        if (count == 2) {
            return;
        }
        System.out.println("Again hello");
    }
}
