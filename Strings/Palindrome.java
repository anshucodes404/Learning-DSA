public class Palindrome {
    public static void main(String[] args) {
        String str = "abccba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - i - 1);
            if (start != end) {
                return false;

            }
        }
        return true;
    }
}
