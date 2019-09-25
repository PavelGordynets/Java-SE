package lec_1.task_5;

public class CounterNegativeNAndPositiveNumber {

    int[] nums = {5,-9,-8};
    int counterPositiveNumber = 0;
    int counterNegativeNumber = 0;

    public void CounterNegativeNAndPositiveNumber() {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > 0) {
                counterPositiveNumber++;
            } else {
                counterNegativeNumber++;
            }
    }
}
