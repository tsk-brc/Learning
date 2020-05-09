public class Person{
  public static String fullName(String firstName, String lastName){
    //名字と名前を連結して返却する
    return firstName + " " + lastName;
  } 
  public static double bmi(double weight, double height){
    //BMIを算出して返却する(BMI=体重÷身長÷身長)
    return weight / height / height;
  }
  public static boolean isHealthy(double weight, double height){
    double bmi = bmi(weight,height);
    if (bmi >= 18.5 && bmi < 25.0){
      return true;
    } else {
      return false;
    }
  }
}