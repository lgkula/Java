package com.tools;

public class AnnalynsInfiltration_test {
    String karta = "as";
    public static int test(String karta) {
        int wartosc;
        switch (karta) {
            case "as":
                wartosc = 1;
                break;
            default:
                wartosc = 100;

        }
        return wartosc;
    }
    public void AnnalynsInfiltrationTestFunction() {



        AnnalynsInfiltration wynik = new AnnalynsInfiltration();
        System.out.println("wynik = " + wynik);
        System.out.println(test("as"));


    }
}
