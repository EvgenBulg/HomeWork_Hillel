public class Subscriber {
    private static int idCounter;
    private int id;
    private String lastname;
    private String name;
    private String fatherName;
    private String city;
    private String phoneNumber;
    private String contractNumber;
    private double balance;
    private int timeOfLocalCall;
    private int timeOfLongDistanceCall;
    private double internetTraffic;


    public Subscriber(String lastname, String name, String fatherName, String city, String phoneNumber, String contractNumber, double balance, int timeOfLocalCall, int timeOfLongDistanceCall, double internetTraffic) {
        this.id = idCounter++;
        this.lastname = lastname;
        this.name = name;
        this.fatherName = fatherName;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contractNumber = contractNumber;
        this.balance = balance;
        this.timeOfLocalCall = timeOfLocalCall;
        this.timeOfLongDistanceCall = timeOfLongDistanceCall;
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        return id + ". " + lastname + " " + name + " " + fatherName + "; город: " + city + "; телефон: " + phoneNumber +
                "; номер договора: " + contractNumber + "; баланс: " + balance + " грн ; Время городских разговоров: "
                + timeOfLocalCall + " (мин); Время междугородных разговоров: " + timeOfLongDistanceCall + " (мин); Интернет трафик: " +
                internetTraffic + " Gb.\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getTimeOfLocalCall() {
        return timeOfLocalCall;
    }

    public void setTimeOfLocalCall(int timeOfLocalCall) {
        this.timeOfLocalCall = timeOfLocalCall;
    }

    public int getTimeOfLongDistanceCall() {
        return timeOfLongDistanceCall;
    }

    public void setTimeOfLongDistanceCall(int timeOfLongDistanceCall) {
        this.timeOfLongDistanceCall = timeOfLongDistanceCall;
    }

    public double getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(double internetTraffic) {
        this.internetTraffic = internetTraffic;
    }
}


