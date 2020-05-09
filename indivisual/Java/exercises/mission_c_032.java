import java.util.*;

/*
  ポイントカードにたまったポイントを計算する。なお、ポイント付与基準は以下の通り。
    ・食料品：100円毎に5ポイント
    ・書籍：100円毎に3ポイント
    ・衣類：100円毎に2ポイント
    ・その他：100円毎に1ポイント
*/
public class Main {
    public static void main(String[] args) {
        
        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //購入した商品の数
        int num = Integer.parseInt(sc.next());
        //食料品の購入金額
        int food = 0;
        //食品の購入金額
        int book = 0;
        //衣服の購入金額
        int clothes = 0;
        //その他の購入金額
        int others = 0;
        //購入した全ての品をチェック
        for(int i = 0; i < num; i++){
          //商品の種類
          int target = Integer.parseInt(sc.next());
          //商品の金額
          int money = Integer.parseInt(sc.next());
          //対象の種類の金額を加算
          if(target == 0){
            food+= money; 
          } else if(target == 1){
            book += money;
          } else if(target == 2){
            clothes += money;
          } else {
            others += money;
          }
        }
        //ポイントを計算
        double output = (food - (food % 100)) * 0.05 + (book - (book % 100)) * 0.03 + (clothes - (clothes % 100)) * 0.02 + (others - (others % 100)) * 0.01;
		
        //結果を出力
        System.out.println((int)output);
    }
}