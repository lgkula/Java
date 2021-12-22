package com.company;

import java.util.Arrays;

public class Main {
    public static int zadanie1(int liczba) {
        int wynik = liczba * 2 + 7;
        return wynik;
    }

    public static boolean zadanie2(String sentense, char letter) {
        boolean letterAppear = false;
        for (int i = 0; i < sentense.length(); i++) {
            if (sentense.charAt(i) == letter) {
                letterAppear = true;
            }
        }
        return letterAppear;
    }

    public static String zadanie3(String sentense, char letter) {
        for (int i = 0; i < sentense.length(); i++) {
            if (sentense.charAt(i) == letter) {
                return "Litera występuje";
            }
        }
        return "Litera nie występuje";
    }

    public static int zadanie4(String sentense, char letter) {
        int letterNumber = 0;
        for (int i = 0; i < sentense.length(); i++) {
            if (sentense.charAt(i) == letter) {
                letterNumber++;
            }
        }
        return letterNumber;
    }

    public static void zadanie5(String s, String a) {
        System.out.println(s.contains(a));
    }

    public static String zadanie6() {
        String s = "matematyka";
        String s1 = s.substring(4);
        System.out.println(s1);
        return s1;
    }

    public static String zadanie7() {
        String s1 = "Asia";
        String s2 = "Asia";
        String s3 = s1 + " " + s2;
        return s3;

    }

    public static void zadanie8() {
        // Kotku, wygląda na to, że do mojej dziurawej pamięci dołączyły również problemy z czytaniem.
        // Funkcja sortująca to Arrays.sort(obiektDoPosortowania), gdzie jedyną zmienną jest obiektDoPosortowania
        // Poniżej zamieszczam dwa przykłady, które wytłumaczą Ci sortownie lepiej niż ja :)
        // Dobranoc Kochanie :*
        // Wybacz mi proszę nieogarnięcie :(
        // \n robi nową linię jbc

        int[] listaInt = {2, 3, 5, 8, 9, 4, 9, 4, 9};
        char[] listaStr = {'a', 'b', 'd', 'r', 't', 'e', 'z', 'g', 'h'};

        System.out.println("Sortuję tablicę intów: ");
        System.out.print("Tablica intów przed sortowaniem: : ");
        for (int i = 0; i < listaInt.length; i++) {
            System.out.print(listaInt[i] + ", ");
        }

        Arrays.sort(listaInt);

        System.out.print("\nTablica intów po sortowaniu: : ");
        for (int i = 0; i < listaInt.length; i++) {
            System.out.print(listaInt[i] + ", ");
        }

        System.out.println("\n\nSortuję tablicę charów: ");
        System.out.print("Tablica charów przed sortowaniem: : ");
        for (int i = 0; i < listaStr.length; i++) {
            System.out.print(listaStr[i] + ", ");
        }

        Arrays.sort(listaStr);

        System.out.print("\nTablica charów po sortowaniu: : ");
        for (int i = 0; i < listaStr.length; i++) {
            System.out.print(listaStr[i] + ", ");
        }
    }

    public static int[] fubinaciNumbersFunction(int elementNumber) {
        if (elementNumber < 1) {
            System.out.println("Podano błędną wartość. Liczba elementów nie może być mniejsza od 1");
//            int[] pustaTablica = {};
            return new int[0];
        }
        int[] fubinaciNumbers = new int[elementNumber];
        if (elementNumber == 1) {
            fubinaciNumbers[0] = 1;
        } else {
            fubinaciNumbers[0] = 1;
            fubinaciNumbers[1] = 1;
            for (int i = 2; i < elementNumber; i++) {
                fubinaciNumbers[i] = fubinaciNumbers[i - 1] + fubinaciNumbers[i - 2];
            }

        }
        if (elementNumber > 0) {
            for (int i = 0; i < fubinaciNumbers.length; i++) {
                System.out.print(fubinaciNumbers[i] + ", ");
            }
        }
        return fubinaciNumbers;
    }
    public static int[] listSortFunction() {
        int[] numberList = {2, 3, 5, 8, 9, 4, 9, 4, 9, 1, 3,6,8,7,2};
        boolean changeNumber = false;
        do {
            changeNumber = false;
            for (int i = 0; i < numberList.length-1; i++) {
            if(numberList[i] > numberList[i + 1]) {
                int a = numberList[i + 1];
                numberList[i + 1] = numberList[i];
                numberList[i] = a;
                changeNumber = true;
            }
            }
        } while(changeNumber);
//    for(int i=0; i<numberList.length; i++) {
//        System.out.print(numberList[i] + ", ");
//    }
        for(int names: numberList) {
            System.out.print(names + ", ");
        }
        return numberList;
    }

    public static void main(String[] args) {
//	    System.out.println("Zwrócona wartość " + zadanie1(2));
//      System.out.println(zadanie2("dkjhuihklhli klhuhklajiokjhu", 'a'));
//        System.out.println(zadanie3("dkjhuihklhli klhuhklajiokjhu", 'x'));
//        System.out.println(zadanie4("dkjhuiahklhali klahuaahkalajiokjhu", 'a'));
//        zadanie5("dkjhuiahklhali klahuaahkalajiokjhu", "as");
//    zadanie6();
//    System.out.println(zadanie7());
//        zadanie8();
        //fubinaciNumbersFunction(5);
        listSortFunction();
    }
}
