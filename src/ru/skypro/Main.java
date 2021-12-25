package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //1
        int [] weight = new int [3];
        weight [0] = 1;
        weight [1] = 2;
        weight [2] = 3;

        double [] weightDouble = {1.57, 7.654, 9.986};

        int [] thirdWeight = {5, 6, 7, 9};

        //2
        System.out.print(weight[0] + ", ");
        System.out.print(weight[1] + ", ");
        System.out.println(weight[2]);

        System.out.print(weightDouble[0] + ", ");
        System.out.print(weightDouble[1] + ", ");
        System.out.println(weightDouble[2]);
        //for (int i = 0; i < weightDouble.length; i++) {
        //System.out.print(weightDouble[i] + ", ");}

        System.out.println(Arrays.toString(thirdWeight));

        //3
        System.out.print(weight[2] + ", ");
        System.out.print(weight[1] + ", ");
        System.out.println(weight[0]);

        for (int i = weightDouble.length - 1; i >= 0; i--) {
            System.out.print(weightDouble[i] + ", ");
        }
        System.out.println();

        for (int i = thirdWeight.length - 1; i >= 0; i--) {
            System.out.print(thirdWeight[i] + ", ");
        }
        System.out.println();

        //4
        for (int i = 0; i < weight.length; i++) {
            if (weight [i] % 2 != 0) {
                weight [i] = weight [i] + 1;} {
            System.out.print(weight[i] + ", ");
            }
        }
    }
}
