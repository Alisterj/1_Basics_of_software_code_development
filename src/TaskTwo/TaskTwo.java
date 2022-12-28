package TaskTwo;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        //Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        int a = functionForWrite("a");
        int b = functionForWrite("b");
        int c = functionForWrite("c");

        System.out.println("Result: " + linearFunction(a, b, c));
    }
    public static int functionForWrite(String nameVariable) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please write " + nameVariable + ": ");
        return sc.nextInt();
    }
    public static double linearFunction(int a, int b, int c) {
        return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) + (Math.pow(-a, 3)) * c + Math.pow(b, -2);
    }
}
