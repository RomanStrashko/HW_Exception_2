import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        /*
        2. Если необходимо, исправьте данный код
        (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
        */
        int num = 10;

        division(num);

    }
    public static void division(int number){
        Scanner scanner = new Scanner(System.in);
        try {
            int d = 0;
            double catchedRes1 = number / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя: " + e);
        }
    }

}
