import java.util.*;

/*
  何番目に到着するか算出する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //到着時間を格納する変数
        int num[] = new int[5];
        //何番目に到着するか
        int score = 1;
        //他の人が何分に到着するか
        for(int i = 0; i < 5; i++){
          num[i] = Integer.parseInt(sc.next());
        }
        //到着時間
        int targetNum = Integer.parseInt(sc.next());
        //何番目か比較
        for(int j = 0; j < 5; j++){
            if(num[j] < targetNum){
              score ++;
            }
        }
        System.out.println(score);
    }
}