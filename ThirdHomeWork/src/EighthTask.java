/*Создайте массив, содержащий 10 первых нечетных чисел.
Выведете элементы массива на консоль в одну строку, разделяя запятой.*/
public class EighthTask {
    public static void main(String[] args) {
        System.out.println("First way");
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        print(array);

        System.out.println();
        System.out.println("Second way");
        int[] array2 = new int[10];
        int counter = 0;
        for (int i = 1; i < array2.length * 2; i+=2) {
            if (i != 0) {
                array2[counter] = i;
                counter++;
            }
            if (counter == array2.length) {
                break;
            }
        }

        for(int element : array2) {
            System.out.print(element + ", ");
        }
    }


    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.printf(array[i] + "!");
                break;
            }
            System.out.printf(array[i] + ", ");
        }
    }
}
