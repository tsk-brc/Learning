import java.util.*;

/*
  リーグ戦の試合数を求める。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //チーム数
        int num = Integer.parseInt(sc.nextLine());
        //総試合数を求める
        System.out.println(num * (num - 1) /2);
    }
}