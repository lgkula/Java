package com.tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogLevelsTest {
    static String logLine = "[ERROR]: Invalid operation";

    @Test
    public void logLevelsMessageTest() {
        String wynik = LogLevels.message(logLine);
        assertEquals("Invalid operation", wynik);
    }

    @Test
    public void logLevelslogLevelTest() {
        String wynik = LogLevels.logLevel(logLine);
        assertEquals("error", wynik);
    }
}
