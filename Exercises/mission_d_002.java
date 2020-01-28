import java.util.*;

/*
  正の整数を比較し大きい方の値を出力する。
  同じ場合は「eq」を出力する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        String str = sc.next();
        int num1 = Integer.parseInt(str);
        str = sc.next();
        int num2 = Integer.parseInt(str);
        //値の比較
        if(num1 > num2){
          System.out.println(num1);
        } else if(num1 < num2){
          System.out.println(num2);
        } else {
          System.out.println("eq");
        }
    }
}