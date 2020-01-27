import java.util.*;

/*
  平均を計算する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //平均の元となる数の個数
        int num = Integer.parseInt(sc.nextLine());
        //合計値
        int total = 0;
        //各数を加算
        for(int i = 0; i < num; i++){
          total += Integer.parseInt(sc.nextLine()); 
        }
        //平均を算出
        System.out.println(total / num);
    }
}