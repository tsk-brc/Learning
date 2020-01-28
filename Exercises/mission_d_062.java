import java.util.*;

/*
  指定文字数を改行区切りで表示する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //1段目に置く文字数
        int num1 = Integer.parseInt(sc.next());
        //2段目に置く文字数
        int num2 = Integer.parseInt(sc.next());
        //3段目に置く文字数
        int num3 = Integer.parseInt(sc.next());
        //段数に置く文字列
        String[] str;
        str = new String[]{"A","B","C","D","E","F","G","H","I","J"};
        //各段に置く文字列
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        //置く文字数分ループ
        for(int i = 0; i < num1; i++){
            sb1.append(str[i]);
        }
        for(int j = num1; j < num1 + num2; j++){
            sb2.append(str[j]);
        }
        for(int k = num1 + num2; k < num1 + num2 + num3; k++){
            sb3.append(str[k]);
        }
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
    }
}