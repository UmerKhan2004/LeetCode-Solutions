public class ReduceToZero {
    public static void solve(){
        int num=8;
        int count=0;

        while(num >0){
            count +=1;
            if(num % 2 ==0){
                num /=2;
            }else{
                num -=1;
            }
        }
        System.out.println(count);
    }
}
