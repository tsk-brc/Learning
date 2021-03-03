import java.util.*;

/*
  じゃんけんを行い、結果を出力する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 参加人数
    int people = Integer.parseInt(sc.nextLine());
    // グーを出した人数
    int rockCount = 0;
    // チョキを出した人数
    int scissorsCount = 0;
    // パーを出した人数
    int paperCount = 0;
    // 参加者の手を確認する
    for (int i = 0; i < people; i++) {
      // 出した手の人数を確認し、対象の変数に1を加算する
      String str = sc.nextLine();
      if (str.equals("rock")) {
        rockCount++;
      } else if (str.equals("scissors")) {
        scissorsCount++;
      } else {
        paperCount++;
      }
    }
    // 結果を出力
    if (rockCount > 0 && scissorsCount > 0 && paperCount > 0) {
      System.out.println("draw");
    } else if (rockCount == people || scissorsCount == people || paperCount == people) {
      System.out.println("draw");
    } else if (paperCount == 0) {
      System.out.println("rock");
    } else if (rockCount == 0) {
      System.out.println("scissors");
    } else {
      System.out.println("paper");
    }
  }
}