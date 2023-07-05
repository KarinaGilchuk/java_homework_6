package ru.netology.stats;

public class StatsService {

    public int getMinMonth(int[] months) { // выяснение номера месяца с минимальными продажами
        int minMonth = 0;
        for (int i = 0; i<months.length; i++) {
            if (months[i] <= months[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMaxMonth(int[] months) { //выяснение номера месяца с максимальными продажами
        int maxMonth = 0;
        for (int i = 0; i<months.length; i++) {
            if (months[i] >= months[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int sumAllMonths(int[] months) { // расчёт суммы всех продаж
        int sum = 0;
        for (int i = 0; i<months.length; i++) {
            sum = sum + months[i];
        }
        return sum;
    }

    public int avgAllMonths(int[] months) { // расчёт средней суммы продаж в месяц
        return sumAllMonths(months) / months.length;
    }

    public int countMonthsBelowAvg(int[] months) { // расчёт количества месяцев, в которых продажи были ниже среднего
        int count = 0;
        for (int i = 0; i<months.length; i++) {
            if (months[i] < avgAllMonths(months)) {
                count++;
            }
        }
        return count;
    }

    public int countMonthsAboveAvg(int[] months) { // расчёт количества месяцев, в которых продажи были выше среднего
        int count = 0;
        for (int i = 0; i<months.length; i++) {
            if (months[i] > avgAllMonths(months)) {
                count++;
            }
        }
        return count;
    }
}