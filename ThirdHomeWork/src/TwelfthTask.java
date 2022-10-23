//12. Найти среднее арифметическое всех элементов массива.
import java.util.Scanner;
public class TwelfthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте размер массива (положительное число)");
        int size = scanner.nextInt();
        while (size<0){
            System.out.println("Задайте размер ещё раз:");
            size = scanner.nextInt();
        }
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
            System.out.printf(arr[i] + "    ");
        }
        TwelfthTask array = new TwelfthTask();
        System.out.println();
        System.out.println("Среднее арифметическое = " + array.average(arr));
    }

    private double average (int[] array){
        int sum = 0;
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        result = (double) sum/array.length;
        //System.out.println(result);
        return result;
    }
}
