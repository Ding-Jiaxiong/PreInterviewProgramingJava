package NowCoder.FunctionAndRecursion.K;

import java.util.Scanner;

/*
格林公式
 */

public class Main {

    public static double calArea(double[] x, double[] y) {

        int n = x.length;
        double area = 0.0;

        for (int i = 0; i < n; i++) {

            int j = (i + 1) % n;
            area += x[i] * y[j] - x[j] * y[i];
        }

        area = Math.abs(area) / 2.0;

        return area;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        double[] x = new double[n];  // x 坐标
        double[] y = new double[n];  // y 坐标

        for (int i = 0; i < n; i++) {

            x[i] = in.nextDouble();
            y[i] = in.nextDouble();
        }

        System.out.printf("%d", (int) Math.round(calArea(x, y)));

    }

}
