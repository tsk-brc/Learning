import java.util.*;

/*
  ウサギに与える人参を選定する。
  ウサギは人参が好きだが、人参は糖分が多いため与えすぎるのは良くない。
  そこで、人参を1日1本だけ与えることにし、 特に糖分が許容範囲内で質量が大きい人参を選ぶことにした。
  糖分には基準値Sと許容誤差pがあり、糖分がS-p以上S+p以下ならば許容範囲内とする。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //人参の数
        int carrot = Integer.parseInt(sc.next());
        //糖分の基準値
        int targetSugar = Integer.parseInt(sc.next());
        //許容誤差
        int err = Integer.parseInt(sc.next());
        //出力対象の質量
        int maxGram = 0;
        //該当の人参本数
        int target = 0;
        //人参の本数分処理する
        for(int i = 0; i < carrot; i++){
          //人参の質量
          int gram = Integer.parseInt(sc.next());
          //人参の糖分
          int sugar = Integer.parseInt(sc.next());
          //対象の人参の糖分が許容範囲か判定
          if(sugar <= targetSugar + err && sugar >= targetSugar - err){
            //最大のグラム数か判定
            if(maxGram < gram){
              maxGram = gram;
              target = i + 1;
            }
          }
        }
        //該当の人参があったかどうかを判定
        if(target != 0){
          System.out.println(target);
        } else {
          System.out.println("not found");
        }
    }
}