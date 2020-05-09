import java.util.*;

/*
  参拝を行う。
*/
public class Main {
    public static void main(String[] args) {

        // 入力データを受け取る
        Scanner sc = new Scanner(System.in);
        // 1回目の礼の数
        int rei1 = Integer.parseInt(sc.next());
        // 拍手の礼の数
        int hakushu = Integer.parseInt(sc.next());
        // 2回目の礼の数
        int rei2 = Integer.parseInt(sc.next());
        // 出力する文字列を結合するための変数
        StringBuilder sb = new StringBuilder();
        // 礼と拍手の数、文字を追加する(礼:A,拍手:B)
        for (int i = 0; i < rei1; i++) {
            sb.append("A");
        }
        for (int j = 0; j < hakushu; j++) {
            sb.append("B");
        }
        for (int k = 0; k < rei2; k++) {
            sb.append("A");
        }
        System.out.println(sb);
    }
}