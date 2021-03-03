import java.util.*;

/*
  カードゲームを行う。ルールは以下の通り。
    ・カードは1～100の数字が書かれた「点数カード」、
      0の数字が書かれた「点数0カード」、
      "x10"と書かれた「点数10倍カード」の3種類を使用する。
    ・スコアは以下のように計算する。
      ・「点数0カード」がある場合、点数カードの中で最大の点を持つカードを0点にする。
      ・「点数カード」の合計点を計算する。
      ・「点数10倍カード」がある場合、スコアは上記の合計点の10倍とする。
      ・「点数10倍カード」がない場合、スコアは上記の合計点とする。
    ・「点数0カード」および「点数10倍カード」は配られるカードの中に2つ以上存在しない。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 配られるカードの枚数
    int num = Integer.parseInt(sc.next());
    // 配られるカードの種類
    String[] card = new String[num];
    // 「0」カードがあったかどうか
    boolean zeroCardFlg = false;
    // 「x10」カードがあったかどうか
    boolean tenthCardFlg = false;
    // スコア
    int score = 0;
    // 配られたカードの最大値
    int maxNum = 0;
    // 配られるカードの枚数分ループ
    for (int i = 0; i < num; i++) {
      // 配られたカードを文字列として配列に格納
      card[i] = sc.next();
      // 配られたカードが「0」かどうか
      if (card[i].equals("0")) {
        zeroCardFlg = true;
        // 配られたカードが「x10」かどうか
      } else if (card[i].equals("x10")) {
        tenthCardFlg = true;
      }
    }
    // 配られたカードの枚数分ループ
    for (int j = 0; j < num; j++) {
      // 「x10」カードでなければ数値型に変換してスコアに加算
      if (!card[j].equals("x10")) {
        score += Integer.parseInt(card[j]);
        // 配られたカードの中で最大値かどうか
        if (maxNum < Integer.parseInt(card[j])) {
          maxNum = Integer.parseInt(card[j]);
        }
      }
    }
    // 配られたカードに「0」があれば最大値を減算
    if (zeroCardFlg) {
      score -= maxNum;
    }
    // 配られたカードに「x10」があればスコアを10倍にする
    if (tenthCardFlg) {
      score *= 10;
    }
    // 結果を出力
    System.out.println(score);
  }
}