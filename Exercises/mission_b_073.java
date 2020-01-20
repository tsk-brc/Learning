import java.util.*;

/*
  並木道の木に電飾を施す。なお、電飾はあらかじめ一定数、施されており、以下のルールで追加する。
  ・ある区間の木の電球の平均個数が、安全基準を満たしていない場合、
    平均個数が安全基準を満たすように、その区間の木に均等に電球を追加する。
    ただし、追加する電球は安全の基準を満たすために必要最小限の個数とする。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //木の本数
        int tree = Integer.parseInt(sc.next());
        //電球の平均個数の下限
        int ave = Integer.parseInt(sc.next());
        int[] num = new int[tree];
        //現在の各木についている電球の数
        for(int i = 0; i < tree; i++){
          num[i] = Integer.parseInt(sc.next());
        }
        //調査対象数
        int check = Integer.parseInt(sc.next());
        //調査対象の数だけループ
        for(int j = 0; j < check; j++){
          //調査対象の始点
          int start = Integer.parseInt(sc.next());
          //調査対象の終点
          int end = Integer.parseInt(sc.next());
          //調査対象の電球数
          int aveNum = 0;
          //調査対象の木の本数
          int aveCount = 0;
          for(int k = start - 1; k < end; k++){
            aveNum += num[k];
            aveCount++;
          }
          //電球の平均個数の下限を下回っている間、調査対象の各木に電球を1つずつ追加する
          while(ave > aveNum / aveCount){
            aveNum = 0;
            for(int m = start - 1; m < end; m++){
              num[m]++;
              aveNum += num[m];
            }
          }
        }
        //最終的な各木の電球の個数をスペース区切りで出力する
        StringBuilder sb = new StringBuilder();
        for(int n = 0; n < tree; n++){
          if(n != 0){
            sb.append(" ");
          }
          sb.append(num[n]);
        }
        System.out.println(sb);
    }
}
