
//3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращает новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.


import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {

        int[] first = new int[]{5, 7, 9};
        int[] second = new int[]{6, 9, 12};
//        int[] second = null;
        System.out.println("Разность элементов двух массивов: " + Arrays.toString(minusArraysItems(first, second)));
    }

    public static int[] minusArraysItems(int[] firstArr, int[] secondArr) {
        try {
            if (firstArr.length == secondArr.length) {
                int[] resultArr = new int[firstArr.length];
                for (int i = 0; i < firstArr.length; i++) {
                    resultArr[i] = firstArr[i] - secondArr[i];
                }
                return resultArr;
            } else {
                throw new RuntimeException("Длины массивов различны");
            }

        } catch (NullPointerException e) {
            throw new RuntimeException("Длина одного или обоих массивов нулевая");
        }
    }


}