import java.util.*;

/*
  テストの合否を判定する。
  合格条件は平均点が合格点以上とする。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ,|\\s");
        //各教科の点数
        int subject1 = Integer.parseInt(sc.next());
        int subject2 = Integer.parseInt(sc.next());
        int subject3 = Integer.parseInt(sc.next());
        int subject4 = Integer.parseInt(sc.next());
        int subject5 = Integer.parseInt(sc.next());
        int subject6 = Integer.parseInt(sc.next());
        int subject7 = Integer.parseInt(sc.next());
        int passScore = Integer.parseInt(sc.next());
        //平均点
        int aveScore = (subject1 + subject2 + subject3 + subject4 + subject5 + subject6 + subject7) / 7;
        //合格かどうか判定
        if(aveScore >= passScore){
          System.out.println("pass");
        } else {
          System.out.println("failure");  
        }
    }
}