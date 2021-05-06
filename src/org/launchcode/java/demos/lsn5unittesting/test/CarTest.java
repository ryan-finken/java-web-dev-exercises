package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

public class CarTest {
    Car test_car;

    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);

    }

    @Test
    public void testInitialGasTank() {
        assertTrue(test_car.getGasTankLevel() == 10);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertTrue(test_car.getGasTankLevel() == 9);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void  testGasTankAfterExceedingTankRange() {
        test_car.drive(1000);
        assertTrue(test_car.getGasTankLevel() == 0);
        assertTrue(test_car.getOdometer() == 500);
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        test_car.addGas(5);
        fail("Shouldn't get here...");
    }

}
