import java.util.*;

/*
  旅行の日程を決める。
  なお、旅行の日程は各日付の降水確率の平均が最も低くなる日程とし、
  このような日程が複数あった場合には、そのうち最も早いものを対象とする。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 旅行の候補日の日数
    int days = Integer.parseInt(sc.next());
    // 旅行する日数
    int travelDays = Integer.parseInt(sc.next());
    // 日にちの情報
    int[] day = new int[days];
    // 降水確率の情報
    int[] rain = new int[days];
    // 旅行の出発日
    int startDay = 0;
    // 降水確率の最小値
    int minRainyPercent = 3001;
    // 候補日分ループ
    for (int i = 0; i < days; i++) {
      // 日にちと降水確率の情報を配列に格納
      day[i] = Integer.parseInt(sc.next());
      rain[i] = Integer.parseInt(sc.next());
    }
    // 旅行の開始日を選定する
    for (int j = 0; j < days - travelDays + 1; j++) {
      // 旅行の期間の降水確率
      int targetRainyPercent = 0;
      // 旅行の日数分ループ
      for (int k = j; k < travelDays + j; k++) {
        // 各日にちの降水確率を加算
        targetRainyPercent += rain[k];
      }
      // 降水確率の最小値よりも小さければ旅行の候補日とする
      if (targetRainyPercent < minRainyPercent) {
        startDay = day[j];
        minRainyPercent = targetRainyPercent;
      }
    }
    // 結果を出力
    System.out.println(startDay + " " + (startDay + travelDays - 1));
  }
}