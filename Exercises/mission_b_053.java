import java.util.*;

/*
  オートフィル機能を使用する。
  M×N行列のうち、(1,1),(1,2),(2,1),(2,2)の値が与えられるのでM×N行列の空白部分を埋める。
*/
public class Main {
    public static void main(String[] args) {
        
        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //行の数
        int tate = Integer.parseInt(sc.next());
        //列の数
        int yoko = Integer.parseInt(sc.next());
        int[][] num = new int[tate][yoko];
        //(1,1)の値
        num[0][0] = Integer.parseInt(sc.next());
        //(1,2)の値
        num[0][1] = Integer.parseInt(sc.next());
        //(2,1)の値
        num[1][0] = Integer.parseInt(sc.next());
        //(2,2)の値
        num[1][1] = Integer.parseInt(sc.next());
        //等差数列の公差を求める
        int sabun1 = num[0][1] - num[0][0];
        int sabun2 = num[1][1] - num[1][0];
        //公差を足して配列に値をセットする(縦方向)
        for(int i = 2; i < yoko; i++){
          num[0][i] = num[0][i - 1] + sabun1;
          num[1][i] = num[1][i - 1] + sabun2;
        }
        //公差を求めて配列に値をセットする(横方向)
        for(int j = 2; j < tate; j++){
          for(int k = 0; k < yoko; k++){
            num[j][k] = num[j - 1][k] + (num[j - 1][k] - num[j - 2][k]);
          }
        }
        //行列を出力する
        for(int l = 0; l < tate; l++){
          StringBuilder sb = new StringBuilder();
          for(int m = 0; m < yoko; m++){
            if(m != 0){
              sb.append(" ");
            }
            sb.append(Integer.toString(num[l][m]));
          }
          System.out.println(sb);
        }
    }
}
