package NowCoder.ArrayAndString.ArrayAndString1028;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static class Time implements Comparable<Time> {

        private int hour;
        private int minute;
        private int second;

        public Time(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public int getHour() {
            return hour;
        }

        public int getMinute() {
            return minute;
        }

        public int getSecond() {
            return second;
        }

        @Override
        public int compareTo(Time other) {
            if (this.hour != other.hour) {
                return this.hour - other.hour;
            } else if (this.minute != other.minute) {
                return this.minute - other.minute;
            } else {
                return this.second - other.second;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        ArrayList<Time> times = new ArrayList<>();

        for (int i = 0; i < n; i++) { // n 个时间

            String[] s = reader.readLine().split(" ");

            Time time = new Time(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]));

            times.add(time);
        }

        Collections.sort(times);

        for (Time time : times) {

            System.out.printf("%d %d %d\n", time.getHour(), time.getMinute(), time.getSecond());

        }

    }

}
