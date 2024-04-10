package FunctionAndRecursion.B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<LocalDate> getAllDatesInMonth(int year, int month) {
        List<LocalDate> dates = new ArrayList<>();
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate lastDayOfMonth = firstDayOfMonth.withDayOfMonth(firstDayOfMonth.lengthOfMonth());

        // 使用日期范围来填充列表
        for (LocalDate date = firstDayOfMonth; !date.isAfter(lastDayOfMonth); date = date.plusDays(1)) {
            dates.add(date);
        }

        return dates;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {

            int y = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();

            char xchar = String.valueOf(x).charAt(0);

            int ans = 0;

            for (LocalDate localDate : getAllDatesInMonth(y, m)) {

                String date = localDate.toString();

                for (int i = 0; i < date.length(); i++) {

                    if (date.charAt(i) == xchar) {
                        ans++;
                    }
                }

            }

            System.out.println(ans);

        }

    }

}
