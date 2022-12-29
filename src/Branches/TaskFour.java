package Branches;

import java.time.Year;

public class TaskFour {
    //Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
    //отверстие.
    public static void main(String[] args) {
        int A = 16;
        int B = 32;

        int x = 33;
        int y = 16;
        int z = 36;

        boolean status = false;
        status = getAnswer(A, B, x, y);
        if (!status)
            status = getAnswer(A, B, y, z);
        if (!status)
            status = getAnswer(A, B, x, z);

        if (status)
            System.out.println("Кирпич пройдет");
        else
            System.out.println("Кирпич не пройдет");
    }
    public static boolean getAnswer(int A, int B, int oneSide, int twoSide) {
        return (oneSide <= A && twoSide <= B) || (twoSide <= A && oneSide <= B);
    }
}
