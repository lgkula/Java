package com.tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogLevelsTest {
    static String logLine = "[INFO]: Operation completed";

    @Test
    public void logLevelsMessageTest() {
        String wynik = LogLevels.message(logLine);
        assertEquals("Disk almost full", wynik);
    }

    @Test
    public void logLevelslogLevelTest() {
        String wynik = LogLevels.logLevel(logLine);
        assertEquals("warning", wynik);
    }

    @Test
    public void logLevelsReformatTest () {
        String wynik = LogLevels.reformat(logLine);
        assertEquals("Operation completed (info)", wynik);
    }
}
