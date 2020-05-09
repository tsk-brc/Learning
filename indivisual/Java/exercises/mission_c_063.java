import java.util.*;

/*
  ガーデニングを行った時に、いつ最も多くの花が咲くのかを求める。
  M種類の花の種を購入し、花は、種を蒔いてからN日後に花を咲かせ、N+1日後に枯れるとする。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //花の種類数
        int seed = Integer.parseInt(sc.next());
        //各花が何日後に咲くか
        int[] output = new int[seed];
        //最大の花の咲く数
        int maxFlower = 0;
        //最大の花が咲く日にち
        int maxFlowerDay = 0;
        //種の数だけループ
        for(int i = 0; i < seed; i++){
          //花を咲かせるまでの日数
          int flowerDay = Integer.parseInt(sc.next());
          //種をまく日
          int seedDay = Integer.parseInt(sc.next());
          //花を咲かせる日
          output[i] = flowerDay + seedDay;
        }
        //日にち昇順にソート
        Arrays.sort(output);
        //種の数だけループ
        for(int j = 0; j < seed; j++){
          //出力対象の日付
          int targetDay = output[j];
          //1日で咲く最大の花の数(デフォルトは1)
          int targetNum = 1;
          //ループするかどうかチェックするフラグ
          boolean checkFlg =true;
          while(checkFlg){
            //キーブレイク
            if(j + 1 < seed && targetDay == output[j + 1]){
              targetNum++;
              j++;
            } else {
              checkFlg = false;
            }
          }
          //最大の数かどうか
          if(maxFlower < targetNum){
            maxFlowerDay = targetDay;
            maxFlower = targetNum;
          }
        }
        //結果を出力
        System.out.println(maxFlowerDay);
    }
}