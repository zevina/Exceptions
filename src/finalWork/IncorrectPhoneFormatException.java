package finalWork;

public class IncorrectPhoneFormatException extends RuntimeException{
    public IncorrectPhoneFormatException() {
        super("Hомер телефона необходимо вводить в формате целого беззнакового числа без форматирования (11 цифр)");
    }
}
