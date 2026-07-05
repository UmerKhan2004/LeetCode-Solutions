import java.util.Arrays;

public class RemoveDuplicateSA {
    public static void solvee(){
        int[] nums = {1,1,2,3,3};
        int slow=0;

        for(int fast=1;fast< nums.length;fast++){
            if(nums[fast] != nums[slow]){
                slow++;
                nums[slow] =nums[fast];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
