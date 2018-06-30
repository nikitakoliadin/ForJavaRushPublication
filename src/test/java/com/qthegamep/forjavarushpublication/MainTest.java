package com.qthegamep.forjavarushpublication;

import com.qthegamep.forjavarushpublication.Main;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainTest {

    private Main main;

    @Before
    public void load() {
        main = new Main();
    }

    @Test
    public void shouldBigger() {
        assertTrue(main.isBigger(10, 5));
    }

    @Test
    public void shouldNotBigger() {
        assertFalse(main.isBigger(5, 5));
    }

    @Test
    public void shouldEquals() {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));

        Main.main(null);

        System.setOut(consoleStream);

        String actual = byteArrayOutputStream.toString();
        String expected = "Hello world!" + System.lineSeparator() +
                "true" + System.lineSeparator();

        assertEquals(expected, actual);
    }
}
