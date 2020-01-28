import java.util.*;

/*
  外出できる日数を計算する。
  外出できる日は大雪警戒レベルが2以下の日のみとする。
*/
public class Main {
    public static void main(String[] args) {
        
        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ,|\\s");
        //外出可能日数
        int goOut = 0;
        //10日間分ループ
        for(int i = 0; i < 10; i++){
          //大雪警戒レベル
          Integer num = Integer.parseInt(sc.next()); 
          //外出できるか判定
          if(num <= 2){
            goOut ++;
          }
        }
        System.out.println(goOut);
    }
}