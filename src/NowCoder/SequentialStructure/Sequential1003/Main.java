package NowCoder.SequentialStructure.Sequential1003;

public class Main {

    public static void printtwo() {
        for (int i = 0; i < 5; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 2; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printtwelve() {
        for (int i = 0; i < 12; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printblocktwo() {
        for (int i = 0; i < 4; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 0; i < 2; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
    }

    public static void main(String[] args) {

        printtwo();
        printtwo();
        printtwelve();
        printtwelve();
        printblocktwo();
        printblocktwo();


    }

}
