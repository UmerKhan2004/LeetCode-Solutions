public class Subarray_Sum_Equals_K {
    public static void solve() {
        int[] num = {1, 1, 1};
        int k = 2;
        int n = num.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += num[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}