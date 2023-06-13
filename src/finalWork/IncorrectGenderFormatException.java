package finalWork;

public class IncorrectGenderFormatException extends RuntimeException{
    public IncorrectGenderFormatException() {
        super("Пол - символ латиницей f или m  (female - женский, male - мужской)");
    }
}
