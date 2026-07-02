import java.util.Arrays;

public class RotateArray {
    public static void solve(){
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        int j= nums.length-1;
        int start=0;
        int end= nums.length-1;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }


        start=0;
        end=k-1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }


        start=k;
        end= nums.length-1;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));

    }
}
