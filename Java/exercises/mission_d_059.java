import java.util.*;

/*
  トランプゲームでイカサマをする。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // カード1枚目
    String str1 = sc.next();
    // カード2枚目
    String str2 = sc.next();
    // 両方「J」なら片方を「Q」に変更する
    if (str1.equals("J") && str2.equals("J")) {
      System.out.println("J Q");
    } else {
      System.out.println(str1 + " " + str2);
    }
  }
}