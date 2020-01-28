import java.util.*;

/*
  任意の数字の2進数表示を調査する。
  調査したい桁が指定されるので、その桁が0なのか1なのかを判定し、出力する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //知りたい桁の数
        int num = Integer.parseInt(sc.next());
        //対象の数字
        int target = Integer.parseInt(sc.next());
        //対象の数字が何桁か知るための中間変数
        int copy = target;
        //対象の数字の桁数
        int count = 1;
        StringBuilder sb = new StringBuilder();
        boolean checkFlg = true;
        //2進数で何桁になるかを調査する(2で割り続けることで何桁かを確認する)
        while(checkFlg){
            if(copy / 2 > 0){
                copy /= 2;
                count ++;
            } else {
                checkFlg = false;
            }
        }
        //桁数をコピーする
        int copyCount = count;
        //2進数に変換する
        while(target >= 1){
          //2のn乗より大きい値かどうかをチェックする
          if(target >= Math.pow(2,copyCount - 1)){
            sb.append("1");
            target -= Math.pow(2,copyCount - 1);
          } else {
            sb.append("0");
          }
          copyCount --;
        }
        //桁数に足りなければ末尾を0で埋め込む
        if(sb.length() != count){
            while(sb.length() < count){
              sb.append("0");
            }
        }
        //調査対象の桁数を出力する
        for(int i = 0; i < num; i++){
          int output = Integer.parseInt(sc.next());
          System.out.println(sb.substring(sb.length() - output, sb.length() - output + 1));
        }
    }
}