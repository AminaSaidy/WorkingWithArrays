package uzb.aminasaidakhmedova.arraystrial.servies;

public class ArraysActions {

    public static int CheckEvenNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int CheckOddNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 1) {
                count++;
            }
        }
        return count;
    }

}
