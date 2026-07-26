import java.util.Scanner;

public class max{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        // Read the first element
        arr[0] = sc.nextInt();
        int max = arr[0];

        // Read remaining elements and find maximum
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();

            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Max: " + max);
    }
}
