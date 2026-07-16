public class BinarySearch {
    public static void solve(){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        int left =0,right = nums.length - 1;



        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] ==  target){
                System.out.println("Found");
                return;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid -1;
            }

        }
    }
}
