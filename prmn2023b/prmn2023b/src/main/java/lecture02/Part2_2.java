package lecture02;
import java.util.Scanner;

public class Part2_2 {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner input = new Scanner(System.in);
        Keisan keisan = new Keisan();

        for(int i=0 ; i<5 ; i++){
            System.out.printf("数字%dつ目：",i+1);
            num[i] = input.nextInt();
        }
        keisan.sum(num);       //合計値の算出と表示
        keisan.ifwhich();      //合計値が100以上、50以上100未満、50未満かどうか判定
    }
}
