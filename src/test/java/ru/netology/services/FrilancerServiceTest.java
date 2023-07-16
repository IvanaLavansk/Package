package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrilancerServiceTest {

    @Test
    public void calculateTest1() {
        FrilancerService service = new FrilancerService();

        int actual = service.calculate( income: 10_000, expenses: 3_000; threshold: 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculatetest2() {
        FrilancerService service = new FrilancerService();

        int actual = service.calculate(income: 100_000, expenses: 60_000; threshold: 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}