import java.util.*;

/*
  オリンピックの国別メダル獲得数ランキングを作成する。ランキングは以下のルールで決定する。
    ・金メダルの獲得数が多いほうが上位となる。
    ・金メダルの獲得数が同じ場合、銀メダルの獲得数が多いほうが上位となる。
    ・金メダル、銀メダルの獲得数ともに同じ場合、銅メダルの獲得数が多いほうが上位となる。
  メダル数が同数となる場合もあるが、獲得数を出力するため、その両者を区別する必要はない。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //比較する国数
        int country = Integer.parseInt(sc.next());
        //各国のメダル数を格納する配列
        int[][] getMedal = new int[country][3];
        boolean checkFlg = true;
        //各国のメダル数を配列に格納する
        for(int i = 0; i < country; i++){
          //金メダルの数
          int gold = Integer.parseInt(sc.next());
          //銀メダルの数
          int silver = Integer.parseInt(sc.next());
          //銅メダルの数
          int bronze = Integer.parseInt(sc.next());
          getMedal[i][0] = gold;
          getMedal[i][1] = silver;
          getMedal[i][2] = bronze;
        }
       //入れ替えがなくなるまで処理を続ける
        while(checkFlg){
          //ループ処理で順番を入れ替えた回数
          int exchange = 0;
          //N番目とN+1番目の国のメダル数を比較する
          for(int j = 0; j < country - 1; j++){
            //メダル数を退避する変数
            int memoryGold = 0;
            int memorySilver = 0;
            int memoryBronze = 0;
            //配列の順番と順位が逆なら入れ替えて、カウンタを1追加する
            if(getMedal[j][0] < getMedal[j + 1][0] || (getMedal[j][0] == getMedal[j + 1][0] && getMedal[j][1] < getMedal[j + 1][1]) || (getMedal[j][0] == getMedal[j + 1][0] && getMedal[j][1] == getMedal[j + 1][1] && getMedal[j][2] < getMedal[j + 1][2])){
              memoryGold = getMedal[j][0];
              memorySilver = getMedal[j][1];
              memoryBronze = getMedal[j][2];
              getMedal[j][0] = getMedal[j + 1][0];
              getMedal[j][1] = getMedal[j + 1][1];
              getMedal[j][2] = getMedal[j + 1][2];
              getMedal[j + 1][0] = memoryGold;
              getMedal[j + 1][1] = memorySilver;
              getMedal[j + 1][2] = memoryBronze;
              exchange++;
            }
          }
          //入れ替え処理を終えた段階で、入れ替えがなかった処理終了
          if(exchange == 0){
            checkFlg = false;
          }
        }
        //順位の昇順にメダル数を出力
        for(int k = 0; k < country; k++){
          System.out.println(Integer.toString(getMedal[k][0]) + " " + Integer.toString(getMedal[k][1]) + " " + Integer.toString(getMedal[k][2]));
        }
    }
}