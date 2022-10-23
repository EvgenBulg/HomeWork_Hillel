//Вывести 10 первых чисел последовательности 0, -5,-10,-15..
public class SixthTask {
    public static void main(String[] args) {
        int res = 0;
        int counter = -5;
        for (int i = 0; i < 10; i++) {
            System.out.printf (res + ",  ");
            res += counter;
        }
    }
}
