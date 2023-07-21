package homework03;

public class Task03 {
    public static void main(String[] args) {
        int temp1 = 24;
        int temp2 = 27;
        int temp3 = 26;

        final int NUMBER = 1; //Объявление константы
//        NUMBER = 2; Недопустимо


        double averageTemp = (double)( temp1 + temp2 + temp3) / 3;
        System.out.printf("Average temp %% ist: %.2f and %.3f", averageTemp, averageTemp);
        //Привет, "Маша"

        System.out.println();
        System.out.println("Привет, \"Маша\"");


    }
}
/*
**Задача 3.**
Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю.
Вычислите среднюю температуру за неделю и выведете ее на печать.
 */
