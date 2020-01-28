import java.util.*;

/*
  制動距離を計算する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //重さ
        int m = Integer.parseInt(sc.next());
        //速度
        int v = Integer.parseInt(sc.next());
        //ブレーキの強さ
        int f = Integer.parseInt(sc.next());
        //計算結果を出力
        System.out.println(m * v * v / 2 / f);
    }
}