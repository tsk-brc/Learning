import java.util.*;

/*
  ビンゴを行う。なお、ルールは以下の通り。
  ・N×Nマスのビンゴカードが配られ、カードには1からN×Nまでの相異なる整数が書かれている。
  ・1からN×Nまでのいずれかの整数をM回呼び上げる。ただし、呼び上げでは必ず異なる整数が呼び上げられる。
  ・数字が呼び上げられたら、自分のビンゴカード上で呼び上げられた整数のマスに穴を開ける。
  ・M-1回目まで繰り返す。
  ・M回目は自分で空けるマスを決めることができる。ビンゴになる数が最大となる場所を決める。
  ・ビンゴになった数を出力する
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
		//ビンゴの縦および横の長さ(問題文のNに相当)
        int length = Integer.parseInt(sc.next());
		//読み上げ回数(問題文のMに相当)
        int call = Integer.parseInt(sc.next());
		//ビンゴカード
        int[][] card = new int[length][length];
        //カードに値を設定
        for(int i = 0; i < length; i++){
          for(int j = 0; j < length; j++){
            card[i][j] = Integer.parseInt(sc.next());
          }
        }
        //主催者読み上げ
        for(int k = 0; k < call - 1; k++){
          int target = Integer.parseInt(sc.next());
          boolean targetCheckFlg = false;
          for(int l = 0; l < length; l++){
            for(int m = 0; m < length; m++){
              if(card[l][m] == target){
                //読み上げた数字と一致したら0にする(0は穴が開いていると同意)
                card[l][m] = 0;
                targetCheckFlg = true;
                break;
              }
            }
            if(targetCheckFlg){
              break;
            }
          }
        }
        //最後の1枚をどこにするかを判定する
        int maxBingo = 0;
        for(int p = 0; p < length; p++){
          int maxNum = 0;
          for(int q = 0; q < length; q++){
            int bingo = 0;  
            int copy = card[p][q];
            //指定したところを0にしたらどれだけビンゴが増えるかをチェックする
            card[p][q] = 0;
          
            //ビンゴの数をチェックする(縦方向)
            for(int x = 0; x < length; x++){
              maxNum = 0;
              for(int y = 0; y < length; y++){
                if(maxNum < card[y][x]){
                  maxNum = card[y][x];
                }
              }
              if(maxNum == 0){
                bingo++;
              }
            }
            //ビンゴの数をチェックする(横方向)
            for(int s = 0; s < length; s++){
              maxNum = 0;
              for(int t = 0; t < length; t++){
                if(maxNum < card[s][t]){
                  maxNum = card[s][t];
                }
              }
              if(maxNum == 0){
                bingo++;
              }
            }
            //ビンゴの数をチェックする(斜め方向)
            maxNum = 0;
            for(int u = 0; u < length; u++){
              if(maxNum < card[u][u]){
                maxNum = card[u][u];
              }
            }
            if(maxNum == 0){
              bingo++;
            }
            maxNum = 0;
            for(int v = 0; v < length; v++){
              if(maxNum < card[v][length - v - 1]){
                maxNum = card[v][length - v - 1];
              }
            }
            if(maxNum == 0){
              bingo++;
			}
			//ビンゴが最大数かどうかチェックする
            if(maxBingo < bingo){
              maxBingo = bingo;
            }
            card[p][q] = copy;
          }
        }  
        System.out.println(maxBingo);
    }
}