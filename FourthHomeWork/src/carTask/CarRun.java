package carTask;

public class CarRun {
    protected static double fuelPrice;
    public static void main(String[] args) {
        double odessaToKiev = 476.0d;                  //Расстояние Одесса - Киев
        double odessaToCrookedLake = 178.5d;           //Расстояние Одесса - Кривое озеро
        double crookedLakeToZhashkov = 152.8d;         //Расстояние Кривое озеро - Жашков
        double zhashkovToKiev = 144.7d;                //Расстояние Жашков - Киев
        fuelPrice = Double.valueOf(args[0]);           //Стоимость топлива


        Car car1 = new Car(47.3, 22.7, 8.4);
        System.out.println(car1.toString()+"\n" + "Стоимость топлива: " + fuelPrice + " грн/л\n");

/*        System.out.println("ИНФОРМАЦИЯ: МАРШРУТ ОДЕССА-КИЕВ");
        System.out.println("Цена полной поездки: " + ((odessaToKiev/100) * car1.fuelConsumption * fuelPrice) + " грн");
        car1.needToFillForWay(odessaToKiev);*/

        System.out.println("\nПРЕДСТОЯЩИЙ МАРШРУТ ОДЕССА-КРИВОЕ ОЗЕРО");
        car1.needToFillForWay(odessaToCrookedLake);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nВы приехали. Первая остановка.");
        car1.balanceOfFuel(odessaToCrookedLake);

        System.out.println("\nПРЕДСТОЯЩИЙ МАРШРУТ КРИВОЕ ОЗЕРО-ЖАШКОВ");
        car1.needToFillForWay(crookedLakeToZhashkov);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nВы приехали. Вторая остановка.");
        car1.balanceOfFuel(crookedLakeToZhashkov);

        System.out.println("\nПРЕДСТОЯЩИЙ МАРШРУТ ЖАШКОВ-КИЕВ");
        car1.needToFillForWay(zhashkovToKiev);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nВы приехали в Киев. Конечная точка.");
        car1.balanceOfFuel(zhashkovToKiev);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.format("На весь маршрут Одесса - Киев потрачено: %.2f", (odessaToKiev/100)*car1.fuelConsumption);
        System.out.print(" л бензина\n");
        System.out.format("Цена полной поездки: %.2f", ((odessaToKiev/100) * car1.fuelConsumption * fuelPrice));
        System.out.print(" грн");

    }
}

