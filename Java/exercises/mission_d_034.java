import java.util.*;

/*
  注文するメニューを決める。
  ただし、メニューは「どれにしようかな天の神様の言うとおり」を使用して決める。
*/
public class Main {
  public static void main(String[] args) {

    // 入力データを受け取る
    Scanner sc = new Scanner(System.in);
    // メニュー数
    int num = Integer.parseInt(sc.nextLine());
    // メニューの決定
    if (21 % num == 0) {
      System.out.println(num);
    } else {
      System.out.println(21 % num);
    }
  }
}