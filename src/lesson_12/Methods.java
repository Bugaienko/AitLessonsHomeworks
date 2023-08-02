package lesson_12;

public class Methods {
    public static void main(String[] args) {
//        powMethod(3);

//        int resultFromMethod = 10 ;
//        resultFromMethod = 10 + 5;
//        resultFromMethod = (25 > 5) ? 11 : 5;

        int resultFromMethod = powIntMethod(3);
        // resultFromMethod = powMethod(3); // тип метода void. Ничего не возвращается. Нельзя присвоить "ничего" в переменную

        System.out.println(resultFromMethod);

        // напишите метод, принимающий в параметры число и возвращающего квадрат этого числа.

        System.out.println("++++++++++++++++++++");
        int squareForPrint = squareMethod(2);
        System.out.println(squareForPrint);
        System.out.println(squareMethod(5));
    }

    // Methods main

    public static int squareMethod(int x) {
        int result; //объявление переменной, в которую будет "сложен" результат вычислений в методе
        result = x * x; // сами вычисления, необходимые для реализации поставленной задачи
        return result; // возвращаем результат работы метода
    }

    public static void powMethod(int x) {
        if (x >= 0) {
            int result = 1;
            for (int i = 0; i < x; i++) {
                result = result * 2;
            }
            System.out.println("2 в степени " + x + " равно: " + result);
        } else {
            System.out.println("Не верные аргументы вызова метода");
        }
    }

    public static int powIntMethod(int x) {
        int result = 1; // объявление переменной, в которой будет храниться результат вычислений в методе.
                        // Тип этой переменной совпадает с указанным типом возвращаемого значения метода
        if (x >= 0) {
            for (int i = 0; i < x; i++) {
                result *= 2;
            }
        } else {
            // x < 0
        }
       return result; //Возвращаем результат наших вычислений. Тип строго должен соответствовать указанному типу возвращаемого значения метода
    }


}
