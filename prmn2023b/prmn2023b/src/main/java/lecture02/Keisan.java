package lecture02;

public class Keisan {
    int x = 0;

    void sum(int[] num){
        for(int j=0 ; j<5 ; j++){
            x += num[j];
        }
        System.out.printf("合計値：%d\n",x);
    }

    void ifwhich(){
        if(x >= 100){
            System.out.println("great!!");
        }
        else if(x >= 50){
            System.out.println("big");
        }
        else{
            System.out.println("small");
        }
    }
}
