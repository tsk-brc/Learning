# FoodクラスとDrinkクラスをそれぞれ読み込んでください
from food import Food
from drink import Drink

# Foodクラスのインスタンスを生成して変数food1に代入してください
food1 = Food('サンドイッチ', 500)

# food1に対してinfoメソッドを呼び出して戻り値を出力してください
print(food1.info())

# Drinkクラスのインスタンスを生成して変数drink1に代入してください
drink1 = Drink('コーヒー', 300)

# drink1に対してinfoメソッドを呼び出して戻り値を出力してください
print(drink1.info())
