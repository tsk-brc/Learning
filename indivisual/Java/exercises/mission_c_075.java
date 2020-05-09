import java.util.*;

/*
  suicaにチャージされている残高と貯まったポイントを算出する。
    ・電車の運賃支払にsuicaのカード残額を使用すると、運賃の10%がポイントとして貯まる。
    ・改札を出る時に、支払う運賃以上のポイントがある場合は、ポイントが優先的に運賃の支払いに使用される。
      ただし、1ポイントは1円になり、ポイントで運賃を支払った場合、新たなポイントは発生しない。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //suicaの残高
        int pay = Integer.parseInt(sc.next());
        //乗車回数
        int count = Integer.parseInt(sc.next());
        //ポイント
        int point = 0;
        //乗車回数分ループ
        for(int i = 0; i < count; i++){
          //乗車賃
          int cost = Integer.parseInt(sc.next());
          //出力する文字列
          StringBuilder sb = new StringBuilder();
          //乗車賃がポイント以下ならポイントから支払い
          if(point >= cost){
            point -= cost;
          //乗車賃がポイントより大きいならば、残高から支払い10%ポイント還元
          } else {
            pay -= cost;
            point += cost * 0.1;
          }
          //結果を出力
          sb.append(Integer.toString(pay));
          sb.append(" ");
          sb.append(Integer.toString(point));
          System.out.println(sb);
        }
    }
}