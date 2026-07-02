package Arrays;

import java.util.HashSet;

public class Hashing {

    public static boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                System.out.println("Duplicate found!!");
                return  true;
            }
            set.add(num);
        }
        return false;
    }

}
