import java.time.LocalDate;

public class Homework {


    private static void highYearCalculation(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }

    private static void deviceCheck(int clientOS, int clientDeviceYear) {

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }

    public static void main(String[] args) {

        task1();
        task2();

    }

    private static void task2() {

        System.out.println("Задача 2");

        int clientOs = 1;
        int clientDeviceYear = 2010;

        deviceCheck(clientOs, clientDeviceYear);

    }

    private static void task1() {

        System.out.println("Задача 1");

        int year = 2021;
        highYearCalculation(year);

    }

}
