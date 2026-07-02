public class MAjorityElement {
    public static  void solve() {
        int[] num={1,2,3,4,2,2,6,2};
        int candidate =num[0];
        int count =1;

        for(int i=1;i<num.length;i++){
            if(count==0){
                candidate =num[i];
                count=1;

            }else if(num[i] == candidate){
                count++;
            }else {
                count--;
            }

        }
        System.out.println(candidate);
    }
}
