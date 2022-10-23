//10.В массиве из задания 9. найти наибольший элемент.
import java.util.Scanner;

public class TenthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте размер массива (положительное число):");
        int n = scanner.nextInt();
        while (n < 0) {
            System.out.println("Задайте размер ещё раз:");
            n = scanner.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i]);
        }
        TenthTask array = new TenthTask();
        array.maxValueOfArray(arr);
    }


    private void maxValueOfArray(int[] array){
        int max = array[0];
        for(int i=0; i<array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Наибольший элемент(ы) массива: ");
        for (int i = 0; i < array.length; i++) {
            if(max == array[i])
            {
                System.out.println("arr[" + i + "] = " + array[i]);
            }
        }
    }
}
