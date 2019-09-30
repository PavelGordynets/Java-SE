package lec_3_arrays.task_1;

import java.util.Arrays;

public class FirstArrays {
    int evenNumber = 0;
    int index = 0;

    public void ArrayNumber() {
        int[] firstArraysNumber = new int[21];
        for (int i = 0; i < 21; i++) {
            firstArraysNumber[i] = i;
            if (firstArraysNumber[i] % 2 == 0) {
                evenNumber++;
            }
        }
        System.out.println(Arrays.toString(firstArraysNumber));
        System.out.println("");

        int[] newArray = new int[evenNumber];
        for (int i = 0; i < firstArraysNumber.length; i++) {
            if (firstArraysNumber[i] % 2 == 0) {
                newArray[index] = firstArraysNumber[i];
                index++;
                System.out.println(firstArraysNumber[i] + " ");
            }
        }
        System.out.print(Arrays.toString(newArray));
    }
}
