package lesson_10;

public class LoopFor {
    public static void main(String[] args) {
       /*
        for ([начальные значения] ; [условие]; [изменение счетчика]) {
            тело цикла
        }

        */

        int j = 0;
        while (j < 10) {
            System.out.print(j + " ");
            j += 5;
        }
        System.out.println(j);
        System.out.println();
        System.out.println("End while loop");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("End for loop");

        for (int i = 0; i <= 100; i = i + 5) {
            System.out.println(i);
        }

        for (int i = 0; i <= 100; i = i + 5) {
            System.out.println(i);
        }

        /*
        // минимально достаточное инициализация цикла for
        for ( ; ; ){ // бесконечный цикл, в котором отсутствуют блок инициализация, блок условия и блок инкремента
            System.out.println("hello");
        }
         */

//        Вывести все числа от 10 до 0
        int y = 10;
        int i;
        // код изменяющая i
        i = 14;
        for (int a = 0; i >= 0; i--, a++, j -= 2) {
            System.out.println(i + ":" + a);
        }
        System.out.println();
        System.out.println(i);

        int[] array = {5, 10, 43, 545, -10, -23, 0, 15};

        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.println();

        // вывести на экран все числа от 5 до 20;

    }
}
