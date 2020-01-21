import java.util.*;

/*
  1から10の整数Nと10個の単語が与えられる。
  N番目の単語を出力する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
		Scanner sc = new Scanner(System.in);
		//出力する番号
        int num = Integer.parseInt(sc.next());
		//単語を格納する配列
        String[] str = new String[num];

		//配列に単語を格納
        for(int i = 0; i < num; i++){
            str[i] = sc.next();
        }
		
		//対象を出力
        System.out.println(str[num - 1]);
    }
}