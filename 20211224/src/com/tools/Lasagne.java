package com.lasagne;

public class Lasagne {

        public Lasagne() {
            System.out.println("Konstruktor!");
        }


            // TODO: define the 'expectedMinutesInOven()' method
        public int expectedMinutesInOven() {
            return 40;
        }

        // TODO: define the 'remainingMinutesInOven()' method
        public int remainingMinutesInOven(int minutesInOven) {
            return expectedMinutesInOven() - minutesInOven;
        }
        // TODO: define the 'preparationTimeInMinutes()' method
        public static int preparationTimeInMinutes(int layers) {
            return layers * 2;
        }
        // TODO: define the 'totalTimeInMinutes()' method
        public int totalTimeInMinutes(int layers, int minutesInOven) {
            return preparationTimeInMinutes(layers) + minutesInOven;
        }
    }
