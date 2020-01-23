import java.util.*;

/*
  画面を描画するための画素数を求める。ルールは以下の通り。
    ・あるゲームでは主人公の移動に応じて、 画面を左下原点でスクロールさせる。
    ・一度に背景の全ての要素を描画すると処理が追いつかなくなるため、
	  スクロールする際に、前回の背景の描画結果をコピーし、前回の背景に無い画素のみを描画する。
  必要な画素数を求め結果を出力する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //縦方向の解像度
        int x = Integer.parseInt(sc.next());
        //横方向の解像度
        int y = Integer.parseInt(sc.next());
        //y軸方向にスクロールする距離
        int dy = Integer.parseInt(sc.next());
        //x軸方向にスクロールする距離
        int dx = Integer.parseInt(sc.next());
        //移動距離を求める(-方向に動いても距離としては正の値なので、正の値として考える)
        if(dx < 0){
          dx *= -1;
        }
        if(dy < 0){
          dy *= -1;
        }
        //必要な画素数を求める
        System.out.println((x * dx) + (y * dy) - (dx * dy));
    }
}