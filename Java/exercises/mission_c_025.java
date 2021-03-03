import java.util.*;

/*
  ファックスを撮りにいく最小の回数を算出する。ただし以下の問題点がある。
    ・ファックスには大量の紙が届くので1度に全てを運ぶことはできない。
    ・また、長い時間ファックス機に放置することはできないので、x時y分に届いた紙は、x時59分までに取りに行かなければならない。
  上記のルールを守り、最小で運べる回数を求める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 1度に運べる最大枚数
    int maxPaper = Integer.parseInt(sc.next());
    // ファックスが届く回数
    int fax = Integer.parseInt(sc.next());
    // 前回のファックスが届いた「時」
    int reHour = 0;
    // 同じ「時」に溜まったファックスの枚数
    int sumPaper = 0;
    // 運んだ総数
    int carryNum = 0;
    for (int i = 0; i < fax; i++) {
      // ファックスが届いた「時」
      int hour = Integer.parseInt(sc.next());
      // ファックスが届いた「分」
      int min = Integer.parseInt(sc.next());
      // ファックスで届いた枚数
      int paper = Integer.parseInt(sc.next());
      // 前回と同じ「時」に届いたら1度に運ぶ枚数にカウント
      if (reHour == hour) {
        sumPaper += paper;
        // 前回と違う「時」に届いたら全てを運び、リセットする
      } else {
        if (sumPaper % maxPaper == 0) {
          carryNum += sumPaper / maxPaper;
        } else {
          carryNum += sumPaper / maxPaper + 1;
        }
        sumPaper = paper;
        reHour = hour;
      }
    }
    // 運んだ総数を出力
    if (sumPaper % maxPaper == 0) {
      System.out.println(carryNum + (sumPaper / maxPaper));
    } else {
      System.out.println(carryNum + ((sumPaper / maxPaper) + 1));
    }
  }
}
