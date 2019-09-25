package lec_1.task_4;
//*Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.

public class Task_4 {
    public static void main(String[] args) {
        CounterPositivNumber counterPositivNumber = new CounterPositivNumber();
        counterPositivNumber.CounterPositiveNumber();
        System.out.println("Колличество отрицательных чисел состовляет: " + counterPositivNumber.counterPositiveNumber);
    }
}
