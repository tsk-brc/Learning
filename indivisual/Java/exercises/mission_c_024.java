import java.util.*;

/*
  演算するコンピュータを作成する。演算ルールは以下の通り。
    ・コンピュータは2つの変数を持っており、どちらの変数も0で初期化されている。
    ・コンピュータは以下の3種類の命令を実行することができる。
    ・SET i a ：変数iに値aを代入する。
    ・ADD a ：変数1の値にaを加算し、計算結果を変数2に代入する。
    ・SUB a ：変数1の値にaを減算し、計算結果を変数2に代入する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 命令の個数
    int count = Integer.parseInt(sc.nextLine());
    // 変数1
    int a = 0;
    // 変数2
    int b = 0;
    // 命令分処理をする
    for (int i = 0; i < count; i++) {
      // 命令を受け取る
      String action = sc.next();
      // 命令によって処理を分岐する
      if (action.equals("SET")) {
        // 対象となる変数
        int target = Integer.parseInt(sc.next());
        // 代入する値
        int num1 = Integer.parseInt(sc.next());
        if (target == 1) {
          a = num1;
        } else {
          b = num1;
        }
      } else if (action.equals("ADD")) {
        // 加算する値
        int num2 = Integer.parseInt(sc.next());
        // 計算結果を変数2に代入
        b = a + num2;
      } else {
        // 減算する値
        int num3 = Integer.parseInt(sc.next());
        // 計算結果を変数2に代入
        b = a - num3;
      }
    }
    // 結果を出力
    System.out.println(a + " " + b);
  }
}