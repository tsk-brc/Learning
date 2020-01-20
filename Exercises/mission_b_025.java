import java.util.*;

/*
  うさぎが移動した後の位置を取得する。なお、移動ルールは以下の通り。
  ・N個のしげみが円周上に並んでおり、各しげみには反時計回りに1,2,…,Nの番号がついている。
  ・いくつかのしげみにM羽のうさぎがいる。ただし1つのしげみに2羽以上のうさぎがいてはならない。
  ・それぞれのうさぎは以下のルールに従って今いるしげみから別のしげみへジャンプする。
    ・1番目のうさぎが、今いるしげみから反時計回りに見て最も手前にある空いているしげみにジャンプする
	・……
	・M 番目のうさぎが、今いるしげみから反時計回りに見て最も手前にある空いているしげみにジャンプする
	・上記のジャンプがKセット終わったとき、それぞれのうさぎのいるしげみの位置を出力する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
		//しげみの数
        int leaf = Integer.parseInt(sc.next());
        //うさぎの羽数
		int rabbit = Integer.parseInt(sc.next());
        //ウサギがジャンプする回数
		int jump = Integer.parseInt(sc.next());
        //うさぎの現在地を表す配列
		int[] nowRabbit = new int[rabbit];
        //うさぎの初期位置を取得
		for(int i = 0; i < rabbit; i++){
          int rabbitPlace = Integer.parseInt(sc.next());
          nowRabbit[i] = rabbitPlace;
        }
		//指定回数分ジャンプする
        for(int j = 0; j < jump; j++){
          for(int k = 0; k < rabbit; k++){
            int counter = 1;
            boolean nowRabbitCheck = true;
			//対象のしげみにウサギがいるかどうかをチェックする
            while(nowRabbitCheck){
              for(int l = 0; l < rabbit; l++){
                if(nowRabbit[k] + counter > leaf){
                  //しげみの数を超えたら1に戻る
                  counter = - nowRabbit[k] + 1;
                } 
                if(nowRabbit[k] + counter == nowRabbit[l]){
                  nowRabbitCheck = true;
                  break;
                } else {
                  nowRabbitCheck = false;
                }
              }
              if(!nowRabbitCheck){
                nowRabbit[k] += counter;
              }
              counter++;
            }
          }
        }
		//うさぎの最終的な位置を出力する
        for(int m = 0; m < rabbit; m++){
          System.out.println(nowRabbit[m]);
        }
    }
}