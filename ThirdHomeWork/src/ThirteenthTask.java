//13. (*)Вывести на экран шахматную доску 8х8 в виде 2 мерного массива (W - белые клетки , B - черные клети)
public class ThirteenthTask {
    public static void main(String[] args) {
        int[][] array = new int[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i%2==0){
                    if(j%2==0){
                        System.out.printf ("W  ");
                    }
                    else{
                        System.out.printf("B  ");
                    }
                }
                else{
                    if(j%2==0){
                        System.out.printf ("B  ");
                    }
                    else{
                        System.out.printf("W  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
