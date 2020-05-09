import java.util.*;

/*
  電車の発車間隔を求める
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 1本前の発車時間(分)
    String str1 = sc.nextLine();
    // 残り4本分の時間を取得
    for (int i = 0; i < 4; i++) {
      // 直近の発車時間(分)
      String str2 = sc.nextLine();
      // 差分を求める
      System.out.println(Integer.parseInt(str2) - Integer.parseInt(str1));
      // 直近の時間を1本前にコピー
      str1 = str2;
    }
  }
}