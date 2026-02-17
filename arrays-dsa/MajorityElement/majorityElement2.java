package MajoritElement;

//brute force

class Solution {

    public int majorityElement2(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int freq = 0;

            for (int j = i; j < n; j++) {
                int el = nums[i];
                if (nums[i] == nums[j]) {
                    freq++;
                }

            }
            if (freq > n / 2) {
                return nums[i];
            }
        }
        return -1;
    }
}
