package lec_1.task_7;

/*
 В переменную записываете количество программистов. В зависимости от количества программистов
 необходимо вывести правильно окончание. Например:  2 программиста, 1 программист, 10 программистов и т.д.
*/


public class Task_7 {
    public static void main(String[] args) {
        int numberOfProgrammers = 1312;
        String ending;
        switch (numberOfProgrammers %10 ) {
            case 1:
                ending = "программист";
                break;
            case 2:
            case 3:
            case 4:
                ending = "программиста";
                break;
            default:
                ending = "программистов";
        }
        System.out.println("У нас есть " + numberOfProgrammers + " " + ending);
    }
}
