import java.util.*;

/*
  文字列に含まれる「A」の数を求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // Aの数
    int count = 0;
    // 1文字ずつ分解して比較
    for (int i = 0; i < str.length(); i++) {
      if (str.substring(i, i + 1).equals("A")) {
        count++;
      }
    }
    System.out.println(count);
  }
}