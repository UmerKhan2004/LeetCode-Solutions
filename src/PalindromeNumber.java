public class PalindromeNumber {
    public static boolean solve() {
        int num = -121;
        String str = Integer.toString(num);

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}