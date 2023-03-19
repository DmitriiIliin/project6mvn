
package ru.netology.stats;

public class StatsService {


    public long sum(long[] sales) {    // Сумма продаж
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;
        }
        return totalSale;
    }


    public long average(long[] sales) { // Средние продажи за месяц
        long totalSale = sum(sales);
        return totalSale / sales.length;

    }

    public int monthMaximumSale(long[] sales) { //Месяц с максимальными продажами

        int monthMaximum = 0;
        long saleMaximum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMaximum) {
                monthMaximum = i;
                saleMaximum = sales[i];
            }
        }
        return monthMaximum + 1;


    }

    public int monthMinimumSale(long[] sales) { // Месяц с минимальными продажами

        int monthMinimum = 0;
        long saleMinimum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMinimum) {
                monthMinimum = i;
                saleMinimum = sales[i];
            }
        }
        return monthMinimum + 1;


    }

    public int monthLessAverage(long[] sales) { // Месяцы с продажами ниже среднего
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }


        return counter;
    }

    public int monthOverAverage(long[] sales) { // Месяцы с продажами выше среднего
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }


        return counter;


    }
}





