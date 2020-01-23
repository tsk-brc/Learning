import java.util.*;

/*
  カードの組み合わせによる最大の値を算出する。ルールは以下の通り。
    ・1から9までの数字のカードを4枚使用する。ただし、この4枚の中には同じ数値のカードが重複する事もある。
    ・カードを左から順に並べ、左から2枚のカード、右から2枚のカードをそれぞれ2ケタの整数とみなし、和を計算する。
    ・あらゆる並べ方を試し、和の最大値を求める。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //最大のカードの値
        int maxNum = 0;
        //2番目に大きいカードの値
        int largeNum = 0;
        //3番目に大きいカードの値
        int smallNum = 0;
        //最小のカードの値
        int minNum = 0;
        //組み合わせによる最大値
        int maxSumNum = 0;
        for(int i = 0;i < 4; i++){
          //カードを受け取る
          int num = Integer.parseInt(sc.next());
          //カード同士の値を比べる
          if(num >= maxNum){
            minNum = smallNum;
            smallNum = largeNum;
            largeNum = maxNum;
            maxNum = num;
          } else if(num < maxNum && num >= largeNum){
            minNum = smallNum;
            smallNum = largeNum;
            largeNum = num;
          }else if(num < maxNum && num < largeNum && num >= smallNum){
            minNum = smallNum;
            smallNum = num;
          } else {
            minNum = num;  
          }
        }
        //4枚のカードの合計を算出
        maxSumNum = maxNum * 10 + largeNum * 10 + smallNum + minNum;
        System.out.println(maxSumNum);
    }
}
