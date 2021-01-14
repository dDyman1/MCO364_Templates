package test;

import EvenOdd.EvenOdd;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * IMPORTANT:
 * DO NOT change any lines in this file
 */
class EvenOddTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCapture = new ByteArrayOutputStream();
    private final InputStream originalIn = System.in;
    private final InputStream in = new ByteArrayInputStream("1".getBytes());

    public void setUp() {
        System.setOut(new PrintStream(outputStreamCapture));
        System.setIn(in);
    }

    @Test
    void TestPrintStatement() {
        setUp();
        EvenOdd.main(null);
        assertEquals("1 is an odd number.", outputStreamCapture.toString());
    }

    @Test
    void TestIsEven() {
    }
}