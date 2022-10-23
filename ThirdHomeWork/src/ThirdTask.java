import java.util.Scanner;

//3. Перепишите программы с использованием цикла while.
public class ThirdTask {
    public static void main(String[] args) {

        int counter=1;
        while (counter<100){
            if(counter%2 != 0){
                System.out.println(counter);
            }
            counter++;
        }
        System.out.println("----------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, для которого нужно посчитать факториал!");
        int n = scanner.nextInt();
        int resultOfFactorial = 1;
        while(n >= 1){
            resultOfFactorial *= n;
            n--;
        }
        System.out.println(resultOfFactorial);
    }
}
