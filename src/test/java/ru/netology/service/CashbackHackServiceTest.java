package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void notUpToTheBonus() {
        int amount = 900;
        int expected = 100;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void notUpTheBonus() {
        int amount = 100;
        int expected = 900;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void LimitBonus() {
        int amount = 1_000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void notUpBonus() {
        int amount = 500;
        int expected = 500;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}