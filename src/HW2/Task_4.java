package HW2;

//4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что-нибудь: ");
        String input = scanner.nextLine();
        if (input.length() == 0) {
            throw new RuntimeException("пустые строки вводить нельзя!");
        } else System.out.println("Вы ввели: " + input);

    }
}
