package org.launchcode.java.demos.lsn6inheritance.technology;

import org.junit.Test;
import static org.junit.Assert.*;

public class TechTest {
    @Test
    public void emptyTest() {
        assertEquals(1, 1, 0);
    }

    @Test
    public void powerStatusReturnsFalseByDefault() {
        Laptop test = new Laptop();
        assertEquals(false, test.powerStatus());
    }

    @Test
    public void powerUpSetsPowerStatusTrue() {
        Laptop test = new Laptop();
        test.powerUp();
        assertEquals(true, test.powerStatus());
    }

    @Test
    public void laptopConstructorSetsMessage() {
        Laptop test = new Laptop("message");
        test.powerUp();
        assertEquals("message", test.getNotification());
    }
}
