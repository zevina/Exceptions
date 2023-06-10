
//4.* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращает новый массив,
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.


import java.math.RoundingMode;
import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {

        int[] first = new int[]{5, 900, 10};
        int[] second = new int[]{3, 0, 3};
//        int[] second = null;
        System.out.println("Частное элементов двух массивов: " + Arrays.toString(minusArraysItems(first, second)));
    }

    public static float[] minusArraysItems(int[] firstArr, int[] secondArr) {
        try {
            if (firstArr.length == secondArr.length) {
                float[] resultArr = new float[firstArr.length];
                for (int i = 0; i < firstArr.length; i++) {
                    resultArr[i] = (float) (firstArr[i] * 100 / secondArr[i])  / 100;
                }
                return resultArr;
            } else {
                throw new RuntimeException("Длины массивов различны");
            }

        } catch (NullPointerException e) {
            throw new RuntimeException("Длина одного или обоих массивов нулевая");
        } catch (ArithmeticException e) {
            throw new RuntimeException("Нельзя делить на ноль!");
        }
    }


}