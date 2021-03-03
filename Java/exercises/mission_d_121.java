import java.util.*;

/*
  仮の元号を新元号に置き換える。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // 元号付き年度
    String str1 = sc.nextLine();
    // 仮の元号を新元号に置換
    String str2 = str1.replace("A", "R");
    System.out.println(str2);
  }
}