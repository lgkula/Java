package com.tools;

public class SqueakyClean {
    static String clean(String identifier) {
//        throw new UnsupportedOperationException("Please implement the (static) SqueakyClean.clean() method");
        return identifier.replace(" ", "_").replaceAll("\\p{Cntrl}", "CTRL");
    }
}
