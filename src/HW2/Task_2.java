package HW2;

//2. Если необходимо, исправьте данный код
//    (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)


public class Task_2 {
    public static void main(String[] args) {
        int[] intArr = new int[]{1,2,3,4,5,6,7,8,9,10};

        int index = 8;
        int div = 2;
        System.out.println("Результат деления: " + divideItemByNum(intArr, index, div));
    }

    public static double divideItemByNum(int[] intArray, int item, int d) {
        try {
            return (double) intArray[item] / d;
        } catch (ArithmeticException e) {
            throw new RuntimeException("Нельзя делить на ноль!");
        }

    }

}
