package TaskFour;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        //Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
        //дробную и целую части числа и вывести полученное значение числа.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please write number: ");
        double number = sc.nextDouble();

        System.out.println("Result: " + invertingFunction(number));
    }
    public static double invertingFunction(double someNumber) { //С усложнением для возможности работы с любым числом без привязки к перемсеной с фиксированным значением
        String number = Double.toString(someNumber);
        String[] arr = number.split("\\.");
        String result = arr[1] + "." + arr[0];

        return Double.parseDouble(result); // Сделала тип double для возможности работы с числом далее при необходимости
    }
}
