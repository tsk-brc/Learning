apple_price = 200

# inputを用いて入力を受け取り、変数input_countに代入してください
input_count = input("購入するりんごの個数を入力してください:" )

# input_countを数値として代入してください
count = int(input_count)
total_price = apple_price * count

print('購入するりんごの個数は' + str(count) + '個です')
print('支払い金額は' + str(total_price) + '円です')