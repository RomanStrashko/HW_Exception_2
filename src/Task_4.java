import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) throws Exception{
        /*
        Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
         */

        readString("hgcvhgvc");
    }

    private static void readString(String str) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Введите не пустую строку: ");
            String string = scanner.nextLine();
            if (string != null)
                System.out.println("Спасибо!");
        } catch (Exception e){
            System.out.println("Пустые строки вводить нельзя!");
        }
    }
}
