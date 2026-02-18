package MajorityElement;

// Time Complexity: O(n log n) due to sorting the array
// Space Complexity: O(1) as we are using only a constant amount of extra space
import java.util.Arrays;

public class majorityElement1 {

    public int majorityElement(int[] nums) {
        int freq = 1;
        int ans = nums[0];

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                freq++;
            } else {
                freq = 1;
            }

            if (freq > nums.length / 2) {
                ans = nums[i];
                return ans;
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        int[] nums = { 2, 2, 1, 1, 2, 2, 2 };

        majorityElement1 obj = new majorityElement1();
        System.out.println(obj.majorityElement(nums));
    }
}
