//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, для которого вывести таблицу умножения:");

        int n;
        try {
            n = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: нужно ввести целое число.");
            return;
        }

        System.out.println("Таблица умножения для числа " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        scanner.close();
    }
}

