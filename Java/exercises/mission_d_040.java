import java.util.*;

/*
  1週間のうち、何日外出できるか求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 外出日
    int outDay = 0;
    // 1週間分ループ
    for (int i = 0; i < 7; i++) {
      // 降水確率
      int num = Integer.parseInt(sc.nextLine());
      // 降水確率が30%以下なら外出可
      if (num <= 30) {
        outDay++;
      }
    }
    System.out.println(outDay);
  }
}