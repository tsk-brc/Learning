import java.util.*;

/*
  深夜帯の時間表記を正しい時間表記に変換する。
  深夜の時間を「01/27 24:30」のように表記することがあるので、これを「01/28 00:30」のように変換する。
  ただし、「時」を修正した結果、「日」がその月に存在しない日になった場合でも「月」を調整することなくそのまま出力すること。
  ※入力データにも「02/31 50:59」のような存在しない日付が使用される。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //日付データを文字列として受け取る
        String str = sc.nextLine();
        //「日」にあたる部分を抜き出す
        int days = Integer.parseInt(str.substring(3,5));
        //「時」にあたる部分を抜き出す
        int hours = Integer.parseInt(str.substring(6,8));
        //結合した文字列を格納する変数
        StringBuilder sb = new StringBuilder();
        //時間が23時以下になるまで処理を繰り返す
        while(hours >= 24){
          days ++;
          hours -= 24;
        }
        //文字列をそれぞれ結合する
        sb.append(str.substring(0,3));
        sb.append(String.format("%02d",days));
        sb.append(str.substring(5,6));
        sb.append(String.format("%02d", hours));
        sb.append(str.substring(8,11));
        System.out.println(sb);
    }
}
