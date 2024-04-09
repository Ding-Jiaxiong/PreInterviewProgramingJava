package ArrayAndString.ArrayAndString1031;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 第一次交: 过了80%
 * <p>
 * 看了别人的代码
 */

public class Main {

    static class Person {

        Integer id;  // 选手报名号  【这里用包装类, 因为只有类才能调用方法】

        Integer grade;  // 选手笔试成绩

        public Person(Integer id, Integer grade) {
            this.id = id;
            this.grade = grade;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();  // 报名参加笔试总人数
        int m = in.nextInt();  // 计划录取人数

        int interviewGrade = (int) Math.floor(m * 1.5);  // 面试分数线排名【向下取整】

        Person[] person = new Person[n];  // 存入

        ArrayList<Person> personArrayList = new ArrayList<>();  // 结果集合

        int suc_cnt = 0;  // 最终进面人数

        for (int i = 0; i < n; i++) {
            person[i] = new Person(in.nextInt(), in.nextInt());
        }

        // 数组排序
        Arrays.sort(person, (person1, person2) -> {

            int grade = person2.grade.compareTo(person1.grade);

            if (grade != 0) {  //
                return grade;
            }

            return person1.id.compareTo(person2.id);
        });

        // 添加结果集合
        for (int i = 0; i < person.length; i++) {

            if (i < interviewGrade) {
                personArrayList.add(person[i]);
                suc_cnt++;

            } else {

                if (person[i].grade == person[i - 1].grade) {
                    personArrayList.add(person[i]);
                    suc_cnt++;
                } else {
                    break;
                }

            }

        }

        System.out.println(personArrayList.get(personArrayList.size() - 1).grade + " " + suc_cnt);

        for (Person p : personArrayList) {
            System.out.printf("%d %d\n", p.id, p.grade);
        }

    }

}
