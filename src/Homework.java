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

    private static void deliveryCheck(int deliveryDistance) {

        if (deliveryDistance < 20) {
            System.out.println("Для доставки потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Для доставки потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Для доставки потребуется дней: 3");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }

    }


    public static void main(String[] args) {

        task1();
        task2();
        task3();

    }

    private static void task3() {

        System.out.println("Задача 3");

        int deliveryDistance = 95;
        deliveryCheck(deliveryDistance);

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
