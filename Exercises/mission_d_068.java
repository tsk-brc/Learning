import java.util.*;

/*
  晴れの日数と、雨の日数を数える。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //入力データの文字数
        int num = Integer.parseInt(sc.nextLine());
        //入力データ
        String str = sc.nextLine();
        //晴れの日数
        int sCount = 0;
        //雨の日数
        int rCount = 0;
        //文字列によって晴れか雨か判定する
        for(int i = 0; i < num; i++){
          if(str.substring(i, i + 1).equals("S")){
            sCount ++;
          } else {
            rCount ++;
          }
        }
        System.out.println(sCount + " " + rCount);
    }
}