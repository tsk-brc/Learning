import java.util.*;

/*
  スピード違反をしているかどうかをチェックする。検出方法は以下の通り。
    ・システムで得られた時刻の差を距離の差で割ることで、カメラ間の区間の平均速度を算出する。
    ・得られた平均速度が制限速度を越えていた場合、スピード違反として検挙する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 観測地点の数
    int target = Integer.parseInt(sc.next());
    // 制限速度
    int limitV = Integer.parseInt(sc.next());
    // 直近の観測データにおける時刻
    int preV = 0;
    // 直近の走行位置
    int preM = 0;
    boolean checkFlg = false;
    // 観測地点の数だけチェックする
    for (int i = 0; i < target; i++) {
      // 観測データにおける時刻
      int m = Integer.parseInt(sc.next());
      // 走行中の位置
      int v = Integer.parseInt(sc.next());
      // 分母が0にならないかチェック
      if (m - preM != 0) {
        // 速さが制限速度を超えているか
        if ((v - preV) / (m - preM) > limitV) {
          checkFlg = true;
        }
      }
      // 今回のデータを前回データにコピーする
      preM = m;
      preV = v;
    }
    // 結果を出力
    if (checkFlg) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}