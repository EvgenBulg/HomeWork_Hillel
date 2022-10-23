//7. Необходимо вывести на экран таблицу умножения на Х: (любое число вводимое из консоли)
import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число х (х>0):");
        int x = scanner.nextInt();
        while (x<=0){
            System.out.println("Ошибка! Введите ещё раз:");
            x = scanner.nextInt();
        }

        SeventhTask multiplicationTable = new SeventhTask();
        multiplicationTable.multiplicationTable(x);
    }

    private void multiplicationTable(int value){
        int num = 0;
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value; j++) {
                num = j*i;
                System.out.printf("%-7s", num);
            }
            System.out.println();
        }
    }
}
