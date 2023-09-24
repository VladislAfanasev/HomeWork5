public class Main {
    public static void main(String[] args) {
        char clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        char clientOS1 = 1;
        char clientDeviceYear = 2019;
        if (clientDeviceYear >= 2015) {
            if (clientOS1 == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientDeviceYear < 2015) {
            if (clientOS1 == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        System.out.println();

        int year = 2020;
        if (year >= 1584) {
        if (year % 400 == 0) {
            System.out.println(year+" год является високосным");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year+" год является високосным");
        } else {
            System.out.println(year+" год не является високосным");
        }
        } else {
            System.out.println(year+" год не является високосным");
        }
        System.out.println();

        char deliveryDistance = 95;
        byte aDay = 1;
        byte twoDays = 2;
        byte threeDays = 3;
        if (deliveryDistance <= 100) {
        if (deliveryDistance > 60) {
            System.out.println("Потребуется дней: "+threeDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: "+twoDays);
        } else {
            System.out.println("Потребуется дней: "+aDay);
        }
        } else {
            System.out.println("К сожалению, в вашем районе доставка не работает");
        }
        System.out.println();

        char monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}