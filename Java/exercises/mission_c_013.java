import java.util.*;

/*
  自分の住める部屋があるかどうかを判定する。
  判定は自分の嫌いな数字が部屋番号のどの桁にも含まれていな以下どうかで判定する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 嫌いな数字
    String unlikeNum = sc.nextLine();
    // 部屋の数
    int room = Integer.parseInt(sc.nextLine());
    boolean checkFlg = true;
    for (int i = 0; i < room; i++) {
      // 部屋番号
      String target = sc.nextLine();
      // 部屋番号に嫌いな数字が含まれているかどうかをチェックする
      if (!target.contains(unlikeNum)) {
        System.out.println(target);
        checkFlg = false;
      }
    }
    // 住める部屋がない場合はnoneを出力
    if (checkFlg) {
      System.out.println("none");
    }
  }
}
