import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 25, 4, 87, 5};
        int[] arr2 = {9, 5, 7, 5};
        int[] ar3 = new int[arr1.length + arr2.length];
        System.out.println("Mảng 1: " + Arrays.toString(arr1));
        System.out.println("Mảng 2: " + Arrays.toString(arr2));

        for (int i = 0; i < arr1.length; i++) {
            ar3[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            ar3[arr1.length + j] = arr2[j];
        }
        System.out.println("Mảng mới: " + Arrays.toString(ar3));
    }
}