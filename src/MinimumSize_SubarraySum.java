public class MinimumSize_SubarraySum {
    public static void solve(){
        int[] nums = {2,3,1,2,4,3};
        int target =7;
        int left=0;
        int sum=0;
        int minLenght = Integer.MAX_VALUE;

        for(int i=0;i< nums.length;i++){
            sum += nums[i];

            while(sum >= target){
                minLenght = Math.min(minLenght, i - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        if(minLenght== Integer.MAX_VALUE){
            System.out.println(0);
        }else {
            System.out.println(minLenght);
        }
    }
}




