//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Проверка простоты числа
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int d = 3; d * d <= n; d += 2) {
            if (n % d == 0) return false;
        }
        return true;
    }

    // Список простых чисел от 0 до N
    private static List<Integer> primesUpTo(int N) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    // Факториал через BigInteger
    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите положительное целое число: ");
        if (!sc.hasNextInt()) {
            System.out.println("Ошибка: требуется целое число.");
            sc.close();
            return;
        }

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: число должно быть больше 0.");
            sc.close();
            return;
        }

        // Простые числа в одну строку через запятую
        List<Integer> primes = primesUpTo(n);
        if (primes.isEmpty()) {
            System.out.println("Простые числа: отсутствуют в диапазоне до " + n);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < primes.size(); i++) {
                sb.append(primes.get(i));
                if (i < primes.size() - 1) sb.append(", ");
            }
            System.out.println(sb.toString());
        }

        // Факториал на новой строке
        BigInteger fact = factorial(n);
        System.out.println(fact);

        sc.close();
    }
}
