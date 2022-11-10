public interface SubscriberService {
    //a) сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
    public void timeForLocalCalls(int value);

    //b) сведения об абонентах, которые пользовались междугородней связью;
    public void whoUsedLongDistanceCommunication();

    //c) сведения об абонентах ФИО, номер телефона, баланс у который первая бука фамилии передается как параметр.
    public void infoAboutPersonsStartLastnameLetter(char letter);

    //d) суммарное потребление трафика интернета для определенного города
    public void sumOfInternetTrafficForCity(String city);

    //e) количество абонентов с отрицательным балансом
    public void numberOfPersonWithNegativeBalance();

}
