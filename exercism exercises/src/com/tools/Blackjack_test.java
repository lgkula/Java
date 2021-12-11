package com.tools;

import java.util.Random;

public class Blackjack_test {
    public String[] karty = {"ace", "ten", "jack", "queen", "king", "nine", "eight", "seven", "six", "five", "four", "three", "two", "other"};

    public void blackJackTestFunction() {
        Blackjack blackjack = new Blackjack();
        System.out.println("parseCard");
        for (String podana_karta : karty) {
            System.out.println(podana_karta + " " + blackjack.parseCard(podana_karta));
        }
        System.out.println("");
        System.out.println("parseCard1");
        for (String podana_karta : karty) {
            System.out.println(podana_karta + " " + blackjack.parseCard1(podana_karta));


//        Blackjack blackjack = new Blackjack();
            Random random = new Random();
            int licznik = 0;
            for (int i = 1; i < 10000; i++) {
                int los1 = random.nextInt(13);
                int los2 = random.nextInt(13);
                String card1 = karty[los1];
                String card2 = karty[los2];
                System.out.println("Losowanie nr: " + i);
                System.out.println("Karta 1 to: " + card1 + "Punkty: " + blackjack.parseCard(card1));
                System.out.println("Karta 2 to: " + card2 + "Punkty: " + blackjack.parseCard(card2));
                System.out.println("Czy jest BlackJack: " + blackjack.isBlackjack(card1, card2));
                System.out.println("");
                if (blackjack.isBlackjack(card1, card2)) {
                    licznik += 1;
                }
            }
            System.out.println("Ilość wystąpień: " + licznik);
        }
    }
}