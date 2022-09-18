import java.sql.SQLOutput;
public class Main {    public static void main(String[] args) {
        System.out.println("Задание 6!");
        //Задание 2
        int clientOS = 2;
        int oldSmart = 2020;
        if (clientOS == 0 && oldSmart <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && oldSmart > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1 && oldSmart <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && oldSmart > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        //Задание 3
        int year = 1400;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(+ year + " год является високосным. ");
        }else{
            System.out.println(+ year + " год не является високосным.");
        }
        //Задание 4
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance >=0 && deliveryDistance <20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        }else if (deliveryDistance >=20 && deliveryDistance <60) {
            System.out.println("Потребуется дней: " + (deliveryDay + 1));
        }else if (deliveryDistance >=60 && deliveryDistance <=100) {
            System.out.println("Потребуется дней: " + (deliveryDay + 2));
        }else{
            System.out.println("Расcтояние слишком большое");
        }

    }
}