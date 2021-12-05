package com.company;

public class Main {
//    TU MASZ TE INDEKSY JESZCZE

    public static int[] countBFunction(int[] a, int b) {
        int countB = 0;
        for(int i = 0; i < a.length; i++) {if(a[i] == b) {countB++;}}
        if(countB > 0) {
            int[] indexes = new int[countB];
            for(int i = 0; i < a.length; i++) {
                if(a[i] == b) {
                    indexes[--countB] = i; }
            }
            return indexes;
        }
        System.out.println(countB);
        return new int[10];
    }



//    CHOINKA - tylko ładne wcięcia zrób


    public static void rysujChoinke(int n) {
        for (int i = 1; i <= n; i++)
        {
            for(int j=0;j<n-i;j++){System.out.print(" ");}
            for (int j = 0; j<(i*2)-1; j++){System.out.print("*");}
            System.out.println(" ");
        }

    }

    public static void christmasTree(int n) {
        String gwiazdka = "";
        for(int i=1; i <=n; i++) {
            gwiazdka = gwiazdka + "*";
            System.out.println(gwiazdka);
        }

    }
    public static void silniaFunkcja(int n) {
        int silnia = 1;
        if(n == 0) {
            silnia = 1;
        } else {
            for (int i = 1; i<=n; i++) {
                silnia = silnia * i;
            }
            System.out.println(silnia);
        }

    }

    public static void getSum(int n) {
        if(n<0) {
            System.out.println("Podaj prawidłowe n");
        } else {
            int suma = 0;
            for(int i=1; i<n; i++) {
                suma += i;
            }
            System.out.println("Wartość to " + suma);
        }
    }

    public static int[] indexFunction(int[] a, int b) {
        int[] indexTable = new int[a.length];
        int indexInIndexTable = -1;

        for(int i=0; i<a.length; i++) {
            if(a[i] == b) {
              indexTable[indexInIndexTable+1] = i;
              indexInIndexTable++;
            }
        }
        indexTable.clone()
        for(int c:indexTable) {
            System.out.print(c + ", ");
            }
        return indexTable;
    }

    public static void main(String[] args) {
//        System.out.println(countBFunction(new int[]{2,4,5,6,7,8,9}, 7));
//        for(int a:countBFunction(new int[]{2,4,5,6,7,8,9}, 7)) {
//            System.out.println(a);
//        }
//        rysujChoinke(9);
//        christmasTree(9);
//            silniaFunkcja(5);
//        getSum(6);
        indexFunction(new int[]{2,4,7,3,6,7,5,6,7,8,9}, 7);
    }
}
