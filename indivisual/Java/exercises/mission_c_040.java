import java.util.*;

/*
  身長を比べて判断する。
  自分の身長がわからない人1人と自分の身長がわかっている人N人がいる。
  身長がわからない人の身長を測るため、わかっている人それぞれと身長を比較し、どれくらいの高さかを求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 身長の下限
    double minHeight = 0.0;
    // 身長の上限
    double maxHeight = 200.0;
    // 手伝ってくれる人数
    int person = Integer.parseInt(sc.next());
    // 各人について調査する
    for (int i = 0; i < person; i++) {
      // 対象の人より大きいか小さいかを表す記号
      String str = sc.next();
      // 対象の人の身長
      double height = Double.parseDouble(sc.next());
      // 「le」ならば上限に、「ge」ならば下限に設定
      if (str.equals("le")) {
        if (height < maxHeight) {
          maxHeight = height;
        }
      } else {
        if (minHeight < height) {
          minHeight = height;
        }
      }
    }
    System.out.println(minHeight + " " + maxHeight);
  }
}
