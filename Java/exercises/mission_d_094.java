import java.util.*;

/*
  多数派がどちらかを判定する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 犬派の人数
    int cat = 0;
    // 猫派の人数
    int dog = 0;
    // 3人に調査
    for (int i = 0; i < 3; i++) {
      String str = sc.nextLine();
      if (str.equals("cat")) {
        cat++;
      } else {
        dog++;
      }
    }
    // 多数派を出力
    if (cat >= 2) {
      System.out.println("cat");
    } else {
      System.out.println("dog");
    }
  }
}