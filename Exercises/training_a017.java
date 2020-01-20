import java.util.*;

/*
  落ちゲーを作成する。なお、ルールは以下の通り。
  ・縦幅:H、横幅:Wの長方形のフィールドで行われる。
  ・ゲームが始まると、様々なサイズの長方形がフィールドの上方から一つずつ順番に落ちてくる。
  ・落ちてくる長方形の直下に他の長方形もしくはフィールドの底辺がある場合、接触したとみなして長方形の位置は固定される
  ・N個の長方形がすべて落ちた後のフィールドの状態を出力する。
*/

public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        int height = Integer.parseInt(sc.next());
        int width = Integer.parseInt(sc.next());
        int num = Integer.parseInt(sc.next());
        //エリアの大きさを配列で指定
        String[][] area = new String[height][width];
        //全マスに長方形がない状態でスタートする
        for(int i = 0; i < height; i++){
          for(int j = 0; j < width; j++){
            area[i][j] = ".";
          }
        }
        //ブロックの情報を取得する
        for(int k = 0; k < num; k++){
          //縦の長さ
          int tate = Integer.parseInt(sc.next());
          //横の長さ
          int yoko = Integer.parseInt(sc.next());
	  //落ちてくる位置(左から何番目に落ちてくるか)
          int target = Integer.parseInt(sc.next());
          //接触するブロックの位置
          int checkNum = 0;
          boolean checkFlg = false;
          for(int l = height - 1; l >= 0; l--){
            for(int m = target; m < target + yoko; m++){
              //真下にブロックがあるか判定
              if(area[l][m].equals("#")){
                checkNum = l;
                checkFlg = true;
                break;
              }
            }
            if(checkFlg){
              checkNum++;
              break;
            }
          }
          //ブロックを置く位置に#を埋め込む
          for(int n = 0; n < tate; n++){
            for(int p = 0; p < yoko; p++){
              area[checkNum + n][target + p] = "#";
            }
          }
       }
       //エリアの状態を1行ずつ出力する
       for(int q = height - 1; q >= 0; q--){
         StringBuilder sb = new StringBuilder();
         for(int r = 0; r < width; r++){
           sb.append(area[q][r]);
         }
         System.out.println(sb);
       }
    }
}
