import java.util.*;

/*
  各生徒が摂取したカロリーを計算する。
  各料理の100gあたりのカロリーと各生徒が食べた量(g)から生徒の摂取したカロリーを計算し、出力する。 
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" |\\s");
        //メニューの数
        int menu = Integer.parseInt(sc.next());
        //生徒の数
        int student = Integer.parseInt(sc.next());
        //カロリーを格納する配列
        int[] calorie = new int[menu];
        //各メニューのカロリーを配列に格納する
        for(int i = 0; i < menu; i++){
          calorie[i] = Integer.parseInt(sc.next()); 
        }
        //各生徒が摂取したカロリーを計算し、出力する
        for(int j = 0; j < student; j++){
          int eating = 0;
          for(int k = 0; k < menu; k++){
            eating += Integer.parseInt(sc.next()) * calorie[k] / 100;
          }
          System.out.println(eating);
        }
    }
}