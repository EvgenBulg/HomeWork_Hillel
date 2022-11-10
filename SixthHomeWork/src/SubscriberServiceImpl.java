import java.util.Arrays;

public class SubscriberServiceImpl implements SubscriberService {
    public Subscriber[] array;

    public SubscriberServiceImpl(Subscriber[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "SubscriberServiceImpl{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public void timeForLocalCalls(int value) {
        System.out.println("Сведения об абонентах, у которых время внутригородских разговоров превышает " + value + " мин: ");
        for (int i = 0; i < array.length; i++) {
            if(array[i].getTimeOfLocalCall() > value){
                System.out.println(array[i]);
            }
        }
    }

    @Override
    public void whoUsedLongDistanceCommunication() {
        System.out.println("Сведения об абонентах, которые пользовались междугородней связью:");
        for (int i = 0; i < array.length; i++) {
            if(array[i].getTimeOfLongDistanceCall() > 0){
                System.out.println(array[i]);
            }
        }
    }

    @Override
    public void infoAboutPersonsStartLastnameLetter(char letter) {
        System.out.println("Сведения об абонентах ФИО, номер телефона, баланс у который первая буква фамилии (" + letter + ") передается как параметр:");
        char[] result;
        for (int i = 0; i < array.length; i++) {
            result = array[i].getLastname().toCharArray();
            if(result[0] == letter){
                System.out.println(array[i].getId() + ". " + array[i].getLastname() + " " + array[i].getName() + " "
                        + array[i].getFatherName() + "; тел. номер: " + array[i].getPhoneNumber()
                        + "; баланс: " + array[i].getBalance() + " грн.");
            }
        }
    }

    @Override
    public void sumOfInternetTrafficForCity(String city) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].getCity().equalsIgnoreCase(city)){
                sum += array[i].getInternetTraffic();
            }
        }
        System.out.println("В городе " + city + " суммарное потребление трафика = " + sum + " Gb");
    }

    @Override
    public void numberOfPersonWithNegativeBalance() {
        int count  = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].getBalance() < 0) {
                count++;
            }
        }
        System.out.println("Количество абонентов с отрицательны балансом: " + count);
    }
}
