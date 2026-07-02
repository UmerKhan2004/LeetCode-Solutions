public class productExceptSelf {
    public static void solve() {
        int[] num = {1, 2, 3, 4};
        int n = num.length;
        int[] answer = new int[n];

        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * num[i - 1];
        }

        int suf = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suf;
            suf = suf * num[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.println("");
    }

}
