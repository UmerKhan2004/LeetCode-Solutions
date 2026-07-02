package Arrays;

public class TwoSum {
    public static void solve() {
        int[] arr = {2,7,11,15};
        int target = 17;
        boolean found=false;
        int Index1=0;
        int Index2=0;

        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i+1 ; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    found = true;
                    Index1=i;
                    Index2=j;
                    break;
                }
            }
        }
        if(found){
            System.out.println("["+Index1 +","+ Index2 + "]");
        }
    }
}