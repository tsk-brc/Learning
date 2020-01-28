import java.util.*;

/*
  パリティチェックを行う。 
  排他的論理和(xor)を用いて、各桁の1の数が奇数個であれば1、そうでなければ0を出力する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //データ数
        int target = Integer.parseInt(sc.nextLine());
        //2進数を1桁ずつ格納する配列
        String[][] num = new String[target][4];
        //出力結果を結合するための変数
        StringBuilder sb = new StringBuilder();
        //データ数だけ処理を行う
        for(int i = 0; i < target; i++){
          //2進数のデータ
          String str = sc.nextLine();
          //配列にバラして格納する
          for(int j = 0; j < 4; j++){
            num[i][j] = str.substring(j, j + 1);
          }
        }
        //排他的論理和を求める
        for(int k = 0; k < 4; k++){
          int output = 0;
          //各桁の加算を行う
          for(int l = 0; l < target; l++){
            output += Integer.parseInt(num[l][k]);
          }
          //排他的論理和の判定をし、結果を文字列結合
          if(output % 2 == 0){
            sb.append("0");
          } else {
            sb.append("1");
          }
        }
        System.out.println(sb);
    }
}