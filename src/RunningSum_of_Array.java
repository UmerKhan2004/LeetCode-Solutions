import java.util.Arrays;

public class RunningSum_of_Array {
    public static void solve(){
        int[] nums = {1,2,3,4};
        int[] x = new int[nums.length];

        x[0]=nums[0];

        for(int i=1;i<nums.length;i++){
            x[i] = nums[i] + x[i-1];
        }
        System.out.println(Arrays.toString(x));
    }
}
