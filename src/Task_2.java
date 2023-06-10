
//2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
//    public static int sum2d(String[][] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < 5; j++) {
//                int val = Integer.parseInt(arr[i][j]);
//                sum += val;
//            }
//        }
//        return sum;
//    }

 /*
    NumberFormatException  --> Integer.parseInt(arr[i][j])  ("1a", null)
    ArrayIndexOutOfBoundsException --> j < 5 - магическое число
    NullPointerException --> если String[][] array = null;
*/

public class Task_2 {
    public static void main(String[] args) {

        String[][] array = new String[][]{
                {"1","1","1"},
                {"1","1","1"},
                {"1","1","1"},
                {"1","1","1"},
                {"1","1","1"}
        };
//        String[][] array = null;

        System.out.println("Сумма элементов двумерного массива: " + sum2d(array));
    }

    public static int sum2d(String[][] arr) {
        try {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
            return sum;
        } catch (NullPointerException e) {
            throw new RuntimeException("Массив нулевой (null) ");
        } catch (NumberFormatException e) {
            throw new RuntimeException("Невозможно получить число - " + e.getMessage());
        }


    }



}