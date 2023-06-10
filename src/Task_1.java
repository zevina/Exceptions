
//1. Реализуйте 3 метода, чтобы в каждом из них получить разные стандартные для Java исключения;

public class Task_1 {
    public static void main(String[] args) {

        System.out.println(divide(5,0)); // ArithmeticException

        int[] array = new int[] {1,2,3,6,8};
        System.out.println(multiplyArrayItem(array,1000, 8)); // ArrayIndexOutOfBoundsException

        String testString = null;
        System.out.println(getDoubleStringLength(testString)); // NullPointerException
    }

    public static int divide(int a, int b) {
        return a/b;
    }

    public static int multiplyArrayItem(int[] arr, int index, int factor) {
        return arr[index] * factor;
    }

    public static int getDoubleStringLength(String str) {
        return str.length() * 2;
    }

}