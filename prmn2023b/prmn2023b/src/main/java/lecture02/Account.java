package lecture02;

public class Account {
    public String[][] student = new String[9][2];
    public int point;

    Account(){          //学籍番号のリストの生成
        String[] gakuseki = new String[]{"B2222300","B2201450","B2220960","B2210980","B2221000","B2200370","B2211100","B1992890","B2222100"};
        for(int i=0 ; i<9 ; i++){
            student[i][0] = gakuseki[i];
        }
    }

    int checknumber(String gakuseki){
        for(int i=0 ; i<5 ; i++){
            if(student[i][0].equals(gakuseki)){
                point = i;
                return point;
            }
        }
        System.out.println("error");        //該当する学籍番号がない場合の処理
        System.exit(0);
        return 0;
    }
}
