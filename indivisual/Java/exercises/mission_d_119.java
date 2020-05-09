import java.util.*;
import java.math.*;

/*
  円周率を小数点第N位(1≦N≦15)まで出力する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //円周率
        double pai = 3.141592653589793;
        //BigDecimalに型変換
        BigDecimal bd = new BigDecimal(pai);
        //何桁目まで表示するか
        int num = Integer.parseInt(sc.nextLine());
        //指定の桁数以下を切り捨て
        bd = bd.setScale(num,BigDecimal.ROUND_DOWN);
        //結果を表示
        System.out.println(bd);
    }
}