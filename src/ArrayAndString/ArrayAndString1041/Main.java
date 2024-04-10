package ArrayAndString.ArrayAndString1041;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    /*
    判断质数
     */
    public static boolean is_prime(int n) {

        if (n <= 1) {
            return false;
        } else {

            for (int i = 2; i <= Math.sqrt(n); i++) {  // 判断质数不用全部遍历

                if (n % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = reader.readLine();

        char[] chars = string.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : chars) {

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int maxn = Integer.MIN_VALUE;
        int minn = Integer.MAX_VALUE;

        for (Character c : map.keySet()) {

            maxn = Math.max(map.get(c), maxn);
            minn = Math.min(map.get(c), minn);
        }

        if (is_prime(maxn - minn)) {
            System.out.println("Lucky Word");
            System.out.println(maxn - minn);
        } else {
            System.out.println("No Answer");
            System.out.println(0);
        }

    }
}
