import java.util.*;

/*
  グレースケールの画像を二値画像に変換する。
  グレースケールの画像は0から255の256階調で画像を表現する。
  以下の条件で二値画像に変換する。
    ・画素値が128以上：1
    ・画素値が127以下：0 
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 縦のサイズ
    int tate = Integer.parseInt(sc.next());
    // 横のサイズ
    int yoko = Integer.parseInt(sc.next());
    // グレースケールを格納する配列
    int[][] colorNum = new int[tate][yoko];
    // 全画面で判定する
    for (int i = 0; i < tate; i++) {
      for (int j = 0; j < yoko; j++) {
        // グレースケールを取得
        int targetNum = Integer.parseInt(sc.next());
        // 画素値で判定する
        if (targetNum >= 128) {
          colorNum[i][j] = 1;
        } else {
          colorNum[i][j] = 0;
        }
      }
    }
    // 1列ごとに結合し、出力する
    for (int k = 0; k < tate; k++) {
      StringBuilder sb = new StringBuilder();
      for (int l = 0; l < yoko; l++) {
        sb.append(colorNum[k][l]);
        if (yoko - l > 1) {
          sb.append(" ");
        }
      }
      System.out.println(sb);
    }
  }
}