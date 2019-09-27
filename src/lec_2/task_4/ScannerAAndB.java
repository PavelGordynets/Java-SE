package lec_2.task_4;

import java.util.Scanner;

public class ScannerAAndB {
    int numberB;
    int numberA;

    public void ScannerA() {

        Scanner scannerA = new Scanner(System.in);
        do {
            System.out.println("ВВедите числа А: ");
            while (!scannerA.hasNextInt()) {
                System.out.println("Oshibka");
                System.out.println("ВВедите числа А: ");

                scannerA.next();
            }
            numberA = scannerA.nextInt();
        } while (numberA > 0 & numberA < 0);
    }

    public void ScannerB() {
        Scanner scannerB = new Scanner(System.in);
        do {
            System.out.println("ВВедите числа B: ");
            while (!scannerB.hasNextInt()) {
                System.out.println("Oshibka");
                System.out.println("ВВедите числа B: ");
                scannerB.next();
            }
            numberB = scannerB.nextInt();
        } while (numberB > 0 & numberB < 0);
    }

}


