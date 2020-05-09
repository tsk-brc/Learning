import java.util.*;

/*
  ゲームプレイヤーはスタミナのポイントNを所持しており、1プレイあたりMポイントを消費する。
  何回プレイ出来るかを出力する
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //スタミナのポイント
        int num1 = Integer.parseInt(sc.next());
        //消費ポイント
        int num2 = Integer.parseInt(sc.next());
        System.out.println(num1 / num2);
    }
}