public class Homework {


    private static void highYearCalculation(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }
    public static void main(String[] args) {

        task1();

    }

    private static void task1() {

        System.out.println("Задача 1");

        int year = 2021;
        highYearCalculation(year);

    }

}
