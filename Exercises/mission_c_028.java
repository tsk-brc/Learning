import java.util.*;

/*
  単語テストの採点を行う。なお、採点は以下の要領で行う。
    ・正解の単語と完全一致：2点
    ・正解の単語と文字数が異なる：0点
    ・正解の単語と文字数は同じだが1文字だけ異なる：1点
    ・正解の単語と文字数は同じだが2文字以上異なる：0点
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //問題数
        int count = Integer.parseInt(sc.next());
        //得点
        int score = 0;
        //問題数分採点する
        for(int i = 0; i < count; i++){
            //問題の解答
            String str1 = sc.next();
            //生徒の解答
            String str2 = sc.next();
            //正解したら2点追加
            if(str1.equals(str2)){
                score += 2;
            } else if(str1.length() == str2.length()){
                //間違えた文字数
                int unMatch = 0;
                for(int j = 0; j < str1.length(); j++){
                  if(!(str1.substring(j,j+1)).equals((str2.substring(j,j+1)))){
                    unMatch ++;
                  }
                }
                //間違えた文字数が1文字なら1点追加
                if(unMatch == 1){
                  score ++;
                }
            }
        }
        System.out.println(score);
    }
}