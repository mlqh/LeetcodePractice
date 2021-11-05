package dpcourse.src;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<Integer, Long> memo = new HashMap<>();
        Long fifth = recFib(50, memo);
        System.out.println(fifth);
    }

    public static Long recFib(int n, Map<Integer, Long> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        if (n <= 2) {
            return (long) 1;
        }

        memo.put(n, (recFib(n - 1, memo) + recFib(n - 2, memo)));
        return memo.get(n);

    }

}
