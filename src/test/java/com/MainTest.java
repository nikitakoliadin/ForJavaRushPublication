package com;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    Main main;

    @Before
    public void load() {
        main = new Main();
    }

    @Test
    public void shouldBigger() {
        assertTrue(main.isBigger(10, 5));
        assertFalse(main.isBigger(5, 10));
        assertFalse(main.isBigger(5, 5));
    }

    @Test
    public void main() {
        Main.main(null);
    }
}
