package com.company;

import com.tools.AnnalynsInfiltration;
import com.tools.Blackjack;
import com.tools.Blackjack_test;

import java.util.Arrays;
import java.util.Random;

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
//        Blackjack blackjack = new Blackjack();
//        System.out.println("parseCard");
//        for (String podana_karta : karty) {
//            System.out.println(podana_karta + " " + blackjack.parseCard(podana_karta));
//            }
//        System.out.println("");
//        System.out.println("parseCard1");
//        for (String podana_karta : karty) {
//            System.out.println(podana_karta + " " + blackjack.parseCard1(podana_karta));
        Blackjack_test blackjack_test = new Blackjack_test();
        blackjack_test.blackJackTestFunction();
    }
}
