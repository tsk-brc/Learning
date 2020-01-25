import java.util.*;

/*
  正の整数の掛け算を行う。
  ただし積が9,999より大きい場合、"NG"を表示する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //値1
        int num1 = Integer.parseInt(sc.next());
        //値2
        int num2 = Integer.parseInt(sc.next());
        //乗法を行う
        if(num1 * num2 <= 9999){
          System.out.println(num1 * num2);
        } else {
          System.out.println("NG");  
        }
    }
}