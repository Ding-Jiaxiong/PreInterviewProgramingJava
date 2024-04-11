package FunctionAndRecursion.J;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static int M, N, P;    // M是参加游戏的明明的同学数，N是其中始终说谎的人数，P是证言的总数
    static String names[];    // 同学的名字们
    static String testimoneies[];  // 每一句证言
    static String speakers[];  // 每一句证言的发言者
    static String sentences[];  // 每一句证言的句子【除开发言者名字（格式化）】
    static Map<String, Integer> map;    //true: 说谎 false: 诚实的

    /*
    描述今天周几的七个句子
     */
    static String days[] = new String[]{"Today is Monday.", "Today is Tuesday.", "Today is Wednesday.", "Today is Thursday.", "Today is Friday.", "Today is Saturday.", "Today is Sunday."};

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        P = sc.nextInt();

        names = new String[M];
        testimoneies = new String[P];
        speakers = new String[P];
        sentences = new String[P];
        map = new HashMap<>();
        String name;
        String tempString = "";   // 最后的答案【罪犯名字】

        tempString = sc.nextLine(); // 这里接一下, 越界问题
        for (int i = 0; i < M; i++) {
            name = sc.nextLine();
            names[i] = name;
            map.put(name, -1); // 起始map 里面存了M 个 名字和 M 个 -1
        }

        //证词处理
        for (int i = 0; i < P; i++) {
            testimoneies[i] = sc.nextLine();
            speakers[i] = testimoneies[i].split(": ", 2)[0];
            sentences[i] = testimoneies[i].split(": ", 2)[1];

        }

        int count = 0, num = 0, count1 = 0;
        int state = -1;
        boolean flag = true;
        String speaker, name1, criminal, sentence;    //存储证词中提取出来的发言人，日期，罪犯的名字；以及枚举的罪犯的名字
        //循环假设这M个人是罪犯
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            //获取假设的罪犯的名字
            criminal = entry.getKey();
            //循环假设一周七天哪一天是今天【7 种情况都要进行一次推理】
            for (int j = 0; j < 7; j++) {
                count = 0;
                count1 = 0;
                flag = true;
                //1.复制从输入中获取的map
                Map<String, Integer> copyMap = new HashMap<>();
                copyMap.putAll(map);

                //2.循环判断P句证词  【对map 中的每个人当罪犯的情况都进行P 句证词判断】
                day:
                for (int k = 0; k < P; k++) {

                    //1.获取是谁在说话
                    speaker = speakers[k];
                    sentence = sentences[k];

                    //2.说的话是关于日期的
                    for (int m = 0; m < 7; m++) {
                        if (sentence.equals(days[m])) {  // 如果说对了
                            state = (m != j) ? 1 : 0;  // m 和 j对不上就说明这句关于日期的时假话
                            if (state + copyMap.get(speaker) != 1)   // 每个人的state 初始是 -1,
                                copyMap.put(speaker, state);
                            else {
                                flag = false;
                                break day;  // 已经是假话了, 直接
                            }
                        }
                    }

                    //3.说的话关于xxx是/不是罪犯【一共四种情况就，说自己两种 + 说别人两种】
                    if (sentence.toLowerCase().equals("i am guilty.")) {
                        state = (!speaker.equals(criminal)) ? 1 : 0; // 说话人不是罪犯, 但是当前情况假定他是, 这种情况下他说了假话
                        if (state + copyMap.get(speaker) != 1) // 意思是当前这个发言人的发言
                            copyMap.put(speaker, state);
                        else {
                            flag = false;
                            break;
                        }
                    } else if (sentence.toLowerCase().equals("i am not guilty.")) {
                        state = (speaker.equals(criminal)) ? 1 : 0;
                        if (state + copyMap.get(speaker) != 1)
                            copyMap.put(speaker, state);
                        else {
                            flag = false;

                            break;
                        }
                    } else if (sentence.contains(" is ") && sentence.split(" is ", 2)[1].equals("guilty.")) {
                        name1 = sentence.split(" is ", 2)[0];
                        if (copyMap.get(name1) != null) {
                            state = (!name1.equals(criminal)) ? 1 : 0;
                            if (state + copyMap.get(speaker) != 1)
                                copyMap.put(speaker, state);
                            else {
                                flag = false;

                                break;
                            }
                        } else break;
                    } else if (sentence.contains(" is ") && sentence.split(" is ", 2)[1].equals("not guilty.")) {
                        name1 = sentence.split(" is ", 2)[0];
                        if (copyMap.get(name1) != null)
                            state = (name1.equals(criminal)) ? 1 : 0;
                        if (state + copyMap.get(speaker) != 1)
                            copyMap.put(speaker, state);
                        else {
                            flag = false;

                            break;
                        }
                    }

                    //4.说的是废话【直接跳过】
                }

                if (flag) {
                    Iterator<Map.Entry<String, Integer>> it = copyMap.entrySet().iterator();    //遍历名字
                    while (it.hasNext()) {
                        Map.Entry<String, Integer> en = it.next();
                        if (en.getValue() == 1) count++;
                        else if (en.getValue() == -1) count1++;
                    }

                    if (count <= N && count + count1 >= N && (tempString == "" || !tempString.equals(criminal))) { // 判断出这个人是罪犯
                        num++;
                        tempString = criminal;
                    }
                    if (num > 1) break;
                }
            }

        }
        if (num == 0) System.out.println("Impossible");
        else if (num == 1) System.out.println(tempString);
        else System.out.println("Cannot Determine");  // num >=2 的情况
    }
}