import java.util.Arrays;

public class MoveZeroes {
    public static void solve(){
        int[] num={6,1,0,3,12};
        int j=0;

        for (int i=0;i< num.length;i++){
            if(num[i] != 0){
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                j++;
            }
        }

            System.out.print(Arrays.toString(num));


        System.out.println("");


    }
}
