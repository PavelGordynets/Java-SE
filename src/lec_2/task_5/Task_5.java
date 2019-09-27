package lec_2.task_5;

//Напишите программу печати таблицы перевода расстояний из дюймов в
//сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

public class Task_5 {
    public static void main(String[] args) {
        double inchValue = 2.54;
        double firstNaumber = 0;
        for (int i = 0; i <= 20; i++) {
            firstNaumber = i * inchValue;
            System.out.println(i + " cm" + " - " + firstNaumber +" inch");
        }
    }
}
