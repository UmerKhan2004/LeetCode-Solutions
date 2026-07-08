import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void solve(){

                List<String> answer = new ArrayList<>();

                for (int i = 1; i <= 5; i++) {

                    if (i % 3 == 0 && i % 5 == 0) {
                        answer.add("FizzBuzz");
                    }
                    else if (i % 3 == 0) {
                        answer.add("Fizz");
                    }
                    else if (i % 5 == 0) {
                        answer.add("Buzz");
                    }
                    else {
                        answer.add(String.valueOf(i));
                    }
                }

        System.out.println(answer);



    }
}
