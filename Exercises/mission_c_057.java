import java.util.*;

/*
  シャボン玉がどこまで飛んだか調査する。
  ただし、シャボン玉は地面に接触すると割れてなくなるものとする。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //風が吹く時間
        int TimeNum = Integer.parseInt(sc.next());
        //現在値(X座標)
        int nowX = Integer.parseInt(sc.next());
        //現在値(Y座標)
        int nowY = Integer.parseInt(sc.next());
        //X座標の最大値
        int maxX = nowX;
        //風が吹いている時間ループ
        for(int i = 0; i < TimeNum; i++){
          //風の強さ(X軸方向)
          int x = Integer.parseInt(sc.next());
          //風の強さ(Y軸方向)
          int y = Integer.parseInt(sc.next());
          //地面に接触したかどうか
          if(nowY + y <= 0){
            //X座標が最大かどうか
            if(maxX < nowX + x){
              maxX = nowX + x;
            }
            break;
          } else {
            //X座標が最大かどうか
            if(maxX < nowX + x){
              maxX = nowX + x;
            }
          }
          //現在値の情報
          nowX += x;
          nowY += y;
        }
        System.out.println(maxX);
    }
}
