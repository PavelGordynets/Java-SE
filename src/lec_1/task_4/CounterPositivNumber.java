package lec_1.task_4;

public class CounterPositivNumber {
    int[] nums = {-9, -9, -8};
    int counterPositiveNumber = 0;

    public void CounterPositiveNumber() {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > 0) {
                counterPositiveNumber++;
            }
    }
}
