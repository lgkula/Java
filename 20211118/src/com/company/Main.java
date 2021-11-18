package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void listNumberFunction() {
        int[] listNumber = { 4, 5, 8, 9, 2, 1, 7, 6, 8, 7, 2, 3, 5};
        Arrays.sort(listNumber);
        Scanner redactor = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String redactorName = redactor.nextLine();
        Scanner luckyNumber = new Scanner(System.in);
        System.out.print("Podaj numer:");
        int yourLuckyNumber = luckyNumber.nextInt();
        System.out.println("Podana liczba to " + yourLuckyNumber);
        for (int listElement : listNumber) {
            System.out.print(listElement + ", ");


        }
    }
    public static void exchangeNumberFunction () {
        int[] list = {5, 7, 8, 9, 2, 1, 3, 5, 6, 7, 4};
        for(int b : list) {
            System.out.print(b + ", ");
        } System.out.println();
        for(int i = 0, j = list.length-1; i < (list.length-1)/2; i++, j--) {
            int a = list[j];
            list[j] = list[i];
            list[i] = a;

        }
        for(int b : list) {
            System.out.print(b + ", ");
        }
    }
    public static int silniaFunkcja(int liczbaElmentow) {
        int silnia = 1;
        for(int i = 1; i <= liczbaElmentow; i++) {
            silnia = silnia * i;
        }
        System.out.println("Silnia wynosi " + silnia);
    return silnia;
    }

    public static boolean findNumberFunction(int findNumber) {
        int[] list = {5, 7, 8, 9, 2, 1, 3, 5, 6, 7, 4};
        int numberIndex = -1;
        boolean numberOccurs = false;
        for(int i = 0; i < list.length; i++) {
            if(list[i] == findNumber);
            numberOccurs = true;
            numberIndex = i;
            return numberOccurs;
        }
        return numberOccurs;
    }

    public static int slabniaFunkcja(int liczba) {
        int slabniaWartosc = 0;
        for(int i=1; i <= liczba; i++) {
            slabniaWartosc = slabniaWartosc + i;
        }
        Scanner redaktor = new Scanner(System.in);
        int numer = redaktor.nextInt();
        System.out.println("Słabnia to " + slabniaWartosc);
    return slabniaWartosc;
    }

    public static int[] sortFunction() {
        int[] list = {5, 7, 8, 9, 2, 1, 3, 5, 6, 7, 4};
        for(int c:list) {
            System.out.print(c + ", ");
            }
        System.out.println();
        boolean changeNumbers = false;
        do {
            changeNumbers = false;
            for(int i=0; i<list.length-1; i++) {
                if(list[i] > list[i+1]){
                    int a = list[i+1];
                    list[i+1] = list[i];
                    list[i] = a;
                    changeNumbers = true;
                }
            }
        } while (changeNumbers);
        for(int b:list) {
            System.out.print(b + ", ");
        }
    return list;
    }
    public static int go() {
        Random maszynaLosujaca = new Random();
        return maszynaLosujaca.nextInt(2) == 1 ? 1 : -1;
    }

    public static void poruszLudzikaOJedenDoPrzodu() {
        int kroki = 0;
        do {
            kroki += go();
            System.out.println("Ludzik poruszy się o " + kroki);
        } while (kroki != 1);
    }

    public static void main(String[] args) {
//	listNumberFunction();
//    exchangeNumberFunction();
//        silniaFunkcja(5);
//    findNumberFunction(2);
//    System.out.println(numberIndex);
//    }
//        slabniaFunkcja(5);
//        sortFunction();
//        System.out.println(go());
        poruszLudzikaOJedenDoPrzodu();
    }
}


