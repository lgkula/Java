package com.company;

public class Main {

    public static int getAverage(int[] numbers) {
        var sum = 0;

        for (var i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum / numbers.length;
    }


    public static int getNumbersBelowAverage(int[] numbers) {
        if (numbers.length > 0) {
            var average = getAverage(numbers);
            var numbersBelowAverageAmount = 0;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < average) {
                    numbersBelowAverageAmount++;
                }
            }

            return numbersBelowAverageAmount;
        }

        return 0;
    }

    public static int silnia(int i) {
        if (i == 0)
            return 1;
        else
            return i * silnia(i - 1);
    }

    public static int silniaFunkcja(int n) {
        int silnia = 1;
        if (n == 0) {
            silnia = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                silnia = silnia * i;
            }
            System.out.println("Silnia wynosi: " + silnia);

        }
        return silnia;
    }

    public static int numbersCountFunction(int[] tableNumbers) {
        int tableNumbersAverage = 0;
        int tableNumbersSum = 0;
        int numbersCount = 0;
        for (int i = 0; i < tableNumbers.length; i++) {
            tableNumbersSum = tableNumbersSum + tableNumbers[i];
        }
        tableNumbersAverage = tableNumbersSum / tableNumbers.length;

        for (int a = 0; a < tableNumbers.length; a++) {
            if (tableNumbers[a] < tableNumbersAverage) {
                numbersCount += 1;
            }
        }
        System.out.println("Ilość liczb mniejszych od średniej to: " + numbersCount);
        return numbersCount;
    }


    public static int silniaFuncja1(int n) {
        int silnia = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                silnia = silnia * i;
            }
        }
    System.out.println("Silnia wynosi: " + silnia);
        return silnia;
    }

    public static int belowAverageFunction2(int[] table) {
        int average = 0;
        int sum = 0;
        int belowAverage = 0;
        for (int i = 0; i < table.length; i++) {
            sum = sum + table[i];
        }
        average = sum / table.length;

        for (int i = 0; i < table.length; i++) {
            if(table[i] < average) {
                belowAverage += 1;
            }
        }
        System.out.println("Średnia to: " + average);
        System.out.println("Wynik to: " + belowAverage);
        return belowAverage;
    }

    public static void main(String[] args) {
        //System.out.println("Dzień dobry kochany Chrabąszczu!");
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 3, 4, 99};

//        System.out.println(getNumbersBelowAverage(test));

//        silniaFunkcja(3);
//        numbersCountFunction(test);
//        silniaFuncja1(5);
        belowAverageFunction2(test);
    }
}
