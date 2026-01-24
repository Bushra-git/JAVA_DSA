package arrays;

public class SmallestElement {

    public static int getSmallest(int[] numbers) {
        int smallest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 6, 7, 8 };
        System.out.println("Smallest element: " + getSmallest(numbers));
    }
}