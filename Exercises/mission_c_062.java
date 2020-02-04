import java.util.*;

/*
  回転寿司でメロンを食べた枚数を計算する。
  ただし、メロンを食べきるのに、自分の前に10皿流れていく程度の時間がかかり、
  メロンを食べている最中は新たにメロンを取ることができない。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //皿の枚数
        int num = Integer.parseInt(sc.nextLine());
        //メロンをGET出来る状態かどうか
        boolean melonGetFlg = true;
        //メロンを取った数
        int getDishCount = 0;
        //何枚お皿が通過したか
        int turn = 0;
        //枚数分ループ
        for(int i = 0; i < num; i++){
          //流れてきた品目
          String dish = sc.nextLine();
          //流れてきたのがメロンかつ受け取れる状態かどうか
          if(dish.equals("melon") && melonGetFlg){
            //受け取った枚数を加算
            getDishCount ++;
            //受け取れない状態にステータスを変更
            melonGetFlg = false;
          //受け取れない状態なら通過した枚数を加算
          } else if(!melonGetFlg){
            turn ++;
          }
          //10枚通り過ぎたら受け取れる状態に変更
          if(turn == 10){
            melonGetFlg = true;
            turn = 0;
          }
        }
        //結果を出力
        System.out.println(getDishCount);
    }
}