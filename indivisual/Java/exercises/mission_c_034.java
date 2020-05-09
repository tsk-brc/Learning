import java.util.*;

/*
  xの値を求める。以下の要領で問題を作成する。
    ・a + b = c, または a - b = c (a,b,cは整数)を生成する。
    ・a,b,cのうちいずれか1つをxに置き換える。
  xを求め、結果を出力する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //整数1
        String str1 = sc.next();
        //記号
        String str2 = sc.next();
        //整数2
        String str3 = sc.next();
        //等号
        String str4 = sc.next();
        //整数3
        String str5 = sc.next();
        //値1
        int num1 = 0;
        //値2
        int num2 = 0;
        //求める値(x)
        int targetNum = 0;
        //整数1がxかどうか判定
        if(str1.equals("x")){
          //値1に整数2を代入
          num1 = Integer.parseInt(str3);
          //値2に整数3を代入
          num2 = Integer.parseInt(str5);
          //記号を判定
          if(str2.equals("-")){
            //「-」なら値1と値2を加算
            targetNum = num1 + num2;
          } else {
            //「+」なら値1と値2を減算
            targetNum = num2 - num1;  
          }
        //整数2がxかどうか判定
        } else if(str3.equals("x")){
          //値1に整数1を代入
          num1 = Integer.parseInt(str1);
          //値2に整数3を代入
          num2 = Integer.parseInt(str5);
          //記号を判定
          if(str2.equals("-")){
            //「-」なら値1と値2を減算
            targetNum = num1 - num2;
          } else {
            //「+」なら値1と値2を加算
            targetNum = num2 - num1;  
          }
        //整数3がxの場合
        } else {
          //値1に整数1を代入
          num1 = Integer.parseInt(str1);
          //値2に整数2を代入
          num2 = Integer.parseInt(str3);
          //記号を判定
          if(str2.equals("-")){
            //「-」なら値1と値2を減算
            targetNum = num1 - num2;
          } else {
            //「+」なら値1と値2を加算
            targetNum = num1 + num2;  
          }
        }
        //xの値を出力
        System.out.println(targetNum);
    }
}