
import java.util.*;

public class SmallestStableIndex {

    public static int findStableIndex(int[] nums, int k) {
        int n = nums.length;

        // Find suffix minimum
        int[] suffixMin = new int[n];

        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        // Find the first stable index
        int prefixMax = nums[0];

        for (int i = 0; i < n; i++) {

            prefixMax = Math.max(prefixMax, nums[i]);

            int instability = prefixMax - suffixMin[i];

            if (instability <= k) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int answer = findStableIndex(nums, k);

        System.out.println("Smallest stable index: " + answer);

        sc.close();
    }
}

