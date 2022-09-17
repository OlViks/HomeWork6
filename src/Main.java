import java.sql.SQLOutput;
public class Main {    public static void main(String[] args) {
        System.out.println("Задание 6!");
        //Задание 1
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
    }
}