import java.util.*;

/*
  ヒントをもとに数字を当てるゲームを行う。ルールは以下の通り。
  ・プレイヤーには、ある正の整数aに関するN個のヒントが与えられる。
  ・ヒントは変数xに対して、
    "> x" は、aがxよりも大きいことを示す。
    "< x" は、aがxよりも小さいことを示す。
    "/ x" は、aがxでちょうど割り切れることを示す。
  ・正の整数は1〜100、ヒントは1〜10個与えられ、条件を満たす整数は一意に定まるものとする。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // ヒントの数
    int num = Integer.parseInt(sc.nextLine());
    // 1〜100までを入れる配列
    int[] list = new int[100];
    // 1から100までを格納する
    for (int x = 0; x < 100; x++) {
      list[x] = x + 1;
    }
    // ヒントの数だけ処理を行う
    for (int i = 0; i < num; i++) {
      // ヒントの記号
      String str = sc.next();
      // ヒントの値
      int target = Integer.parseInt(sc.next());
      int check = 0;
      // ヒントに該当した値を格納する配列
      int[] newList = new int[100];
      // ヒントの記号が「/」の場合
      if (str.equals("/")) {
        for (int a = 0; a < list.length; a++) {
          // 剰余が0かを判定し、該当したらnewListに格納する
          if (list[a] % target == 0) {
            newList[check] = list[a];
            check++;
          }
        }
        // ヒントの記号が「<」の場合
      } else if (str.equals("<")) {
        for (int b = 0; b < list.length; b++) {
          // ヒントの値より小さいかを判定し、該当したらnewListに格納する
          if (list[b] < target) {
            newList[check] = list[b];
            check++;
          }
        }
        // ヒントの記号が「>」の場合
      } else {
        for (int c = 0; c < list.length; c++) {
          // ヒントの値より大きいかを判定し、該当したらnewListに格納する
          if (list[c] > target) {
            newList[check] = list[c];
            check++;
          }
        }
      }
      // newListの中身をlistにコピーする
      for (int d = 0; d < newList.length; d++) {
        list[d] = newList[d];
      }
    }
    // 該当した値を出力する
    System.out.println(list[0]);
  }
}