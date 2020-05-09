import java.util.*;

/*
  8時間睡眠を取るための就寝時間を計算する。
*/
public class Main {
    public static void main(String[] args) {

        // 入力データを受け取る
        Scanner sc = new Scanner(System.in);
        // 「:」を区切り文字とする
        sc.useDelimiter(":");
        // 起床する「時」
        int targetHour = Integer.parseInt(sc.next());
        // 起床する「分」(あとで結合するため、文字列として受け取る)
        String targetMinute = sc.next();
        // 8時間前の「時」を計算
        if (targetHour - 8 < 0) {
            targetHour = targetHour - 8 + 24;
        } else {
            targetHour -= 8;
        }
        // 就寝時間を出力
        System.out.println(targetHour + ":" + targetMinute);
    }
}