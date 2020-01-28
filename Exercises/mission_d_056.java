import java.util.*;

/*
  立方体のかまくらの体積を求める。
*/
public class Main {
    public static void main(String[] args) {

        //入力データを受け取る
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ,|\\s");
        //立方体の1辺の長さ
        int num1 = Integer.parseInt(sc.next());
        //くり抜く部分の1辺の長さ
        int num2 = Integer.parseInt(sc.next());
        //かまくらの体積
        int outputNum = (int) (Math.pow(num1,3) - Math.pow(num2,3));
        System.out.println(outputNum);
    }
}