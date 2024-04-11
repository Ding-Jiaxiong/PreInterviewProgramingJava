package NowCoder.SelectiveStructure.L;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double chinese = in.nextDouble();
        double math = in.nextDouble();
        double english = in.nextDouble();

        double avg = (chinese + math + english) / 3;

        if (avg < 60) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
