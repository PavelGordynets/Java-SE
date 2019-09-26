package lec_2.task_3;

//Вычислить: 1+2+4+8+…+256
public class Task_3 {
    public static void main(String[] args) {
        int sumResult = 0;
        for (int i = 1; i < 256; i += 2) {
            sumResult += i;
        }
        System.out.println(sumResult);
    }
}
