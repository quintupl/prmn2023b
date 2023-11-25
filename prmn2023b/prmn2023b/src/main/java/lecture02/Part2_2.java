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
        keisan.sum(num);
        keisan.ifwhich();
    }
}
