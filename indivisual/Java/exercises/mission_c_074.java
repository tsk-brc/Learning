import java.util.*;

/*
  ウィンドウのサイズを変更する。
  ウィンドウのサイズを変更すると文章表示部分の大きさも同様に変更され、文章表示部分の幅に合わせて自然に改行される機能を作成する。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        //変更前の文章表示部分の高さ
        int height = Integer.parseInt(sc.next());
        //変更前の文章表示部分の横幅
        int preWeigh = Integer.parseInt(sc.next());
        //変更後の文章表示部分の横幅
        int adWeigh = Integer.parseInt(sc.next());
        //変更前の文章を格納する配列
        String[] str = new String[height * preWeigh];
        //変更前の文章を1文字ずつ配列に格納
        for(int i = 0; i < height; i++){
          String line = sc.next();
          for(int j = 0; j < preWeigh; j++){
            str[i * preWeigh + j] = line.substring(j, j + 1);
          }
        }
		
        int count = 0;
        //文章を全文字出力するまで処理を続ける
        while(count * adWeigh < height * preWeigh){
          //変更後の1行あたりの文章
          StringBuilder sb = new StringBuilder();
          for(int k = 0; k < adWeigh; k++){
            if(str.length > k + count * adWeigh)
              sb.append(str[k + count * adWeigh]);
            }
          //変更後の幅に合わせて出力
          System.out.println(sb);
          count++;
        }
    }
}