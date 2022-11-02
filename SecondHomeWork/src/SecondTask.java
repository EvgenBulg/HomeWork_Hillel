/*2. Программа, которая находит среднее арифметическое значение произвольного количества чисел.*/
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число (определяющее кол-во чисел для рассчёта среднего арифметического): ");
        int amountOfNumber = scanner.nextInt();
        double sum = 0;

        while (amountOfNumber<0)
        {
            System.out.println("Значение должно быть положительным или 0. Введите ещё раз.");
            amountOfNumber = scanner.nextInt();
        }

        for (int i = 1; i <= amountOfNumber; i++) {
            System.out.println("Введите число:");
            double numberForSum = scanner.nextDouble();
            sum += numberForSum;
        }
        double average = sum/amountOfNumber;
        System.out.println("Среднее арифметическое " + amountOfNumber + " заданных чисел = " + average);

    }
}
