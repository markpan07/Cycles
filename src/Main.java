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
    }
}