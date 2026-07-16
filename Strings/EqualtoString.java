public class EqualtoString {

    public static void main(String[] args) {
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");

        if (s1 == s2) {
            System.out.println("s1 and s2 are equal by reference");
        } else {
            System.out.println("s1 and s2 are not equal by reference");
        }

        if (s2==s3) {
            System.out.println("s2 and s3 are equal by value");
        } else {
            System.out.println("s2 and s3 are not equal by value");
        }
    }
}
