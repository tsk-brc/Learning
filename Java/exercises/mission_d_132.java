import java.util.*;

/*
  N回ゲームを行う。
*/
public class Main {
    public static void main(String[] args) {

        // 入力データを受け取る
        Scanner sc = new Scanner(System.in);
        // 同じ言葉を言う回数
        int num = Integer.parseInt(sc.nextLine());
        // 発する言葉
        String str = sc.nextLine();
        // 言い終わった後の言葉
        StringBuilder sb = new StringBuilder();
        // 指定回数分言葉をつなげる
        for (int i = 0; i < num; i++) {
            sb.append(str);
        }
        System.out.println(sb);
    }
}