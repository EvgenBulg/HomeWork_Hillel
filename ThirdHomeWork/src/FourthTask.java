//4. Перепишите программы с использованием цикла do - while.
public class FourthTask {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if(i%2!=0){
                System.out.println(i);
            }
        } while(i < 100);

        System.out.println("-----------");

        int fact = 5;
        int res = 1;
        do{
            res*=fact;
            fact--;
        }while (fact>0);
        System.out.println(res);
    }
}
