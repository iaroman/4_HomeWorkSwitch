public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("... Задача 1 ...");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
        }
    }
    public static void task2() {
        System.out.println("... Задача 2 ...");
        int clientOS = 0;
        int clientDeviceYear = 2019;
        if (clientDeviceYear >= 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
            }
        }
    }
    public static void task3() {
        System.out.println("... Задача 3 ...");
        int year = 2400;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println(year + " год високосный");
        else
            System.out.println(year + " год не является високосным");

    }
    public static void task4() {
        System.out.println("... Задача 4 ...");
        int deliveryDistance = 1000;
        if (deliveryDistance > 100)
            System.out.println("Свыше 100 км доставка не осуществляется");
        else if (deliveryDistance <= 100 && deliveryDistance >= 60)
            System.out.println("Для доставки потребуется 3 дня");
        else if (deliveryDistance < 60 && deliveryDistance >= 20)
            System.out.println("Для доставки потребуется два дня");
        else
            System.out.println("Для доставки потребуются одни сутки");
    }
    public static void task5() {
        int monthNumber = 10;
        System.out.println("... Задача 5 ...");
        switch (monthNumber) {
            case 1:
                System.out.println("Сейчас зима");
                break;
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
                System.out.println("Сейчас весна");
                break;
            case 4:
                System.out.println("Сейчас весна");
                break;
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
                System.out.println("Сейчас лето");
                break;
            case 7:
                System.out.println("Сейчас лето");
                break;
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
                System.out.println("Сейчас осень");
                break;
            case 10:
                System.out.println("Сейчас осень");
                break;
            case 11:
                System.out.println("Сейчас осень");
                break;
            case 12:
                System.out.println("Сейчас зима");
                break;
            default:
                System.out.println("На нашей планете нет такого месяца!");
        }

    }
}