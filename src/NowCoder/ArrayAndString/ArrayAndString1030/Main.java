package NowCoder.ArrayAndString.ArrayAndString1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static class Point implements Comparable<Point> {
        private long x;
        private long y;
        private long dis;

        public Point(long x, long y, long dis) {
            this.x = x;
            this.y = y;
            this.dis = dis;
        }

        @Override
        public int compareTo(Point o) {

            // 这里要写完, 因为dis 是long

            if (this.dis > o.dis) return 1;
            else if (this.dis < o.dis) return -1;
            else return 0;

        }

        @Override
        public String toString() {
            return x + " " + y + " " + dis;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        ArrayList<Point> points = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] s = reader.readLine().split(" ");

            long x = Long.parseLong(s[0]);
            long y = Long.parseLong(s[1]);

            long dis = (long) (x * x + y * y);

            points.add(new Point(x, y, dis));
        }

        Collections.sort(points);

        for (Point point : points) {
            System.out.println(point);
        }

    }

}
