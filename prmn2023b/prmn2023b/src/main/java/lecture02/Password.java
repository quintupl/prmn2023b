package lecture02;

public class Password {
    String[][] student;
    Password(String[][] student){
        this.student = student;
        String[] password = new String[]{"psvm","awsd","5963","q4h8","a7j6","0kj7","bn9h","fg47","v81e"};
        for(int i=0 ; i<9 ; i++){
            student[i][1] = password[i];
        }
    }
    void checkpass(String pass,int point){
        if(student[point][1].equals(pass)){
            System.out.println("ログイン完了");
        }
        else{
            System.out.println("不正なログイン");
            System.exit(0);
        }
    }
}
