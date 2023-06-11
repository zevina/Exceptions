package HW2;

//3. Дан следующий код, исправьте его там, где требуется
//    (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

import java.util.Arrays;

public class Task_3 {

    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 0;
            System.out.println(a / b);  // ArithmeticException
            printSum(23, null); // NullPointerException ex
            int[] abc = { 1, 2 };
            abc[3] = 9; // IndexOutOfBoundsException
            System.out.println(Arrays.toString(abc));
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Массив выходит за пределы своего размера!");
        } catch (NullPointerException ex) {
            System.err.println("Указатель не может указывать на null!");
        } catch (ArithmeticException ex) {
            System.err.println("Деление на ноль запрещено!");
        } catch (Throwable ex) {
            System.err.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
