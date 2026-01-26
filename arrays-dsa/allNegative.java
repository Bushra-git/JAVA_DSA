public class allNegative {

    public static void allSmall(int numbers[]) {
        int cs = numbers[0];
        int ms = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            cs = Math.min(numbers[i], cs + numbers[i]);
            ms = Math.max(cs, ms);

        }
        System.out.println("Max Sum is :" + ms);
    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, -4 };
        allSmall(numbers);
    }

}
