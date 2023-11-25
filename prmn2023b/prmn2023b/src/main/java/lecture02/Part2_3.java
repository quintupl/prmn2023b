package lecture02;
import java.util.Scanner;

public class Part2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account();
        Password password = new Password(account.student);

        System.out.print("学籍番号を入力：");
        String gakuseki = input.next();
        int point = account.checknumber(gakuseki);      //所持している学籍番号と入力番号が一致するかどうか判定

        System.out.print("パスワードを入力：");
        String pass = input.next();
        password.checkpass(pass,point);                 //所持している学籍番号に紐づいたパスワードを一致するかどうかの判定
    }
}
