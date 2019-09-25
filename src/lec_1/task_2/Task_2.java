package lec_1.task_2;

public class Task_2 {
    public static void main(String[] args) {
        Double SideA = 10.0;
        Double SideB = 10.0;
        Double SideC = 10.0;

        if ((SideA <= 0 | SideA > SideB + SideC) || (SideB <= 0 | SideB > SideA + SideC) || (SideC <= 0 | SideC > SideA + SideB)) {
            System.out.println("Треугольник с такими сторонами не существует!");
        } else System.out.println("Треугольник с такими сторонами  существует!");
    }
}

