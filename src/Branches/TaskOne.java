package Branches;

import javax.security.auth.login.AccountNotFoundException;

public class TaskOne {
    //Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    //он прямоугольным.
    public static void main(String[] args) {
        int firstAngle = 90;
        int secondAngel = 30;
            angle(firstAngle, secondAngel);
    }
    public static void angle(int x, int y) {
        if ((x + y) < 180) {
            System.out.println("Such a triangle is exist");
            if (x == 90 || y == 90 || (x + y) == 90) {
                System.out.println("Triangle is rectangular");
            }
        }
        else
            System.out.println("It's not triangle");
    }
}
