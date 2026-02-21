public class containWaterBrute {

    public static int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;
        int lp = 0;
        int rp = n - 1;
        while (lp < rp) {
            int width = rp - lp;
            int ht = Math.min(height[lp], height[rp]);
            int area = width * ht;
            maxWater = Math.max(maxWater, area);
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;

    }

    public static void main(String args[]) {
        containWaterBrute obj = new containWaterBrute();
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println("Maximum water that can be contained is: " + (maxArea(height)));
    }

}
