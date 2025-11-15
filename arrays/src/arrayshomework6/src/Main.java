//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1) Объявить и инициализировать массив int из не менее 10 элементов
        int[] arr = {12, -3, 7, 0, 42, 5, 18, 9, -11, 26};

        // 2) Сумма всех элементов
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Сумма элементов: " + sum);

        // 3) Среднее арифметическое
        double average = (double) sum / arr.length;
        System.out.println("Среднее арифметическое: " + average);

        // 4) Сортировка по убыванию
        int[] sortedDesc = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedDesc); // сортировка по возрастанию
        reverse(sortedDesc);     // разворот -> убывание
        System.out.println("Отсортированный по убыванию: " + Arrays.toString(sortedDesc));

        // 5) Разделение на чётные и нечётные
        int evenCount = 0, oddCount = 0;
        for (int value : arr) {
            if (value % 2 == 0) evenCount++;
            else oddCount++;
        }

        int[] evens = new int[evenCount];
        int[] odds = new int[oddCount];
        int ei = 0, oi = 0;
        for (int value : arr) {
            if (value % 2 == 0) evens[ei++] = value;
            else odds[oi++] = value;
        }

        System.out.println("Чётные: " + Arrays.toString(evens));
        System.out.println("Нечётные: " + Arrays.toString(odds));
    }

    // Вспомогательная функция разворота массива
    private static void reverse(int[] a) {
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
    }
}
