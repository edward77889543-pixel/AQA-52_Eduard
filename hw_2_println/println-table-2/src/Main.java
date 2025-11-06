//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число для таблицы умножения: ");
        if (!sc.hasNextInt()) {
            System.out.println("Ошибка: требуется целое число. Перезапустите программу и введите корректное значение.");
            sc.close();
            return;
        }

        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Информация: для отрицательных чисел таблица умножения не выводится.");
        } else if (n >= 100) {
            System.out.println("Информация: для чисел 100 и более таблица умножения не выводится.");
        } else if (n == 0) {
            System.out.println("Информация: умножение на 0 во всех случаях даёт 0. Таблица не выводится.");
        } else {
            System.out.println("Таблица умножения для " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }

        sc.close();
    }
}


