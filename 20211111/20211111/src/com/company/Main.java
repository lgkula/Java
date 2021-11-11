package com.company;


import java.util.Scanner;

public class Main {

    public static void zadanie1() {
        // write your code here
//        String a = "Cześć";
//        System.out.print(a + "Asia");
//        System.out.println("Inna treść");
//        System.out.println("A tu jeszcze inna");
        System.out.print("Podaj imię: ");
        Scanner name = new Scanner(System.in);
        String wpisaneImie = name.nextLine();
        if (wpisaneImie != "") {
            System.out.println("Podałeś imię " + wpisaneImie);
        }
        System.out.println();
        if (wpisaneImie.endsWith("a") && wpisaneImie != "" && !wpisaneImie.equals("Kuba")){
            System.out.println("Podane imie jest damskie");
        }
        else if ((!wpisaneImie.endsWith("a") || wpisaneImie.equals("Kuba")) && wpisaneImie != "") {
            System.out.println("Podane imie jest męskie.");
        }
        else {
            System.out.println("Nie podałeś poprawnego imienia!");
        }
    }

    public static void zadanie2() {
        System.out.println("To jest zadanie nr 2");
        Scanner imieZwierzaka = new Scanner(System.in);
        System.out.print("Podaj imię swojego zwierzaka: ");
        String podaneImieZwierzaka = imieZwierzaka.nextLine();


        if (podaneImieZwierzaka != "" && !podaneImieZwierzaka.equals("Ruda")) {
            System.out.println("Pondane imie zwierzaka to: " + podaneImieZwierzaka);
        }
        else if (podaneImieZwierzaka.equals("Ruda")) {
            System.out.println("To mój fajny kot");
        }
        else if (podaneImieZwierzaka.isEmpty()){
            System.out.println("Nie podałeś imienia");
        }
        else {
            System.out.println("Nie podałeś poprawnego imienia zwierzaka!");
        }

    }
//  Zadanie nr 3
    public static void zadanie3() {
        System.out.println("Zadanie nr 3");
        Scanner age = new Scanner(System.in);
        System.out.print("Podaj swój wiek: ");
        int podanyWiek = age.nextInt();
        System.out.println("Podany przez ciebie wiek to: " + podanyWiek);
        if (podanyWiek >= 18) {
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Jesteś niepełnoletni.");
        }
    }
        //  Zadanie nr 4
        public static void zadanie4() {
            Scanner wiek = new Scanner(System.in);
            System.out.print("Podaj swój wiek: ");
            int podanyWiek = wiek.nextInt();
            System.out.println("Podałeś wiek: " + podanyWiek);
        }

    public static void main(String[] args) {
//        zadanie1();
//        zadanie2();
//        zadanie3();
    zadanie4();
        }
}
