/*
3. Программу, которая предлагает пользователю ввести сумму денежного вклада в гривнах, процент годовых, которые выплачивает банк,
длительность вклада (лет). Вывести накопленную сумму денег за каждый год и начисленные проценты.
(проценты сложные с капитализацией каждый месяц)

В задании 3 числа вводить через аргументы приложения
Пример: java DepositCalculator <сумма> <процент> <длительность_в_годах>
*/

import java.math.BigDecimal;

public class DepositCalculator {
    public static void main(String[] args) {
        double depositAmount = Double.parseDouble(args[0]);
        double percentagePerAnnum = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);
        int monthOfYear = 12;

        System.out.println("Сумма вклада: " + depositAmount + " грн.");
        System.out.println("Процент годовых: " + percentagePerAnnum + " %.");
        System.out.println("Длительность вклада (лет): " + years + " лет.");

        for (int i = 1; i <= years; i++) {
            double result = depositAmount * Math.pow(1 + percentagePerAnnum/100/monthOfYear, monthOfYear * i);
            double netProfit = result - depositAmount;
            double clearProfitForYear = netProfit;
                    if(i>1){
                        clearProfitForYear = result - depositAmount * Math.pow(1 + percentagePerAnnum/100/monthOfYear, monthOfYear * (i-1));
                    }
/*            System.out.println("Сумма на счету за " + i + " год(а)/лет = " + result + " => процентный (чистый) доход за " + i + " год(а)/лет = " + netProfit +
                    ", прибыль за данный год = " + clearProfitForYear);*/

            System.out.printf("Сумма на счету за " + i + " год(а)/лет = %s%n", new BigDecimal(result).setScale(2, BigDecimal.ROUND_DOWN) + " грн" +
                    " => процентный (чистый) доход за " + i + " год(а)/лет = " + new BigDecimal(netProfit).setScale(2, BigDecimal.ROUND_DOWN) + " грн"+
                    ", прибыль за данный год = " +  new BigDecimal(clearProfitForYear).setScale(2, BigDecimal.ROUND_DOWN) + " грн");
        }

    }
}
