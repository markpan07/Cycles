public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задача 3");
        for (int a = 0; a>=0 && a <= 17 && a % 2 == 0; a+=2) {
            System.out.println(a);
        }

        System.out.println();
        System.out.println("Задача 4");
        for (int a = 10; a>=-10 && a <= 10; a--) {
            System.out.println(a);
        }
        
        System.out.println();
        System.out.println("Задача 5");
        for (int year = 1904; year <=2096; year += 4) {
            System.out.println(year + " год является високосным");
        }

        System.out.println();
        System.out.println("Задача 6");
        for (int b = 7; b < 100; b += 7) {
            System.out.println(b);
        }

        System.out.println();
        System.out.println("Задача 7");
        for (int c = 1; c <= 512; c *= 2) {
            System.out.println(c);
        }

        System.out.println();
        System.out.println("Задача 8");
        int moneyPerMonth = 29000;
        int total = 0;

        for (int i = 1; i <= 12; i += 1) {
            total = total + moneyPerMonth;
            System.out.println("Месяц " + i + ", сумма накоплений " + total);
        }

        System.out.println();
        System.out.println("Задача 9");
        int moneyMonth = 29000;
        int sum = 0;

        for (int i = 1; i <= 12; i += 1) {
            sum = sum + sum/100;
            sum = sum + moneyMonth;
            System.out.println("Месяц " + i + ", сумма накоплений " + sum);
        }

        System.out.println();
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i += 1) {
            int result = 2 * i;
            System.out.println("2 * " + i + "= " + result);
        }
    }
}