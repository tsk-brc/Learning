import java.util.*;

/*
  トーナメントの優勝者と準優勝者を決める。
  出場者4人を1回戦では、参加者2組に分かれて競わせる。
  各組で上位となった2人が2回戦に進出し、 2回戦の勝者がこの大会の優勝者となる。
  各試合において同着はないものとする。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //1回戦第1試合の出場ナンバー1
        int tournament1 = Integer.parseInt(sc.next());
        //1回戦第1試合の出場ナンバー2
        int tournament2 = Integer.parseInt(sc.next());
        //1回戦第2試合の出場ナンバー1
        int tournament3 = Integer.parseInt(sc.next());
        //1回戦第2試合の出場ナンバー2
        int tournament4 = Integer.parseInt(sc.next());
        //出場者のタイムを格納する配列
        int[] player = new int[4];
        //1回戦第1試合の勝者
        int targetPlayer1 = 0;
        //1回戦第2試合の勝者
        int targetPlayer2 = 0;
        //エントリーナンバー1〜4まで順に処理していく
        for(int i = 0; i < 4; i++){
          //出場者のタイム
          int targetPlayer = Integer.parseInt(sc.next());
          //配列にタイムを格納
          player[i] = targetPlayer;
        }
        //1回戦第1試合
        if(player[tournament1 - 1] > player[tournament2 - 1]){
          targetPlayer1 = tournament2;
        } else {
          targetPlayer1 = tournament1;
        }
        //1回戦第2試合
        if(player[tournament3 - 1] > player[tournament4 - 1]){
          targetPlayer2 = tournament4;
        } else {
          targetPlayer2 = tournament3;
        }
        //2回戦のタイム
        int targetTime1 = Integer.parseInt(sc.next());
        int targetTime2 = Integer.parseInt(sc.next());

        //2回戦
        if(targetPlayer1 > targetPlayer2){
          if(targetTime1 > targetTime2){
            System.out.println(targetPlayer1);
            System.out.println(targetPlayer2);
          } else {
            System.out.println(targetPlayer2);
            System.out.println(targetPlayer1);
          }
        } else {
          if(targetTime1 > targetTime2){
            System.out.println(targetPlayer2);
            System.out.println(targetPlayer1);
          } else {
            System.out.println(targetPlayer1);
            System.out.println(targetPlayer2);
          }
        }
    }
}