package lec_1.task_1;

public class Task_1 {
    public static void main(String[] args) {
        int number = 555;
        if (number < 0) {
            System.out.println("Число " + number + " отрицательное ");
        } else {
            System.out.println("Число " + number + "  положительное");
        }
        if ((number >= 0 & number < 10) || (number > -10 & number < 0)) {
            System.out.println("Число " + number + " однозначное");
        }
        if ((number >= 10 & number < 100) || (number > -100 & number < -10)) {
            System.out.println("Число " + number + " двухзначное");
        }
        if ((number >= 100 & number < 1000) || (number > -1000 & number < -100)) {
            System.out.println("Число " + number + " трехзначное");
        }
    }
}
