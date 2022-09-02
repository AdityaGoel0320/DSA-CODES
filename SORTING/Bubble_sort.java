import java.util.Arrays;

public class Bubble_sort {

    

    public static void main(String args[]) {
        int arr[] = { 7, 8, 1, 3, 2 };

        // bubble sort
        int l = arr.length;
        for (int i = 0; i <= l - 2; i++) {
            for (int j = 0; j <= l-2-i ; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}