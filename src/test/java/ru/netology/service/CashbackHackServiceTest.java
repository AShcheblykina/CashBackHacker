package ru.netology.service;

import org.junit.Test;


import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void buyMoreMinToBonus() {
        int amount = 900;
        int expected = 100;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void buyMoreMaxToBonus() {
        int amount = 100;
        int expected = 900;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void buyMoreHalfToBonus() {
        int amount = 500;
        int expected = 500;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void buyMaxHalfToBonus() {
        int amount = 1_000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }
}