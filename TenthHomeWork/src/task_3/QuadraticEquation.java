package task_3;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        quadraticEquation(1, -2, 1);
        quadraticEquation(2, 5, -3);

    }

    public static void quadraticEquation(double a, double b, double c){
        double discriminant = Math.pow(b, 2) - 4 * a * c;;

        if(discriminant < 0){
            System.out.println("no roots");
        }
        else if(discriminant==0){
            double x = (-b)/2*a;
            System.out.println("x = " + x);
        }
        else {
            double x1 = (-b - sqrt(discriminant)) / (2*a);
            double x2 = (-b + sqrt(discriminant)) / (2*a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }

    }
}
