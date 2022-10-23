import java.util.Scanner;

public class EleventhTask {
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




    }

    private void swapMinAndMax(int[] array){
        int min=array[0];
        int max=array[0];
        for (int i = 0; i < array.length; i++) {

        }
    }

}
