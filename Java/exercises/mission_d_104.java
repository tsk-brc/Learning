import java.util.*;

/*
  配送料金を計算する。なお、配送料金は以下のルールで決定する。
    ・10kg未満であれば一律1000円
    ・10kg以上であれば1kgあたり150円
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 配送物の重さ(kg)
    int num = Integer.parseInt(sc.nextLine());
    // 料金を算出
    if (num < 10) {
      System.out.println(1000);
    } else {
      System.out.println(num * 150);
    }
  }
}