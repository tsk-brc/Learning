import java.util.*;

/*
  税率変更により価格がいくら変化したかを算出する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //税抜価格
        int money = Integer.parseInt(sc.next());
        //旧税率(%)
        int before = Integer.parseInt(sc.next());
        //新税率(%)
        int after = Integer.parseInt(sc.next());
        //価格がいくら変化したか
        int output = (int) (money * (after - before) * 0.01);
        System.out.println(output);
    }
}