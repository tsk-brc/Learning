public class Person{
  public static String fullName(String firstName, String lastName){
    //名字と名前を連結して返却する
    return firstName + " " + lastName;
  } 
  public static double bmi(double weight, double height){
    //BMIを算出して返却する(BMI=体重÷身長÷身長)
    return weight / height / height;
  }
}