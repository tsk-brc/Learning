import java.util.*;

/*
  繰り上がらない足し算を行う。以下の例の通り計算を行う。
  (例)
   95
  +76
  ---
   11
  16
  ---
   61
  
  上記の場合、一の位で5+6を計算して11のところを繰り上がりの計算を行わないため1、
  十の位では9+7を計算し、16なので6となる。よって、計算結果は95+76=61となる。
  ただし、先頭の数が0となった場合でも省略せずに0を出力すること。
*/
public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // 1つ目の数字
    String str1 = sc.next();
    // 2つ目の数字
    String str2 = sc.next();
    // 文字数
    int numLength = 0;
    // 出力する数字の文字列
    StringBuilder sb = new StringBuilder();
    // 文字数を判定
    if (str1.length() > str2.length()) {
      numLength = str1.length();
    } else {
      numLength = str2.length();
    }
    // 文字数分ループ(下1桁目から計算していく)
    for (int i = 0; i < numLength; i++) {
      // 1つ目の数字の計算する桁の値
      int a = 0;
      // 2つ目の数字の計算する桁の値
      int b = 0;
      // 該当の桁数に数字があれば値を上書き
      if (str1.length() > i) {
        a = Integer.parseInt(str1.substring(str1.length() - i - 1, str1.length() - i));
      }
      if (str2.length() > i) {
        b = Integer.parseInt(str2.substring(str2.length() - i - 1, str2.length() - i));
      }
      // 加算
      int num = (a + b) % 10;
      // 結果を追加
      sb.append(Integer.toString(num));
    }
    // 文字列を逆順にする
    sb.reverse();
    // 結果を出力
    System.out.println(sb);
  }
}