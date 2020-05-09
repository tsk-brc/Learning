import java.util.*;

/*
  「〇〇の秋」の〇〇部分を取り出す。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // "noaki"(の秋)と書いてあったらその部分を取り除く
    if (str.substring(str.length() - 5, str.length()).equals("noaki")) {
      System.out.println(str.substring(0, str.length() - 5));
    } else {
      System.out.println(str);
    }
  }
}