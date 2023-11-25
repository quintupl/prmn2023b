package lecture02;

public class Gakuseki {
    String number = "B2001000";

    void ifcomp(String gakuseki){
        if(number.equals(gakuseki)){
            System.out.println("complete!!");
        }
        else{
            System.out.println("error!!");
        }
    }
}
