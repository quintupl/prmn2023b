package lecture02;
import java.util.Scanner;

public class Part2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Gakuseki gaku = new Gakuseki();

        System.out.print("学籍番号を入力してください。:");
        String gakuseki = input.next();
        gaku.ifcomp(gakuseki);

    }
}
