public class SubscriberRun {
    public static void main(String[] args) {
        Subscriber[] subscriber = new Subscriber[10];
        subscriber[0] = new Subscriber("Булгаков", "Евгений", "Дмитриевич", "Днепр", "+380954442233", "№26321ZQ", 125.45, 50, 20, 15.5);
        subscriber[1] = new Subscriber("Бровко", "Анастасия", "Дмитриевна", "Киев", "+380654242013", "№963257FF", -1010.35, 70, 5, 100.18);
        subscriber[2] = new Subscriber("Готвянська", "Карина", "Павловна", "Киев", "+380957872031", "№50877GH", 800.00, 220, 0, 5.0);
        subscriber[3] = new Subscriber("Зайцев", "Артур", "Дмитриевич", "Днепр", "+380665180021", "№26Q52VA", -150.10, 0, 650, 77.9);
        subscriber[4] = new Subscriber("Куц", "Никита", "Юриевич", "Харьков", "+380662542347", "№263HJ5", 1147.12, 230, 200, 12.5);
        subscriber[5] = new Subscriber("Лебеденко", "Антон", "Валерьевич", "Харьков", "+380984772299", "№753287R", 237.18, 680, 150, 88.32);
        subscriber[6] = new Subscriber("Мосна", "Юлия", "Александровна", "Киев", "+380955572311", "№66234HG", -125.45, 500, 100, 91.7);
        subscriber[7] = new Subscriber("Рябов", "Андрей", "Дмитриевич", "Винница", "+380668982288", "№26876BN", 144.11, 740, 0, 1.0);
        subscriber[8] = new Subscriber("Середняк", "Анастасия", "Борисовна", "Днепр", "+380957412563", "№98GBF1ZQ", 340.52, 0, 200, 5.54);
        subscriber[9] = new Subscriber("Середняк", "Елена", "Павловна", "Киев", "+380676767020", "№52321VSD", 125.45, 10, 350, 22.82);


        SubscriberServiceImpl service = new SubscriberServiceImpl(subscriber);
        //System.out.println(service.toString());
        System.out.println("----------------------------------------------------------------------------");
        service.timeForLocalCalls(130);
        System.out.println("----------------------------------------------------------------------------");
        service.whoUsedLongDistanceCommunication();
        System.out.println("----------------------------------------------------------------------------");
        service.infoAboutPersonsStartLastnameLetter('С');
        System.out.println("----------------------------------------------------------------------------");
        service.sumOfInternetTrafficForCity("Киев");
        System.out.println("----------------------------------------------------------------------------");
        service.numberOfPersonWithNegativeBalance();
    }

}

