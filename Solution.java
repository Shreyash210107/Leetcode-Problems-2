import java.util.*;

class Solution {

    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = obj.removeDuplicates(nums);

        System.out.println("Unique elements count: " + k);

        for(int i=0;i<k;i++){
            System.out.print(nums[i] + " ");
        }
    }
}