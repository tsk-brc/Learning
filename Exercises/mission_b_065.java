import java.util.*;

/*
  ライフゲームを行う。ルールは以下の通り。
  ・ライフゲームは縦1マス×横10マスの盤面で行う。
  ・盤面の各マスには記号"+"または"-"のいずれかが書かれている。
  ・マスの記号は以下のルールに従って更新する。
    ・マスの更新は自分の両隣のマスの記号から、更新ルールに従って行う。
     ただし、各マスを左から順に1〜10で番号付けしたとき、1のマスの左隣は10のマスとし、10のマスの右隣は1のマスとする。
  ・更新ルールに従って、50回更新処理をしたときに、最初に与えられた形に戻るかどうかを判定し、出力する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //ライフゲームで使う盤面(初期配置)
        String target = sc.next();
        //更新ルール
        String update = sc.next();
        //初期配置
        String[] startLine = new String[10];
        //更新ルール適用前の配置
        String[] reUpdateLine = new String[10];
        //更新ルール適用後の配置
        String[] updateLine = new String[10];
        //一致したかどうか
        boolean unmatchFlg = true;
        //更新適用回数
        int counter = 0;
        for(int i = 0; i < 10; i++){
          startLine[i] = target.substring(i, i + 1);
          reUpdateLine[i] = target.substring(i, i + 1);
        }
        //最初に戻っていない、かつ更新処理が50回に達していない間処理を継続する。
        while(unmatchFlg && counter < 50){
          //更新ルールに沿って盤面を更新する
          for(int j = 0; j < 10; j++){
            if(j == 0){
              if(reUpdateLine[j + 1].equals("-") && reUpdateLine[9].equals("-")){
                updateLine[j] = update.substring(0, 1);
              } else if(reUpdateLine[j + 1].equals("+") && reUpdateLine[9].equals("-")){
                updateLine[j] = update.substring(1, 2);
              } else if(reUpdateLine[j + 1].equals("-") && reUpdateLine[9].equals("+")){
                updateLine[j] = update.substring(2, 3);
              } else {
                updateLine[j] = update.substring(3, 4);
              }
            } else if(j == 9){
              if(reUpdateLine[j - 1].equals("-") && reUpdateLine[0].equals("-")){
                updateLine[j] = update.substring(0, 1);
              } else if(reUpdateLine[j - 1].equals("-") && reUpdateLine[0].equals("+")){
                updateLine[j] = update.substring(1, 2);
              } else if(reUpdateLine[j - 1].equals("+") && reUpdateLine[0].equals("-")){
                updateLine[j] = update.substring(2, 3);
              } else {
                updateLine[j] = update.substring(3, 4);
              }
            } else {
              if(reUpdateLine[j - 1].equals("-") && reUpdateLine[j + 1].equals("-")){
                updateLine[j] = update.substring(0, 1);
              } else if(reUpdateLine[j - 1].equals("-") && reUpdateLine[j + 1].equals("+")){
                updateLine[j] = update.substring(1, 2);
              } else if(reUpdateLine[j - 1].equals("+") && reUpdateLine[j + 1].equals("-")){
                updateLine[j] = update.substring(2, 3);
              } else {
                updateLine[j] = update.substring(3, 4);
              } 
            }
          }
          //初期盤面に戻ったかどうかをチェックする
          for(int k = 0; k < 10; k++){
            if(startLine[k].equals(updateLine[k])){
              unmatchFlg = false;
            } else {
              unmatchFlg = true;
              for(int l = 0; l < 10; l++){
                //一致しなかったら適用後の盤面を適用前盤面にコピーする
                reUpdateLine[l] = updateLine[l];
              }
              break;
            }
          }
          counter++;
        }
        //結果を出力
        if(unmatchFlg){
          System.out.println("NO");
        } else {
          System.out.println("YES");
        }
    }
}
