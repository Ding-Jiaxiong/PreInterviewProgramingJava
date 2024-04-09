package ArrayAndString.ArrayAndString1032;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 参加评选的学生人数

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            int ch = in.nextInt();
            int ma = in.nextInt();
            int en = in.nextInt();

            students[i] = new Student((i + 1), ch, ma, en);
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {

                int a = s2.total_score - s1.total_score;

                if (a == 0) { // 总分相同

                    int b = s2.chinese - s1.chinese;  // 语文成绩

                    if (b == 0) {
                        return s1.id - s2.id;
                    } else {
                        return s2.chinese - s1.chinese;
                    }

                } else {

                    return s2.total_score - s1.total_score;
                }

            }
        });

        for (int i = 0; i < 5; i++) {
            System.out.println(students[i].id + " " + students[i].total_score);
        }

    }
}

/*
可以写外面
 */

class Student {

    Integer id;  // 类才能调用方法
    Integer chinese;
    Integer math;
    Integer english;
    Integer total_score;

    public Student(Integer id, Integer chinese, Integer math, Integer english) {
        this.id = id;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.total_score = chinese + math + english;
    }
}