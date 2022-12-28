package TaskThree;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        //Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        int x = functionForWrite("x");
        int y = functionForWrite("y");

        System.out.println("Result: " + linearFunction(x, y));
    }
    public static int functionForWrite(String nameVariable) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please write " + nameVariable + ": ");
        return sc.nextInt();
    }
    public static double linearFunction(int x, int y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }
}
