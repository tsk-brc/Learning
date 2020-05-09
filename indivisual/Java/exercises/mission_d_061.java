import java.util.*;

/*
  お返しのプレゼントの個数を求める。
  もらったプレゼントが1つ以上であればその3倍の数を、
  0個であれば1つ用意することとする。
例)
*/
public class Main {
    public static void main(String[] args) {

        // 入力データを受け取る
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // もらったプレゼントの個数
        int num = Integer.parseInt(str);
        // お返しのプレゼントの個数
        int returnPresent = 0;
        // もらった数からお返しのプレゼントの個数を算出
        if (num == 0) {
            returnPresent = 1;
        } else {
            returnPresent = num * 3;
        }
        System.out.println(returnPresent);
    }
}