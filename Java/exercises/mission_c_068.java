import java.util.*;

/*
  暗号文を作成し、その暗号文を元に戻す。なお、暗号文を元に戻すルールは以下の通り。
    ・全ての文は大文字アルファベットのみを使う。
    ・文字の番号は左から順番に1番目と数える。
    ・暗号文を元に戻す操作として、暗号文の奇数番目の文字は、各文字をアルファベットの逆方向にN文字ずらし、
	  偶数番目の文字は、各文字を順方向にN文字ずらす。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // ずらす文字数
    int num = Integer.parseInt(sc.nextLine());
    // 暗号化された文字列
    String str = sc.nextLine();
    // アルファベット表
    ArrayList<String> alphabet = new ArrayList<String>();
    alphabet.add("A");
    alphabet.add("B");
    alphabet.add("C");
    alphabet.add("D");
    alphabet.add("E");
    alphabet.add("F");
    alphabet.add("G");
    alphabet.add("H");
    alphabet.add("I");
    alphabet.add("J");
    alphabet.add("K");
    alphabet.add("L");
    alphabet.add("M");
    alphabet.add("N");
    alphabet.add("O");
    alphabet.add("P");
    alphabet.add("Q");
    alphabet.add("R");
    alphabet.add("S");
    alphabet.add("T");
    alphabet.add("U");
    alphabet.add("V");
    alphabet.add("W");
    alphabet.add("X");
    alphabet.add("Y");
    alphabet.add("Z");
    StringBuilder sb = new StringBuilder();
    // アルファベット表の対応番号を取得
    for (int i = 0; i < str.length(); i++) {
      int count = 0;
      for (int j = 0; j < 26; j++) {
        if (str.substring(i, i + 1).equals(alphabet.get(j))) {
          count = j;
          break;
        }
      }
      if (i % 2 == 0) {
        // 奇数番目の文字
        if (count - num >= 0) {
          sb.append(alphabet.get(count - num));
        } else {
          sb.append(alphabet.get(count - num + 26));
        }
      } else {
        // 偶数番目の文字
        if (count + num <= 25) {
          sb.append(alphabet.get(count + num));
        } else {
          sb.append(alphabet.get(count + num - 26));
        }
      }
    }
    System.out.println(sb);
  }
}