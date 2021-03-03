import java.util.*;

/*
  お菓子のあまりを算出する。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" ,|\\s");
    // お菓子を分ける人数
    int person = Integer.parseInt(sc.next());
    // お菓子の箱の縦の長さ
    int tate = Integer.parseInt(sc.next());
    // お菓子の箱の横の長さ
    int yoko = Integer.parseInt(sc.next());
    // あまりを算出
    System.out.println((tate * yoko) % person);
  }
}