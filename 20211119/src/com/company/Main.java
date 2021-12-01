package com.company;

public class Main {
    public static boolean checkSentenseFunction(String sentense, String word) {
        boolean wordOccur = false;
        String sentensePart = sentense.substring(sentense.length()-1 - word.length(),sentense.length()-1);
        if(sentensePart.equals(word)) {
            wordOccur = true;
        }
        if(wordOccur == true){
            System.out.println("Wyraz " + word + " występuje w zdaniu.");
        } else {
            System.out.println("Wyraz " + word + " nie występuje w zdaniu.");
        }
        return wordOccur;
    }
    public static int sredniaArytmetycznaFunkcja(int[] tablica) {
        int sredniaWartosc = 0;
        int sumaElementow = 0;
//        for (int i = 0; i < tablica.length; i++) {
//            sumaElementow = sumaElementow + tablica[i];
//        }

	for(int a:tablica) {
//		sumaElementow = sumaElementow + a;
		sumaElementow += a;
	}
        sredniaWartosc = sumaElementow / tablica.length;
        System.out.println("średnia wartość to: " + sredniaWartosc);

        return sredniaWartosc;
    }

    public static int secondMinValueFunction(int[] tableNumbers) {
        int MinValue = tableNumbers[0];
        int secondMinValue = 0;

        for(int i=0; i<tableNumbers.length; i++) {
            if (MinValue > tableNumbers[i]) {
                MinValue = tableNumbers[i];
            }
        }
        for(int i=0; i < tableNumbers.length ;i++) {
            if(secondMinValue > tableNumbers[i] && tableNumbers[i] > MinValue) {
                secondMinValue = tableNumbers[i];
            }
        }
        System.out.println("Druga najmnijesza to: " + secondMinValue);
        return secondMinValue;
    }

    public static void main(String[] args) {
//	checkSentenseFunction("Asia kocha swojego Misia", "Misia");
//    sredniaArytmetycznaFunkcja(new int[]{10, 20, 20, 30, 100});
        secondMinValueFunction(new int[] {1, 3, -99, 2424, 0, -13423, 42});
    }
}
