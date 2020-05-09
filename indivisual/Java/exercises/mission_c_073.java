import java.util.*;

/*
  うさぎとかめ。ルールは以下の通り。
  ・うさぎは1kmをu分、という一定の速さで走るが、akm走るごとにb分の休憩を取らなければならない。
  ・かめは1kmをv分、という一定の速さで走り続ける。
  この2匹でLkmの距離を競走するとき、どちらが先にゴールするかを算出する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //走る距離
        int length = Integer.parseInt(sc.next());
        //うさぎの速さ
        int usagi = Integer.parseInt(sc.next());
        //何kmごとに休憩を取るか
        int per = Integer.parseInt(sc.next());
        //休憩時間
        int rest = Integer.parseInt(sc.next());
        //かめの速さ
        int kame = Integer.parseInt(sc.next());

        //うさぎのかかる時間を算出する
        int usagiTime = 0;
        if(length % per == 0){
          usagiTime = usagi * length + ((length / per - 1) * rest);
        } else {
          usagiTime = usagi * length + (length / per * rest);  
        }

        //かめのかかる時間を算出する
	int kameTime = kame * length;

        //どちらが早く着いたかを比較する
        if(usagiTime < kameTime){
          System.out.println("USAGI");
        } else if(usagiTime > kameTime){
          System.out.println("KAME");    
        } else {
          System.out.println("DRAW");
        }
    }
}
