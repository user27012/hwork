package net.graysenko.com;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Double> numbers = generateRandomNumbers(10);

        System.out.println("Список чисел: " + numbers);

        double sumOfSquares = numbers.stream()
                .map(num -> Math.pow(num, 2))
                .reduce(0.0, Double::sum);

        System.out.println("Сума квадратів чисел: " + sumOfSquares);
    }

    private static List<Double> generateRandomNumbers(int count) {
        Random random = new Random();
        return random
                .doubles(count, 0, 100)  // Генерація 10 випадкових чисел від 0 до 100
                .boxed()
                .collect(Collectors.toList());
    }
}
