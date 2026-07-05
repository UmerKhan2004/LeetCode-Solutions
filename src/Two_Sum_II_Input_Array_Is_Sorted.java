public class Two_Sum_II_Input_Array_Is_Sorted {
    public static int[] solve(){
        int nums[] = {2,7,11,15};
        int left=0,  right=nums.length-1 , target=9;

        while(left < right){
            int sum=nums[left] +  nums[right];
            if(sum == target){
                return new int[]{left+1,right+1};
            }else if(sum < target ){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }
}
