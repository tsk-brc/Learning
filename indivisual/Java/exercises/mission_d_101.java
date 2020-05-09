import java.util.*;

/*
  偶数と奇数の両方が入っているか判定する。
*/
public class Main {
    public static void main(String[] args) {

        // 入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        String str = sc.next();
        // 値1を2で割った時のあまり
        int mod1 = Integer.parseInt(str) % 2;
        str = sc.next();
        // 値2を2で割った時のあまり
        int mod2 = Integer.parseInt(str) % 2;
        // 偶数と奇数の両方が入っているか
        if (mod1 != mod2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}