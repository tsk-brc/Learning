import java.util.*;

/*
  子供の欲しい数を手渡す。
  ただし、5より大きい数字を要求された場合には5個しか与えないこととする。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //子供1が要求する数
        int num1 = Integer.parseInt(sc.next());
        //子供2が要求する数
        int num2 = Integer.parseInt(sc.next());
        int output = 0;
        //要求する数を加算する
        if(num1 > 5){
          output += 5;
        } else {
          output += num1;
        }
        if(num2 > 5){
          output += 5;
        } else {
          output += num2;
        }
        
        System.out.println(output);
    }
}