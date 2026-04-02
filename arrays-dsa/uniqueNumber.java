public class uniqueNumber {
    public static int unique(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i]; // XOR operation
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 8, 1, 2, 3 };
        System.out.println(unique(nums)); // Output: 4
    }
}
