public class RangeSum {
    public static int solve(int[] Prefix,int i,int j){
        if (i==0) return Prefix[j];
        return Prefix[j] - Prefix[i-1];

    }
}
