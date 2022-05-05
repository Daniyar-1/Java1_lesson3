package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Динамический массив
        int[] array = {542, 1, 3, 5};
        String[] array2 = {"Данияр", "Привет", "Привет", "Привет", "Привет", "Привет", "Привет", "Привет", "Привет", "Привет", "Привет", "Привет"};

        //Фиксированный массив
        int[] arr = new int[5];
        arr[0] = 10;
        arr[2] = 15;
        arr[1] = 5;
        arr[3] = 20;
        arr[4] = 25;

        System.out.println(array);

        int a = 0;
        // инкрементация это просто +1
        a++;

        //декрементация это -1
        a--;

        //Цикл for
        for (int i = 10; i > 5; i--) {
            System.out.println(i);

        }

        //Цикл for each
        for (int value : array) {
            System.out.print(value + "] [");
        }
        //Цикл while
        int i = 0;
        System.out.println();
        while (i < array2.length) {
            System.out.println(array2[i]);
            i++;
        }

        //Цикл do..while
        int counter = 5;
        do {
            System.out.println(counter);
            counter++;
        } while (counter < 1);

        //Цикл for с оператором break && continue;
        for (int j = 0; j < 10; j++) {

            if (j == 6) {
                continue;
            }
            if ( j == 8){
                break;
            }
            System.out.println(j);

        }
    }
}
