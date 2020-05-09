import java.util.*;

/*
  合格した生徒を判定する。生徒の点数は以下のルールで算出する。
    ・学生の成績はテストの点数から欠席回数×5点を引いた点数とする。
    ・成績がマイナスとなった場合は0とする。
  
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ,|\\s");
        //学生の数
        int person = Integer.parseInt(sc.next());
        //合格点
        int passPoint = Integer.parseInt(sc.next());
        //生徒ごとに合格か否か判定する
        for (int i = 0; i < person;i++){
            //生徒の点
            int score = 0;
            //テストの点数
            int point = Integer.parseInt(sc.next());
            //欠席数
            int absent = Integer.parseInt(sc.next());
            //点数を求める(負の数になったら0とする)
            if((point - absent * 5) >= 0){
              score = point - absent * 5;
            } else {
              score = 0;
            }
            //合格点に達しているか判定
            if(score >= passPoint){
                System.out.println(i + 1);
            }
        }
    }
}