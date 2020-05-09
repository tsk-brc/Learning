import java.util.*;

/*
  1からnまでの総和を求める。
*/
public class Main {
    public static void main(String[] args) {

        // 入力データを受け取る
        Scanner sc = new Scanner(System.in);
        // 数列の最後の値(n)
        int num = Integer.parseInt(sc.nextLine());
        // 総和
        int total = 0;
        // 1からnまで合計する
        for (int i = 0; i <= num; i++) {
            total += i;
        }
        System.out.println(total);
    }
}