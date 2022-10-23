//5. Даны переменные x и n вычислить x^n.

import java.util.Scanner;
public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную х:");
        double x = scanner.nextDouble();
        System.out.println("Введите переменную х:");
        double n = scanner.nextDouble();
        double res=1;

        //First way
        System.out.println("First way");
        System.out.println("Число " + x + " в степени " + n + " = " + Math.pow(x,n));

        //Second way
        System.out.println("Second way");
        if(n==0){
            res=1;
            System.out.println("Число " + x + " в степени " + n + " = " + res);
        }
        else if(n>0){
            for (int i = 1; i <= n ; i++) {
                res *= x;
            }
            System.out.println("Число " + x + " в степени " + n + " = " + res);
        }
        else{
              n=n*(-1);
            for (int i = 1; i <= n ; i++) {
                res *= x;
            }
            System.out.println("Число " + x + " в степени -" + n + " = " + 1.0/res);
        }
    }
}
