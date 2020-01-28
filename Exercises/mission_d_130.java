import java.util.*;

/*
  三角形の面積を計算する。
  三角形の頂点のうち、1つは原点にあり、
  もう2つは座標(a,b),(c,d)にあるものとする。
  なお、三角形の面積は小数点以下を切り上げて整数で算出すること。
*/

public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //頂点1のx座標
        int a = Integer.parseInt(sc.next());
        //頂点1のy座標
        int b = Integer.parseInt(sc.next());
        //頂点2のx座標
        int c = Integer.parseInt(sc.next());
        //頂点2のy座標
        int d = Integer.parseInt(sc.next());
        //三角形の面積を求める(S=1/2|ad-bc|を使用する)
        if(a * d - b * c > 0){
          if((a * d - b * c) % 2 == 0){
            System.out.println((a * d - b * c) / 2);
          } else {
            System.out.println((a * d - b * c) / 2 + 1);
          }
        } else {
          if((b * c - a * d) % 2 == 0){
            System.out.println((b * c - a * d) / 2);  
          } else {
            System.out.println((b * c - a * d) / 2 + 1); 
          }
        }
    }
}