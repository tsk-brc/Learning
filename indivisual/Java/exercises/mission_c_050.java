import java.util.*;

/*
  自動取引プログラムによるオークションの結果を求める。
  AさんとBさんが自動取引プログラムを使用してオークションに参加する。プログラムは以下の通り。
    ・Aさんの作成した自動取引プログラムは今の商品の価格に 10円を足した価格で交渉する。
    ・Bさんの作成した自動取引プログラムは今の商品の価格に 1,000円を足した価格で交渉する。
    ・どちらの自動取引プログラムも予算を超える価格で交渉をしようとすると停止する。
  落札した人及び落札価格を求め、出力する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //商品の最初の値段
        int price = Integer.parseInt(sc.next());
        //Aさんの予算
        int Amoney = Integer.parseInt(sc.next());
        //Bさんの予算
        int Bmoney = Integer.parseInt(sc.next());
        //処理が継続できるか
        boolean checkFlg = true;
        //プログラムが動いた回数
        int turn = 1;
        while(checkFlg){
          //奇数回目はAさんのプログラムを作動
          if(turn % 2 == 1){
            if(Amoney >= price + 10){
              price += 10;
            } else {
              checkFlg = false;
            }
          //偶数回目はBさんのプログラムを作動
          } else {
            if(Bmoney >= price + 1000){
              price += 1000;
            } else {
              checkFlg = false;
            }
          }
          turn ++;
        }
        //落札した人と落札価格を出力
        if(turn % 2 == 1){
          System.out.println("A " + price);
        } else {
          System.out.println("B " + price);
        }
    }
}
