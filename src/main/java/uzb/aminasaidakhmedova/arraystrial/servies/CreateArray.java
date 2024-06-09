package uzb.aminasaidakhmedova.arraystrial.servies;

import java.util.Scanner;

public class CreateArray {

    public static int[] createArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            Scanner inputInt = new Scanner(System.in);
            arr[i] = inputInt.nextInt();
        }
        return arr;
    }
}
