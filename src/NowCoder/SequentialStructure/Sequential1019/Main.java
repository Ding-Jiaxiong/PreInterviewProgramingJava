package NowCoder.SequentialStructure.Sequential1019;

public class Main {

    public static void main(String[] args) {

        String str = "hello world";

        for (int i = 0; i < str.length(); i++) {

            char tmp = str.charAt(i);
            int value = Integer.valueOf(tmp);

            System.out.print((char) (value + 1));

        }

    }

}
