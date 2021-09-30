import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        int n, temp, k = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = inp.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = true;
            temp = arr[i];
            for (int j = 1 + i; j < n; j++) {
                if (temp > arr[j]) {
                    temp = arr[j];
                    k = j;
                    swapped = false;
                }
            }
            if (!swapped) {
                arr[k] = arr[i];
                arr[i] = temp;
            }
        }
        for (int item : arr
        ) {
            System.out.print(item + " ");
        }
    }

}
