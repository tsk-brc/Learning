fruits = {'apple': 'りんご', 'banana': 'バナナ', 'grape': 'ぶどう'}

# for文を用いて、辞書のキーを1つずつ取り出し、繰り返しの中で「◯◯は△△という意味です」と出力させてください
for fruit in fruits:
    print(fruit + 'は' + fruits[fruit] + 'という意味です')
