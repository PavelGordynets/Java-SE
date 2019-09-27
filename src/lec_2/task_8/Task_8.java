package lec_2.task_8;
// нарисовать
//*
//* * (1)
//* * *
//* * * *

//* * * *
//* * * (2)
//* *
//*

public class Task_8 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= 5; j++) {
                if (j < i) {
                    System.out.print(" ");
                }
                if (j >= i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("");

        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= 5; i++) {
                if (j > i) {
                    System.out.print(" ");
                }
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
