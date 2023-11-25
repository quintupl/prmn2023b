package lecture02;

import java.util.Scanner;

public class Part3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("名前：");
        String name = input.next();
        System.out.print("学籍番号：B");
        int number = input.nextInt();
        System.out.println();

        System.out.printf("氏名：%s \n学籍番号：B%d",name,number);
    }
}
