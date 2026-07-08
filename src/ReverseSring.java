public class ReverseSring {
    public static String[] solve(){
        String[] s = {"h","e","l","l","o"};
                int left = 0;
                int right = s.length - 1;

                while (left < right) {

                    String temp = s[left];
                    s[left] = s[right];
                    s[right] = temp;

                    left++;
                    right--;
                }
                return s;
            }

        }

