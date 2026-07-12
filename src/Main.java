import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Arrays.TwoSum.solve();
//        Arrays.BestTimetoBuyandSellStock.Solve();
        MoveZeroes.solve();
        MAjorityElement.solve();
        productExceptSelf.solve();
        RotateArray.solve();

        int[] nums={1,7,3,6,5,6};
//        System.out.println(Hashing.containsDuplicate(nums));

        System.out.println(PivotIndex.Solve(nums));



        int[] num ={1,2,3,4,5};
        int n=num.length;
        int[] Prefix = new int[n];
        Prefix[0] = num[0];
        for(int i=1;i<n;i++) {
            Prefix[i] = Prefix[i - 1] + num[i];
        }
        System.out.println(RangeSum.solve(Prefix,1,3));



        Subarray_Sum_Equals_K.solve();

        Subarray_Sums_Divisible_by_K.solve();

        String s = "Madam";
        boolean solve = Valide_palindrome.solve( s);
        System.out.println(solve);


        RemoveDuplicateSA.solvee();

        System.out.println(Arrays.toString(Two_Sum_II_Input_Array_Is_Sorted.solve()));

        System.out.println(Sum3.solve());

        int res = Container_With_Most_Water.solve();
        System.out.println(res);


        System.out.println(Arrays.toString(ReverseSring.solve()));



        FizzBuzz.solve();

        SortColors.solve();

        TrappingRainWater.solve();

        MinimumSize_SubarraySum.solve();


        String s1 = "AABABBA";
        int k = 1;
        System.out.println(Longest_Repeating_Character_Replacement.solve(s1,k));

        ReduceToZero.solve();

        System.out.println(PalindromeNumber.solve());
    }
}
