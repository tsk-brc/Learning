import java.util.*;

/*
  正六面体の表面積を求める。
*/
public class Main {
    public static void main(String[] args) {

         //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //辺の長さ
        int lengthMeter = Integer.parseInt(sc.nextLine());
        //表面積を出力
        System.out.println(6 * lengthMeter * lengthMeter);
    }
}