import java.util.*;

/*
  ある数式を解読し、計算する。計算ルールは以下の通り。
    ・数式はすべて2個以上の整数の足し算となっている。
    ・使用する整数は1から99までで、10進法を用いる。
    ・連続する"<"の数が整数の10の位を表し、それに続く連続する"/"の数が整数の1の位を表す。
    ・"+"が足し算の記号を表す。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //計算結果
        int num = 0;
		//文字列を1文字ずつ分解し検証
        for(int i = 0; i < str.length(); i++){
          //「/」であれば1を加算する
          if(str.substring(i, i + 1).equals("/")){
            num ++;
          //「<」であれば10を加算する
          } else if(str.substring(i, i + 1).equals("<")){
            num += 10;  
          }
        }
        System.out.println(num);
    }
}