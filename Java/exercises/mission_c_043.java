import java.util.*;

/*
  一番多く出現するプレイヤーIDを割り出す。
  なお、一番多く出現するプレイヤーIDが複数ある場合には昇順で全てを出力すること。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // プレイヤーの出現回数
    int num = Integer.parseInt(sc.next());
    // 各プレイヤーの出現した回数
    int counter = 1;
    // 1プレイヤーが出現した最大の回数
    int maxNum = 0;
    // プレイヤーIDの配列(全量)
    ArrayList<Integer> playerId = new ArrayList<Integer>();
    // プレイヤーIDの配列(最大のみ)
    ArrayList<Integer> maxPlayerId = new ArrayList<Integer>();
    // 出現したプレイヤーIDを配列に格納
    for (int i = 0; i < num; i++) {
      playerId.add(Integer.parseInt(sc.next()));
    }
    // 昇順にソート
    Collections.sort(playerId);
    // キーブレイクで比較
    for (int j = 0; j < num - 1; j++) {
      // 一致したら出現回数を加算
      if (playerId.get(j).equals(playerId.get(j + 1))) {
        counter++;
        // キーブレイク
      } else {
        // 出現回数が最多ならリストを初期化して対象のプレイヤーIDを追加
        if (maxNum < counter) {
          maxNum = counter;
          maxPlayerId.clear();
          maxPlayerId.add(playerId.get(j));
          // 出現回数が最多タイならそのまま追加
        } else if (maxNum == counter) {
          maxPlayerId.add(playerId.get(j));
        }
        // カウンター初期化
        counter = 1;
      }
    }
    // ループを抜けた後に最後のデータに対しても比較
    if (maxNum < counter) {
      maxPlayerId.clear();
      maxPlayerId.add(playerId.get(num - 1));
    } else if (maxNum == counter) {
      maxPlayerId.add(playerId.get(num - 1));
    }
    // 出力する文字列
    StringBuilder sb = new StringBuilder();
    // 結果を出力
    for (int k = 0; k < maxPlayerId.size(); k++) {
      if (k != 0) {
        sb.append(" ");
      }
      sb.append(maxPlayerId.get(k));
    }
    System.out.println(sb);
  }
}