/*Создать класс машина с полями
            объем бака
            остаток в баке
            расход топлива на 100 км

        создать методы:
            залить полный бак с учетом объема остатка
            определить остаток топлива по преодолении N км
            определить сколько надо до заправить топлива для преодоления N км

        в классе Мейн надо определить и вывести на экран сколько надо долить топлива и его стоимость если маршрут у нас Одесса - Киев
            + 2 обязательные остановки для дозаправки Кривое Озеро и Жашков
            + сколько будет стоить полная поездка
            + остаток топлива в пункте назначения
            стоимость топлива передавать как аргумент программы + результаты выполнения приложить скриншотом*/

package carTask;

import java.util.Scanner;
public class Car {
    Scanner scanner = new Scanner(System.in);

    private double sizeOfTheTank;       //объем бака
    private double fuelSupply;          //остаток в бане
    protected double fuelConsumption;     //расход топлива

    public Car(double volumeOfTheTank, double fuelSupply, double fuelConsumption) {
        this.sizeOfTheTank = volumeOfTheTank;
        this.fuelSupply = fuelSupply;
        this.fuelConsumption = fuelConsumption;
    }

    public double getVolumeOfTheTank() {
        return sizeOfTheTank;
    }

    public void setVolumeOfTheTank(double sizeOfTheTank) {
        this.sizeOfTheTank = sizeOfTheTank;
    }

    public double getFuelSupply() {
        return fuelSupply;
    }

    public void setFuelSupply(double fuelSupply) {
        this.fuelSupply = fuelSupply;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


    @Override
    public String toString() {
        return "Объем бака Вашей машины: " + sizeOfTheTank + " литров"+
                "\nНа данный момент остаток в баке: " + fuelSupply + " литров"+
                "\nВаш расход: "+ fuelConsumption + " л/100 км";
    }

    //залить полный бак с учетом объема остатка
    public void fillFullTank(){
        System.out.printf("Вы залили ");
        System.out.format("%.2f",(sizeOfTheTank - fuelSupply));
        System.out.printf(" л бензина.\nСтоимость заправки: ");
        System.out.format("%.2f",(sizeOfTheTank - fuelSupply)*CarRun.fuelPrice);
        System.out.printf(" грн.");
        fuelSupply = sizeOfTheTank;
        System.out.printf("\nСейчас у вас ");
        System.out.format("%.2f",fuelSupply);
        System.out.println(" л бензина (Полный бак).");
    }

    //определить остаток топлива по преодолении N км
    public void balanceOfFuel (double distance){
        fuelSupply = fuelSupply - (distance/100)*fuelConsumption;
        System.out.printf("Вы проехали " + distance + " км, у Вас осталось ");
        System.out.format("%.2f",fuelSupply);
        System.out.println(" л бензина.");
    }

    //определить сколько надо до заправить топлива для преодоления N км
    public void needToFillForWay (double distance){
        System.out.print("Сейчас в баке: ");
        System.out.format("%.2f",fuelSupply);
        System.out.println(" л бензина.");

        System.out.printf("Для преодоления " + distance + " км, при расходе "+ fuelConsumption + " л/100 км, нужно ");
        System.out.format("%.2f",(distance/100)*fuelConsumption);
        System.out.println(" л бензина.");

        if(fuelSupply >= (distance/100)*fuelConsumption){
            System.out.println("В Вашем баке хватит бензина, чтобы преодолеть заданое расстояние. " +
                    "Однако, Вы можете дозаправить авто до полного бака (наж. 1), либо пропустить заправку (наж. 0).");
            int select = scanner.nextInt();
            while (select!=0 && select!=1){
                System.out.println("Ошибка. Введите цифру 1 или 0");
                select = scanner.nextInt();
            }
            switch (select){
                case 0:
                    System.out.println("Вы пропустили зарпавку. \nНа данный момент в вашем баке " + fuelSupply + " л бензина.");
                    break;
                case 1:
                    fillFullTank();
                    break;
            }
        }
        else {
            System.out.println("Вам не хватит бензина, чтобы проехать заданную дистанцию. Заправить полный бак? 1 - Да, 0 - Нет");
            int select = scanner.nextInt();
            while (select!=0 && select!=1){
                System.out.println("Ошибка. Введите цифру 1 или 0");
                select = scanner.nextInt();
            }
            switch (select){
                case 0:
                    System.out.println("Ошибка! Нужно заправить полный бак.");
                    fillFullTank();
                    break;
                case 1:
                    fillFullTank();
                    break;
            }

        }
    }

}

