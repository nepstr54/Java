package task1;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(reverseWords(" a good   example "));
//Example 1:
//Input: s = "the sky is blue"
//Output: "blue is sky the"
//Example 2:
//Input: s = "  hello world  "
//Output: "world hello"
//Explanation: Your reversed string should not contain leading or trailing spaces.
//Example 3:
//Input: s = "a good   example"
//Output: "example good a"
//Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
    }
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder(words.length);
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() != 0) {
                if (result.length() != 0) {
                    result.append(" ");
                }
                result.append(words[i]);
            }
        }

        return result.toString();
    }
}
