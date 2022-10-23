import java.util.Scanner;

/*Дан массив размерности N, найти наименьший элемент массива и вывести на консоль
(если наименьших элементов несколько — вывести их все).*/
public class NinthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте размер массива (положительное число)");
        int n = scanner.nextInt();
        while (n<0){
            System.out.println("Задайте размер ещё раз:");
            n = scanner.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random()*100);
            System.out.println(arr[i]);
        }
        NinthTask array = new NinthTask();
        array.minValueOfArray(arr);
    }
    
    private void minValueOfArray(int[] array){
        int min = array[0];
        for(int i=0; i<array.length; i++) {
            if(min > array[i]) {
            min = array[i];
            }
        }
        System.out.println("Наименьший элемент(ы) массива: ");
        for (int i = 0; i < array.length; i++) {
            if(min == array[i])
            {
                System.out.println("arr[" + i + "] = " + array[i]);
            }
        }
    }
    
}
