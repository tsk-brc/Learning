import java.util.*;

/*
  タクシー料金の最安値と最高値を求める。なお、タクシー料金は以下の要領で求める。
  ・タクシーの運賃は初乗り距離、初乗り運賃、加算距離、加算運賃で決まる。
  ・タクシーの乗車距離が初乗り距離未満の場合、初乗り運賃のみで移動することができる。
  ・初乗り距離と同じ距離乗車すると、加算運賃が追加され、以後加算距離を移動する毎に加算運賃が追加される。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //タクシーの台数
        int taxiCount = Integer.parseInt(sc.next());
        //移動距離
        int distance = Integer.parseInt(sc.next());
        int[] needMoney = new int[taxiCount];
        for(int i = 0; i < taxiCount; i++){
         //初乗り距離
         int firstDistance = Integer.parseInt(sc.next());
         //初乗り運賃
         int firstPay = Integer.parseInt(sc.next());
         //加算距離
         int addDistance = Integer.parseInt(sc.next());
         //加算運賃
         int addPay = Integer.parseInt(sc.next());
         //現在までの移動距離
         int totalDistance = firstDistance;
         //現在までの料金
         int totalPay = firstPay;
         //移動距離を超えるまで加算運賃を追加する
         while(distance >= totalDistance){
           totalDistance += addDistance;
           totalPay += addPay;
         }
         needMoney[i] = totalPay;
        }
        //料金を昇順でソートする
        Arrays.sort(needMoney);
        //最安値と最高値を出力する
        System.out.println(needMoney[0] + " " + needMoney[taxiCount - 1]);
    }
}
