import java.util.*;

/*
  星取表を作成する。
  すべての参加者どうしでリーグ戦を行い、星取表を完成させる。
  なお、このゲームに引き分けは存在しない。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //参加者数
        int player = Integer.parseInt(sc.next());
        //星取表
        String[][] games = new String[player][player];
        //試合数分ループする(試合数は2チームの組み合わせなのでnC2で求まる)
        for(int i = 0; i < player * (player -1 ) / 2; i++){
          //勝者
          int winner = Integer.parseInt(sc.next());
          //敗者
          int loser = Integer.parseInt(sc.next());
          //星取表を埋める
          games[winner - 1][loser - 1] = "W";
          games[loser - 1][winner - 1] = "L";
        } 
        //自分自身との試合はないため、星取表を「-」で埋める
        for(int j = 0; j < player; j++){
          games[j][j] = "-";
        }
        //参加者毎に結果を出力する
        for(int k = 0; k < player; k++){
          StringBuilder sb = new StringBuilder();
          for(int l = 0; l < player; l++){
            sb.append(games[k][l]);
            if(l < player -1){
              sb.append(" ");    
            }
          }
          System.out.println(sb);
        }
        
    }
}
