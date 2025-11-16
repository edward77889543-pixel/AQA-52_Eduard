//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

 class ArraysRefactoredMain {
    public static void main(String[] args) {
        int[] arr = {12, -3, 7, 0, 42, 5, 18, 9, -11, 26};

        long sum = sum(arr);
        double avg = average(arr);
        int[] sortedDesc = sortDesc(arr);
        int[] evens = filterEven(arr);
        int[] odds = filterOdd(arr);

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + avg);
        System.out.println("Отсортированный по убыванию: " + Arrays.toString(sortedDesc));
        System.out.println("Чётные: " + Arrays.toString(evens));
        System.out.println("Нечётные: " + Arrays.toString(odds));
    }

    // Метод для суммы
    private static long sum(int[] a) {
        long s = 0;
        for (int v : a) s += v;
        return s;
    }

    // Метод для среднего
    private static double average(int[] a) {
        return a.length == 0 ? 0.0 : (double) sum(a) / a.length;
    }

    // Метод сортировки по убыванию
    private static int[] sortDesc(int[] a) {
        int[] copy = Arrays.copyOf(a, a.length);
        Arrays.sort(copy); // сортировка по возрастанию
        reverse(copy);
        return copy;
    }

    // Вспомогательный метод разворота массива
    private static void reverse(int[] a) {
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
    }

    // Метод для фильтрации чётных
    private static int[] filterEven(int[] a) {
        int count = 0;
        for (int v : a) if (v % 2 == 0) count++;
        int[] res = new int[count];
        int i = 0;
        for (int v : a) if (v % 2 == 0) res[i++] = v;
        return res;
    }

    // Метод для фильтрации нечётных
    private static int[] filterOdd(int[] a) {
        int count = 0;
        for (int v : a) if (v % 2 != 0) count++;
        int[] res = new int[count];
        int i = 0;
        for (int v : a) if (v % 2 != 0) res[i++] = v;
        return res;
    }
}
