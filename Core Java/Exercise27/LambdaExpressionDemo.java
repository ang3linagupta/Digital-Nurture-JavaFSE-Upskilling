package Exercise27;

import java.util.*;

public class LambdaExpressionDemo {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("John","Alice","Bob","David");

        Collections.sort(names,
                (a,b) -> a.compareTo(b));

        System.out.println(names);
    }
}