package uzb.aminasaidakhmedova.arraystrial._main;

import uzb.aminasaidakhmedova.arraystrial.servies.ArraysActions;

import static uzb.aminasaidakhmedova.arraystrial.servies.CreateArray.createArray;


public class _Main {
    public static void main(String[] args) {

        System.out.println("Enter 10 numbers into the array: ");
        int[] arr = createArray(10);
        System.out.println("Amount of even numbers: "+ ArraysActions.CheckEvenNumbers(arr));
        System.out.println("Amount of odd numbers: "+ ArraysActions.CheckOddNumbers(arr));
        System.out.println("Amount of prime numbers: "+ ArraysActions.CheckEvenNumbers(arr));
        System.out.println("Sum of all numbers numbers: "+ ArraysActions.CheckEvenNumbers(arr));
        System.out.println("Difference between sums of numbers with even indexes and with odd indexes: "+ ArraysActions.CheckEvenNumbers(arr));
        System.out.println("Amount of zeros: "+ ArraysActions.CheckEvenNumbers(arr));
    }

}
