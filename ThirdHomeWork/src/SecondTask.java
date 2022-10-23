//2. Дано число n при помощи цикла for посчитать факториал n!

import java.util.Scanner;
public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, для которого нужно посчитать факториал!");
        int n = scanner.nextInt();

        SecondTask factorial = new SecondTask();
        System.out.println(factorial.factorial(n));
    }

    private int factorial (int value){
        int result = 1;
        for (int i = 1; i <= value; i++) {
         result*=i;
         if (i==value) {
             break;
         }
        }
        return result;
    }
}
