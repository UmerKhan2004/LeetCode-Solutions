import java.util.Arrays;

public class OneDArray_to_2DArray {
    public  static  void solve(){
        int[] nums ={1,2,3,4};
        int m=2,n =2,counts=0;
        int[][] x = new int[m][n];

        if(m*n == nums.length) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    x[i][j] = nums[counts];
                    counts++;
                }
            }
            System.out.println(java.util.Arrays.deepToString(x));
            return;
        }else{
            System.out.println("not possible");
        }
    }
}
