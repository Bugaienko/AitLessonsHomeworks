package homework03;

public class Task02 {
    public static void main(String[] args) {
        double priceA = 1000;
        double priceB = 500.0;

        int discount = 10;
        // a * 0.9


        double priceWithDiscount = (priceA + priceB) * (double) (100 - discount) / 100;
        System.out.println(priceWithDiscount);

        double sumWithoutDiscount = priceA + priceB;
        double discountMoney = sumWithoutDiscount * discount / 100;
        double sumWithDiscount = sumWithoutDiscount - discountMoney;

        System.out.println("Price without discount: " + sumWithoutDiscount);
        System.out.println("Discount : " + discountMoney);
        System.out.println("Price with discount : " + sumWithDiscount);


    }

}
/*
**Задача 2.**
        Пусть цена товара A обычно составляет 1000 Euro, и товара B составляет 500 Euro.
        Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
        Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой.
        Отдельно выведите на экран сумму скидки от этой покупки.

 */
