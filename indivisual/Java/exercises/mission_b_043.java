import java.util.*;

/*
  ねずみ小僧が町を去った後の状態を調べる。
  ・ある町は碁盤目状になっており、M×Nの大きさをしている。
  ・北方向にM軸、東方向にN軸の正の向きをとり、各グリッドを座標で表す。
  ・各座標には家が1軒建っており、その家は庶民か富豪のいずれかである。
  ・ねずみ小僧は以下のルールに従って町を移動していく。
    ・今いる家が庶民の家ならば、その家を富豪の家にする。その後、90度右に回転して正面に1マス進む。
    ・今いる家が富豪の家ならば、その家を庶民の家にする。その後、90度左に回転して正面に1マス進む。
  ・ねずみ小僧は、町を出るまで移動を繰り返す。ただし、1度訪れた家をねずみ小僧が再び訪れることもある。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 縦の長さ
    int tate = Integer.parseInt(sc.next());
    // 横の長さ
    int yoko = Integer.parseInt(sc.next());
    // 現在地(縦方向)
    int nowTate = Integer.parseInt(sc.next());
    // 現在地(横方向)
    int nowYoko = Integer.parseInt(sc.next());
    // 移動方向(N,E,W,Sのいずれか。初期値はN)
    String hougaku = "N";
    // 町の状態
    String[][] map = new String[tate][yoko];
    // 初期の町状態を二次元配列にセットする
    for (int i = 0; i < tate; i++) {
      String str = sc.next();
      for (int j = 0; j < yoko; j++) {
        map[i][j] = str.substring(j, j + 1);
      }
    }
    // ねずみ小僧移動開始
    while (nowTate > 0 && nowTate <= tate && nowYoko > 0 && nowYoko <= yoko) {
      if (map[nowTate - 1][nowYoko - 1].equals(".")) {
        map[nowTate - 1][nowYoko - 1] = "*";
        if (hougaku.equals("N")) {
          nowYoko += 1;
          hougaku = "E";
        } else if (hougaku.equals("E")) {
          nowTate += 1;
          hougaku = "S";
        } else if (hougaku.equals("W")) {
          nowTate -= 1;
          hougaku = "N";
        } else {
          nowYoko -= 1;
          hougaku = "W";
        }
      } else {
        map[nowTate - 1][nowYoko - 1] = ".";
        if (hougaku.equals("N")) {
          nowYoko -= 1;
          hougaku = "W";
        } else if (hougaku.equals("E")) {
          nowTate -= 1;
          hougaku = "N";
        } else if (hougaku.equals("W")) {
          nowTate += 1;
          hougaku = "S";
        } else {
          nowYoko += 1;
          hougaku = "E";
        }
      }
    }
    // 最終的な町状態を出力する
    for (int x = 0; x < tate; x++) {
      StringBuilder sb = new StringBuilder();
      for (int y = 0; y < yoko; y++) {
        sb.append(map[x][y]);
      }
      System.out.println(sb);
    }
  }
}
