import java.util.*;
import java.math.BigDecimal;

/*
  平均点を計算する。
  ただし小数第2位で四捨五入し、小数第1位まで計算すること。 
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 合計点数
    double goukei = 0.0;
    // 人数分ループする
    for (int i = 0; i < 7; i++) {
      String line = sc.next();
      goukei += Integer.parseInt(line);
    }
    // BigDecimalに型変換
    BigDecimal bi = new BigDecimal(String.valueOf(goukei / 7));
    // 小数第2位で四捨五入
    double k0 = bi.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
    System.out.println(k0);
  }
}