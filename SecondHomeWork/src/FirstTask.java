/*1. Программа, которая находит среднее арифметическое значение двух чисел.*/

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double average = (firstNumber + secondNumber)/2;

        System.out.println("Среднее арифметическое значение двух чисел = " + average);
    }
}
