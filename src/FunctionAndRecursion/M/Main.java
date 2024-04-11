package FunctionAndRecursion.M;

import java.io.*;

public class Main {

    public static Long dituigongshi(Long n) {
        if (n < 2) return n;
        else {
            return dituigongshi(n / 2) + dituigongshi(n % 2);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        long t = Long.parseLong(reader.readLine());

        while (t-- != 0) {

            Long fn = dituigongshi(Long.parseLong(reader.readLine()));

            printWriter.print(fn + " " + ((1L << fn) - 1));  // 这里表示的 2 ^ fn - 1
            printWriter.println();
        }

        printWriter.flush();   // 缺了就没了

    }

}
