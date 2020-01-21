import java.util.*;
import java.math.BigDecimal;

/*
  ゲームのユーザーランキングを作成する。なお、スコアの算出は以下の通り。
  ・アイテムの種類がM個あり、アイテムは種類ごとに得点が異なる。
  ・各アイテムには種別毎に1個あたりCi点が設定されている。
  ・ユーザーはそれぞれのアイテムをXi個持っている。
  ・ユーザーのスコアは、各アイテム持ち数×各アイテムの得点の総和で算出する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
		//アイテムの個数
        int items = Integer.parseInt(sc.next());
        //プレイヤー数
		int player = Integer.parseInt(sc.next());
        //出力対象になるランキング
		int rank = Integer.parseInt(sc.next());
        //各アイテムのポイントを格納する配列
		double[] itemsPoint = new double[items];
		//各ユーザーのスコアを格納する配列
        int[] playerPoint = new int[player];
		//アイテムのポイントを配列に格納
        for(int i =0; i< items; i++){
          itemsPoint[i] = Double.parseDouble(sc.next());
        }
		//各ユーザーのスコアを計算し、配列に格納
        for(int j = 0; j < player; j++){
          double point = 0.0;
          for(int k = 0; k < items; k++){
              point += itemsPoint[k] * Integer.parseInt(sc.next());
          }
          BigDecimal bd = new BigDecimal(point);
		  //小数点以下を四捨五入
          BigDecimal bd1 = bd.setScale(0, BigDecimal.ROUND_HALF_UP); 
          playerPoint[j] = bd1.intValue();
        }
		//スコアを昇順にソート
        Arrays.sort(playerPoint);
        //出力対象以内のランキングのスコアを出力
		for(int l = player - 1; l > player - rank - 1; l--){
          System.out.println(playerPoint[l]);
        }
    }
}