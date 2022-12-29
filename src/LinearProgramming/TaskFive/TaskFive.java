package LinearProgramming.TaskFive;

public class TaskFive {
    //Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
    //данное значение длительности в часах, минутах и секундах в следующей форме:
    //ННч ММмин SSc.
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int allTime = sc.nextInt(); //Дополнительно для возможности ввода своих чисел
        int allTime = 23545569;
        System.out.println(setToStr(allTime));
    }
    public static String setToStr(int number) {
        return String.format("%02d:%02d:%02d", number / 3600, number / 60 % 60, number % 60);
    }
}
