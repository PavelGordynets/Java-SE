package lec_2.task_4;

public class SumAAndB {
    private int sumResult = 0;

    public void ResultSum() {
        ScannerAAndB scannerAAndB = new ScannerAAndB();
        scannerAAndB.ScannerA();
        scannerAAndB.ScannerB();
        for (int i = 0; i < scannerAAndB.numberB; i++) {
            sumResult += scannerAAndB.numberA;
        }
        System.out.println("Результат " + sumResult);
    }
}
