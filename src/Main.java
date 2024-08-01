import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запросить у пользователя два целых числа
        System.out.print("Введите первое целое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число (b): ");
        int b = scanner.nextInt();

        // Сравнить числа и вывести результат
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Выполнить арифметические операции и вывести результаты
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient;
        if (b != 0) {
            quotient = (double) a / b;
            System.out.println("Результаты операций:");
            System.out.println("Сложение: " + a + " + " + b + " = " + sum);
            System.out.println("Вычитание: " + a + " - " + b + " = " + difference);
            System.out.println("Умножение: " + a + " * " + b + " = " + product);
            System.out.println("Деление: " + a + " / " + b + " = " + quotient);
        } else {
            System.out.println("Результаты операций:");
            System.out.println("Сложение: " + a + " + " + b + " = " + sum);
            System.out.println("Вычитание: " + a + " - " + b + " = " + difference);
            System.out.println("Умножение: " + a + " * " + b + " = " + product);
            System.out.println("Деление: деление на ноль невозможно");
        }
    }
}