package lesson_09;

public class LessonArrays09 {
    public static void main(String[] args) {
        int[] array;
        //какой-то код
        array = new int[5];
//        int array2[]; option 2, not recommend

//        int a;
//        a = 10;
        int a = 10;

        int[] array2 = new int[10]; // 0
        int[] array3 = new int[a];

        char[] chars = new char[5]; // 0 -default

        String[] strings = new String[7]; // null
        String str = null;
        boolean[] booleans = new boolean[100]; // false

        String[] strings1 = new  String[]{"One", "Two", "regert"};
        String[] strings2 = {"One", "Two", "regert"};

        int[] numbersOne = new int[5]; // {0,0,0,0,0}
        int[] numbers = new int[]{1, 5, -16, 25, 15845};

        int[] numbers2;
        numbers2 = new int[]{1, 58, -16, 25, 5676};
//        numbers2 =  {1, 58, -16, 25, 5676};  illegal


        int[] myArray = {1, 5, -16, 25, 15845};

        int digitIndex1 = myArray[1];
        System.out.println("digitIndex1= " + digitIndex1);
        myArray[1] = 10;
        int digitIndex1New = myArray[1];
        System.out.println("New value: " + digitIndex1New);





    }
}
