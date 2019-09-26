package lec_2.task_1;
//Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
//день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
//суммарный путь пробежит спортсмен за 7 дней?

import java.text.DecimalFormat;

public class Task_1 {
    public static void main(String[] args) {
        double distanceFirstDay = 10;
        double sumdistanceFor7Day = 0;
        for (int i = 0; i < 7; i++) {
            sumdistanceFor7Day += distanceFirstDay;
            distanceFirstDay *= 1.1;
        }
        DecimalFormat decimalFormat = new DecimalFormat("###.###");
        System.out.println("За 7 дней спортсмен пробежал " + decimalFormat.format(sumdistanceFor7Day) + " км");
    }
}
