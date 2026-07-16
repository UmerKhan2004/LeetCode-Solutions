import java.util.Arrays;

public class FirstLast_PositionIn_Array {
    public static void solve() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int left = 0, right = nums.length - 1;
        int[] x = new int[2];


        x[0] = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                x[0] = mid;
                right = mid -1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        left = 0;
        right = nums.length - 1;
        x[1] = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                x[1] = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        System.out.println(Arrays.toString(x));
    }
}
