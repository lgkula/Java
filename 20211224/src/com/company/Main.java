package com.company;


import com.tools.AnnalynsInfiltration;
import com.tools.Lasagne;

public class Main {

    public static String twofer(String name, int x) {
        if (name == null) {
            name = "you";
        }

        return  "One for " + name + ", one for me.";
    }


    public static void main(String[] args) {
//        String name = null;
//        System.out.println(twofer(name, 2));

//        Lasagne potrawa = new Lasagne();
//        int suma1 = potrawa.expectedMinutesInOven();
//
//        int suma = new Lasagne().expectedMinutesInOven();
//        int wynik = Lasagne.preparationTimeInMinutes(2);
        AnnalynsInfiltration wynik = new AnnalynsInfiltration();
        System.out.println("wynik = " + wynik);

    }
}
