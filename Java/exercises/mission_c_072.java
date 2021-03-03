import java.util.*;

/*
  進化条件を満たすモンスターを取得する。進化条件は以下の要領で決まる。
  ・あるモンスターに進化するには攻撃力が最低攻撃力以上最大攻撃力以下である必要がある。
　・あるモンスターに進化するには防御力が最低防御力以上最大防御力以下である必要がある。
　・あるモンスターに進化するには素早さが最低素早さ以上最大素早さ以下である必要がある。
*/
public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // 現在の攻撃力
    int atk = Integer.parseInt(sc.next());
    // 現在の防御力
    int def = Integer.parseInt(sc.next());
    // 現在の素早さ
    int agi = Integer.parseInt(sc.next());
    // 進化先候補のモンスター数
    int num = Integer.parseInt(sc.next());
    // 出力するモンスター名を格納する配列
    String[] name = new String[num];
    // 進化先候補のモンスターの進化条件を格納する配列
    String[][] str = new String[num][7];
    // モンスターの進化条件を格納
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < 7; j++) {
        str[i][j] = sc.next();
      }
    }
    // スキルチェック
    int data = 0;
    for (int k = 0; k < num; k++) {
      if (atk >= Integer.parseInt(str[k][1]) && atk <= Integer.parseInt(str[k][2]) && def >= Integer.parseInt(str[k][3])
          && def <= Integer.parseInt(str[k][4]) && agi >= Integer.parseInt(str[k][5])
          && agi <= Integer.parseInt(str[k][6])) {
        name[data] = str[k][0];
        data++;
      }
    }

    // データ出力
    if (data == 0) {
      System.out.println("no evolution");
    } else {
      for (int x = 0; x < data; x++) {
        System.out.println(name[x]);
      }
    }
  }
}