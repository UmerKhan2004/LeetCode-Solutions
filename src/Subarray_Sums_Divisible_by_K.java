public class Subarray_Sums_Divisible_by_K {
//    public static void solve(int[] nums,int k){
public static void solve(){
        int[] num = {4,5,0,-2,-3,1};
        int k = 5;
        int n = num.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += num[j];

                if (sum % k == 0) {
                    count++;
                }
            }
        }

        System.out.println(count+"gg");
    }
}
