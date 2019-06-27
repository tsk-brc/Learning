
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //スキャナの初期化
    Scanner scanner = new Scanner(System.in);
    //最高齢の年齢の変数を用意
    int maxAge = 0;
    //人数情報を受け取る
    System.out.print("何人分の情報を入力しますか：");
    int personTotal = scanner.nextInt();
    for(int i = 1; i <= personTotal; i++){
      System.out.println(i + "人目");
      //名前を画面入力値から受け取る
      System.out.print("名前：");
      String firstName = scanner.next();
      //名字を画面入力値から受け取る
      System.out.print("名字：");
      String lastName = scanner.next();
      //年齢を画面入力値から受け取る
      System.out.print("年齢：");
      int age = scanner.nextInt();
      //身長を画面入力値から受け取る
      System.out.print("身長(m)：");
      double height = scanner.nextDouble();
      //体重を画面入力値から受け取る
      System.out.print("体重(kg)：");
      double weight = scanner.nextDouble();
      System.out.println("名前は" + Person.fullName(firstName, lastName) + "です");
      System.out.println("年齢は" + age + "歳です");
      if (age >= 20){
        System.out.println("成年者です");
      } else {
        System.out.println("未成年者です");
      }
      System.out.println("身長は" + height + "mです");
      System.out.println("体重は" + weight + "kgです");
      System.out.println("BMIは" + Math.round(Person.bmi(weight, height)) + "です");
      if (Person.isHealthy(weight, height)){
        System.out.println("健康です");
      } else {
        System.out.println("健康ではありません");
      }
      //今までの最高齢よりも現在の年齢のが大きい場合は最高齢を更新する
      if (maxAge < age){
        maxAge = age;
      }
    }
    System.out.println("最高年齢は" + maxAge + "歳です");
  }
}
