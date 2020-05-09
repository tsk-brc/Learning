import java.util.*;

/*
  カードゲームを行う。なお、ルールは以下の通り。
  ・カードを2枚配布する。
  ・1枚目には1から10の整数、2枚目には1から4の整数書かれている。
  ・2枚のカードの強弱関係は、以下のルールで決める。
    ・1枚目の番号が大きいカードのほうが強い。
    ・1枚目の番号が同じ場合、2つ目の番号が小さいカードのほうが強い。
  なお、2枚の組み合わせが同じになることはない。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 親のカード1枚目
    int oyaCard1 = Integer.parseInt(sc.next());
    // 親のカード2枚目
    int oyaCard2 = Integer.parseInt(sc.next());
    // プレイヤー数
    int player = Integer.parseInt(sc.next());
    for (int i = 0; i < player; i++) {
      // 子のカード1枚目
      int koCard1 = Integer.parseInt(sc.next());
      // 子のカード2枚目
      int koCard2 = Integer.parseInt(sc.next());
      // 結果判定
      if (oyaCard1 > koCard1) {
        System.out.println("High");
      } else if (oyaCard1 < koCard1) {
        System.out.println("Low");
      } else {
        if (oyaCard2 > koCard2) {
          System.out.println("Low");
        } else {
          System.out.println("High");
        }
      }
    }
  }
}
