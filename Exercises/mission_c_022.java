import java.util.*;

/*
  株価の始値、終値、高値、安値を求める。各値は以下のように求める。
    ・始値は1日目の始値
    ・終値はn日目の終値
    ・高値は1日目からn日目までの最大の高値
    ・安値は1日目からn日目までの最小の安値
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ,|\\s");
        //出力する文字列を格納する変数
        StringBuilder sb = new StringBuilder();
        //対象となるデータ数
        int count = Integer.parseInt(sc.nextLine());
        //データを格納する配列
        int[][] array = new int[count][4];
        //最大値(初期値はシステム上の最小値)
        int maxValue = 0;
        //最小値(初期値はシステム上の最大値)
        int minValue = 1000000;
        //半角スペース
        final String halfSpace = " ";
        //入力データを配列に格納していく
        for(int i = 0; i < count; i++){
          for(int j = 0; j < 4; j++){
              array[i][j] = Integer.parseInt(sc.next());
          }
        }
        //始値を出力
        sb.append(Integer.toString(array[0][0]));
        sb.append(halfSpace);
        //終値を出力
        sb.append(Integer.toString(array[count - 1][1]));
        sb.append(halfSpace);
        //高値を出力
        for(int k = 0; k < count; k++){
         if(array[k][2] >= maxValue){
           maxValue = array[k][2];
         }
        }
        sb.append(maxValue);
        sb.append(halfSpace);
        //安値を出力
        for(int l = 0; l < count; l++){
         if(array[l][3] <= minValue){
           minValue = array[l][3];
         }
        }
        sb.append(minValue);
        System.out.println(sb);
    }
}