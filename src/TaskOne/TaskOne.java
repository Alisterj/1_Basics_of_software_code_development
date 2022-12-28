package TaskOne;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        // Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
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
    public static int linearFunction(int a, int b, int c) {
        return ((a - 3) * b / 2) + c;
    }
}
