import java.util.*;

/*
  足りないカードを特定する。
*/
public class Main {
    public static void main(String[] args) {

        // 入力データを受け取る
        Scanner sc = new Scanner(System.in);
        // 足りないカードを特定するための変数(カードが1〜5までなので、総和の15を初期値にセットしておく)
        int unMatchNum = 15;
        // カードの枚数分ループ
        for (int i = 0; i < 4; i++) {
            // 引いたカードの値を減算する
            int num = Integer.parseInt(sc.nextLine());
            unMatchNum -= num;
        }
        System.out.println(unMatchNum);
    }
}