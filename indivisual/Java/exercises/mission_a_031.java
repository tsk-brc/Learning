import java.util.*;

/*
  3つの素数を使って数列をつくる。数列は以下のルールで作成する。
    ・その数列は1に3つの素数を0回以上掛け合わせてできた数を小さい順に並べたもの。
    ・3つの素数はそれぞれ1回も使わない場合もある。
*/

public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ,|\\s");
        //素数1
        int num1 = Integer.parseInt(sc.next());
        //素数2
        int num2 = Integer.parseInt(sc.next());
        //素数3
        int num3 = Integer.parseInt(sc.next());
        //出力対象(何番目の項か)
        int count = Integer.parseInt(sc.next());
        //出力数値
        double targetNum = 0;
        ArrayList<Long> list = new ArrayList<Long>();
        //素数データを配列に格納
        for(int i = 0; i < 100; i++){
          for(int j = 0; j < 100; j++){
            for(int k = 0; k < 100; k++){
              targetNum = Math.pow(num1,i) * Math.pow(num2,j) * Math.pow(num3,k);
              long convertNum = (long) targetNum;
              list.add(convertNum);
            }
          }
        }
        //昇順にソート
        Collections.sort(list);
        //対象を出力
        System.out.println(list.get(count -1));
    }
}