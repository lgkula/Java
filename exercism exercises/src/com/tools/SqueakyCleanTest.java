package com.tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqueakyCleanTest {
    String identifier = "my  \0 Id";

    @Test
    public void squeakycleanCleanTest () {
        String wynik = SqueakyClean.clean(identifier);
        assertEquals("my__CTRL_Id", wynik);
    }


}
