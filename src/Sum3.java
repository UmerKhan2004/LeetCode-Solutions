import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public static List<List<Integer>> solve() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        result.add(triplet);
                    }
                }
            }
        }

        return result;
    }
}