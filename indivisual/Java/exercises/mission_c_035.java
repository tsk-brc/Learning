import java.util.*;

/*
  受験者の合格判定を行う。なお、合格基準は以下の通り。
  ・全科目の合計得点が350点以上
  ・理系の受験者の場合、理系2科目(数学、理科)の合計得点が160点以上
  ・文系の受験者の場合、文系2科目(国語、社会)の合計得点が160点以上
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(" |\\s");
    // 受験者数
    int person = Integer.parseInt(sc.next());
    // 合格者数
    int passPerson = 0;
    // 受験者全員の合否判定
    for (int i = 0; i < person; i++) {
      // 分野(理系or文系)
      String subject = sc.next();
      // 英語の得点
      int EnglishScore = Integer.parseInt(sc.next());
      // 数学の得点
      int MathScore = Integer.parseInt(sc.next());
      // 理科の得点
      int ScienceScore = Integer.parseInt(sc.next());
      // 国語の得点
      int JapaneseScore = Integer.parseInt(sc.next());
      // 社会の得点
      int HistoryScore = Integer.parseInt(sc.next());
      // 合計得点
      int totalScore = EnglishScore + MathScore + ScienceScore + JapaneseScore + HistoryScore;
      // 全科目の合計得点が合格点以上か
      if (totalScore >= 350) {
        // 文系受験者は文系2科目が合格点以上か
        if (subject.equals("l") && JapaneseScore + HistoryScore >= 160) {
          passPerson++;
          // 理系受験者は理系2科目が合格点以上か
        } else if (subject.equals("s") && MathScore + ScienceScore >= 160) {
          passPerson++;
        }
      }
    }
    System.out.println(passPerson);
  }
}