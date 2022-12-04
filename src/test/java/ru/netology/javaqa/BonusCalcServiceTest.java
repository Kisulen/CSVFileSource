package ru.netology.javaqa;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusCalcServiceTest {
@ParameterizedTest
@CsvFileSource (resources = "/data.csv")
public void shouldCalculateBonuses(long expected, long amount, boolean registered) {
    BonusCalcService service = new BonusCalcService();

    long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
}

    //@org.junit.jupiter.api.Test
    /*void shouldCalculateForRegisteredAndOverLimit() {
        BonusCalcService service = new BonusCalcService();

        //
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        //
        long actual = service.calculate(amount, registered);

        //
        assertEquals(expected, actual);
    }

   // @org.junit.jupiter.api.Test
    void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    //@org.junit.jupiter.api.Test
    void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    //@org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndBonuses500() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 16667;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

   // @org.junit.jupiter.api.Test
    void shouldCalculateForUnregisteredAndBonuses500() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 50000;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    //@org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndSmallPurchase() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 27;
        boolean registered = true;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

   // @org.junit.jupiter.api.Test
    void shouldCalculateForUnregisteredAndSmallPurchase() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 22;
        boolean registered = false;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }*/

}
