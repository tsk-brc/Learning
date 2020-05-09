import java.util.*;

/*
  日付がゾロ目か判定する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ,|\\s");
        //月
        String str1 = sc.next();
        //日
        String str2 = sc.next();
        //月日をつなげた文字列
        StringBuilder sb = new StringBuilder();
        //判定結果
        Boolean checkFlg = true;
        //月と日を結合
        sb.append(str1);
        sb.append(str2);
        //文字数分ループ
        for(int i = 1; i < sb.length(); i++){
          //N文字目とN+1文字目が同じか
          if(!sb.substring(i-1,i).equals(sb.substring(i,i+1))){
            checkFlg =false;
            break;
          }
        }
        //結果を出力
        if(checkFlg){
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
}