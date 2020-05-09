import java.util.*;

/*
  ボールが箱に入るかどうかをチェックする。
  N個の箱があり、半径rのボールがそれぞれの箱に入るかどうかを判定する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 箱の数
    int box = Integer.parseInt(sc.next());
    // ボールの半径
    int r = Integer.parseInt(sc.next());
    for (int i = 0; i < box; i++) {
      // 箱の高さ
      int height = Integer.parseInt(sc.next());
      // 箱の幅
      int weight = Integer.parseInt(sc.next());
      // 箱の奥行き
      int distance = Integer.parseInt(sc.next());
      // 箱にボールが入るかどうかをチェックする
      if (height >= r * 2 && weight >= r * 2 && distance >= r * 2) {
        System.out.println(i + 1);
      }
    }
  }
}
