package uzb.aminasaidakhmedova.arraystrial.servies;

public class ArraysActions {

    public static int CountEvenNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int CountOddNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    public static boolean CheckIfPrime(int num) {
        if (num < 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int CountPrimeNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (CheckIfPrime(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static int AddAllNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int AddEvenIndex(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int AddOddIndex(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int SubtractEvenOddIndexes(int[] arr) {
        int difference = AddEvenIndex(arr) - AddOddIndex(arr);
        return difference;
    }

    public static int CountZeros(int[] arr) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }


}


