package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    // Сумма продаж
    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.sum(sales);
        Assertions.assertEquals(expected, actual);

    }

    // Средние продажи за месяц
    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180 / 12;
        long actual = service.average(sales);
        Assertions.assertEquals(expected, actual);


    }

    // Месяц с максимальными продажами
    @Test
    public void testMaximum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.monthMaximumSale(sales);
        Assertions.assertEquals(expected, actual);


    }

    // Месяц с минимальными продажами
    @Test
    public void testMinimum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.monthMinimumSale(sales);
        Assertions.assertEquals(expected, actual);


    }

    // Месяцы с продажами ниже среднего
    @Test
    public void testLessAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthLessAverage(sales);
        Assertions.assertEquals(expected, actual);


    }

    // Месяцы с продажами выше среднего
    @Test
    public void testOverAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthOverAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}