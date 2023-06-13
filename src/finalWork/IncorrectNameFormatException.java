package finalWork;

public class IncorrectNameFormatException extends RuntimeException {
    public IncorrectNameFormatException(int x) {
        if (x == 0) {
            System.err.println("Фамилия содержит цифры или спецсимволы");
        } else if (x == 1) {
            System.err.println("Имя содержит цифры или спецсимволы");
        } else {
            System.err.println("Отчество содержит цифры или спецсимволы");
        }
    }
}
