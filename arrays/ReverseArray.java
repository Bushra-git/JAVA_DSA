package arrays;

public class ReverseArray {

    public static void reverse(int[] numbers) {
        int start = 0, end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8 };
        reverse(numbers);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
