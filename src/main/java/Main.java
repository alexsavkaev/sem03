import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Создаём список и заполняем его случайными числами
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(new Random().nextInt(20));
        }
        System.out.println("Произвольный список целых чисел: " + numbers);
        // Удаляем из полученного списка все чётные числа
        numbers.removeIf(num -> (num % 2) == 0);
        System.out.println("Список, после удаления чётных чисел: " + numbers);
        // Находим min и max значения списка
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Минимальное значение: " + min +
                "\n" + "Максимальное значение: " + max + ".");
        // Находим среднее значение
        double total = 0.0;
        for (Integer num : numbers) {
            total += num;
        }
        double average = total / numbers.size();
        System.out.format("Среднее значение: %f", average);

    }
}