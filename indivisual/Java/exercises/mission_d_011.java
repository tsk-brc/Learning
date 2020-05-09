import java.util.*;

/*
  アルファベットで何番目か判定する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // char型に型変換
    char c = str.charAt(0);
    // Aからの差分で何番目かを判定する
    System.out.println(c - 'A' + 1);
  }
}