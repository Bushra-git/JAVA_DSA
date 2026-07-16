public class subString {
    public static String subString(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "Hello, World!";
       
        System.out.println(subString(str, 0, 5)); // Output: Substring: Hello
    }
}
// java has an inbuilt method called substring() which can be used to get the substring of a string. The above code is an implementation of the substring method using a for loop.
// string.substring(start, end) method returns a new string that is a substring of the original string, starting from the specified start index (inclusive) and ending at the specified end index (exclusive).
