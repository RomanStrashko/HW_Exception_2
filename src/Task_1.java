import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        /*
         * 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
         * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
         * вместо этого, необходимо повторно запросить у пользователя ввод данных
         */

        inputFloat();
    }

    private static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        while (x) {
            System.out.println("Введите дробноe числo (типа float): ");
            String num = scanner.nextLine();
            try {
                Float.parseFloat(num);
                System.out.println("Все верно!");
                x = false;
            }

            catch (NumberFormatException e) {
                System.out.println("Введены некорректные данные. Попробуйте снова!");
                System.out.println();
            }


        }
        scanner.close();

        return 0;
    }
}
