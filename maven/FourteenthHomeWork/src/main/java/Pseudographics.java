import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pseudographics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of numbers:");
        String string = scanner.next();
        Integer num = null;

        try {
            num = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println("Error! Not all characters in the sequence are numbers.");
        }

        int[] arr = Int_to_array(num);
        ArrayList<ArrayList<String>> common = new ArrayList<>();
        Numbers numbers = new Numbers();

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    common.add(numbers.getZero());
                    break;
                case 1:
                    common.add(numbers.getOne());
                    break;
                case 2:
                    common.add(numbers.getTwo());
                    break;
                case 3:
                    common.add(numbers.getThree());
                    break;
                case 4:
                    common.add(numbers.getFour());
                    break;
                case 5:
                    common.add(numbers.getFive());
                    break;
                case 6:
                    common.add(numbers.getSix());
                    break;
                case 7:
                    common.add(numbers.getSeven());
                    break;
                case 8:
                    common.add(numbers.getEight());
                    break;
                case 9:
                    common.add(numbers.getNine());
                    break;
            }
        }

        for (int i = 0; i < numbers.getZero().size(); i++) {
            System.out.println();
            for (int j = 0; j < common.size(); j++) {
                System.out.print(common.get(j).get(i) + "\t\t");
            }
        }

    }

    static int[] Int_to_array(int n)
    {
        int j = 0;
        int len = Integer.toString(n).length();
        int[] arr = new int[len];
        while(n!=0)
        {
            arr[len-j-1] = n%10;
            n=n/10;
            j++;
        }
        return arr;
    }
}
