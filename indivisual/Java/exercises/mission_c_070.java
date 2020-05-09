import java.util.*;

/*
  簡易ポーカーを行う。ルールは以下の通り。
  ・手札が4枚で、この4枚の組み合わせにより以下の5種類の役が存在する。
    ・Four Card：同じ数字4枚からなる役
    ・Three Card：同じ数字3枚とそれ以外の数字1枚からなる役
    ・Two Pair：同じ数字2枚のペア2つからなる役
    ・One Pair：同じ数字2枚とそれ以外の相異なる数字2枚からなる役
    ・No Pair：上の4つ以外(4枚が全て相異なる数字)
  ・簡易ポーカーでは手札4枚の数字を小さい順に並べたものが配られる。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //ゲームの回数
        int game = Integer.parseInt(sc.next());
        for(int i = 0; i < game; i++){
          //配られたカード
          String str = sc.next();
          //配られたカードの1枚目
          String one = str.substring(0,1);
          //配られたカードの2枚目
          String two = str.substring(1,2);
          //配られたカードの3枚目
          String three = str.substring(2,3);
          //配られたカードの4枚目
          String four = str.substring(3,4);
          //Pair check
          if(one.equals(two) && two.equals(three) && three.equals(four)){
            System.out.println("Four Card");
          } else if((one.equals(two) && two.equals(three)) || (two.equals(three) && three.equals(four))){
            System.out.println("Three Card");  
          } else if(one.equals(two) && three.equals(four)){
            System.out.println("Two Pair");
          } else if(one.equals(two) || two.equals(three) || three.equals(four)){
            System.out.println("One Pair");  
          } else {
            System.out.println("No Pair");    
          }
        }

    }
}
