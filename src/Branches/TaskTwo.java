package Branches;

public class TaskTwo {
    //Найти max{min(a, b), min(c, d)}.
    public static void main(String[] args) {
        int a = 123;
        int b = 56;
        int c = 78;
        int d = 57;
        System.out.println("Result: " + Math.max((int)Math.min(a, b), (int)Math.min(c, d))); //Более быстрый способ решения
    }
}
