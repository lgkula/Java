package com.company;

import com.tools.AnnalynsInfiltration;
import com.tools.Blackjack;

import java.util.Arrays;

public class Main {

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

    public static void main(String[] args) {

//        AnnalynsInfiltration wynik = new AnnalynsInfiltration();
//        System.out.println("wynik = " + wynik);
//        System.out.println(test("as"));
        String[] karty = {"ace", "ten", "jack", "queen", "king", "nine", "eight", "seven", "six", "five", "four", "three", "two", "other"};
        Blackjack blackjack = new Blackjack();
        System.out.println("parseCard");
        for (String podana_karta : karty) {
            System.out.println(podana_karta + " " + blackjack.parseCard(podana_karta));
            }
        System.out.println("");
        System.out.println("parseCard1");
        for (String podana_karta : karty) {
            System.out.println(podana_karta + " " + blackjack.parseCard1(podana_karta));
        }
    }
}
