import java.util.Scanner;

public class ParityArray {

    public static boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int num : nums1) {
            if (num % 2 == 0) {
                minEven = Math.min(minEven, num);
            } else {
                minOdd = Math.min(minOdd, num);
            }
        }

        // All numbers are even
        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }

        // All numbers are odd
        if (minEven == Integer.MAX_VALUE) {
            return true;
        }

        // Make all numbers odd
        return minOdd < minEven;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums1 = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        boolean result = uniformArray(nums1);

        System.out.println("Output: " + result);

        sc.close();
    }
}