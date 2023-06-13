package finalWork;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static finalWork.ConsoleInputValidation.*;

/**
 * Напишите приложение, которое будет запрашивать у пользователя следующие данные, разделенные пробелом:
 * Фамилия Имя Отчество датарождения номертелефона пол
 * <p>
 * Форматы данных:
 * фамилия, имя, отчество - строки
 * датарождения - строка формата dd.mm.yyyy
 * номертелефона - целое беззнаковое число без форматирования
 * пол - символ латиницей f или m.
 * <p>
 * Приложение должно проверить введенные данные по количеству.
 * Если количество не совпадает с требуемым, бросить исключение, обработать его и показать пользователю сообщение,
 * что он ввел меньше и больше данных, чем требуется.
 * <p>
 * Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
 * Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
 * Можно использовать встроенные типы java и создать свои.
 * Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.
 * <p>
 * Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии,
 * в него в одну строку должны записаться полученные данные, вида:
 * <p>
 * <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
 * <p>
 * Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
 * <p>
 * Не забудьте закрыть соединение с файлом.
 * <p>
 * При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано,
 * пользователь должен увидеть стектрейс ошибки.
 */

public class Main {

    public static void main(String[] args) {

        // считываем данные из консоли в массив строк
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Введите следующие данные (разделенные пробелом):
                Фамилия Имя Отчество датарождения номертелефона пол

                >""");
        String inputString = scanner.nextLine();
        String[] inputArray = inputString.split(" ");

        // проверка на количество введенных данных
        if (inputArray.length != 6) {
            throw new IncorrectDataSizeException();
        }

        Human hum = new Human();

        try {
            if (validateInput(inputArray[0], NAME_REGEX)) {
                hum.setSurname(inputArray[0]);
            } else throw new IncorrectNameFormatException(0);
            if (validateInput(inputArray[1], NAME_REGEX)) {
                hum.setName(inputArray[1]);
            } else throw new IncorrectNameFormatException(1);
            if (validateInput(inputArray[2], NAME_REGEX)) {
                hum.setPatronymic(inputArray[2]);
            } else throw new IncorrectNameFormatException(2);
            if (validateInput(inputArray[3], DATE_REGEX)) {
                hum.setBirthdate(inputArray[3]);
            } else throw new IncorrectDateFormatException();
            if (validateInput(inputArray[4], PHONE_REGEX)) {
                hum.setPhonenumber(inputArray[4]);
            } else throw new IncorrectPhoneFormatException();
            if (validateInput(inputArray[5], GENDER_REGEX)) {
                hum.setGender(inputArray[5]);
            } else throw new IncorrectGenderFormatException();

            String data = hum.toString();
            String fileName = hum.surname + ".txt";

            try (FileWriter writer = new FileWriter(fileName, true)) {
                writer.write(data);
                System.out.println("Данные успешно сохранены в файл " + fileName);
            } catch (IOException e) {
                System.err.println("Ошибка при сохранении данных в файл");
                e.printStackTrace();
            }
        } catch (RuntimeException e) {
            System.err.println("Что-то пошло не так:\n" + e + "\n" );
        }


    }


    private static boolean validateInput(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}




