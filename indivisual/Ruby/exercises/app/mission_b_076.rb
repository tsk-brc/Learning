=begin
  パン屋の各購入者の購入金額を算出する。算出ルールは以下の通り。
    お客さんがパンを購入するとき、お客さんが指定するパンの個数がそれぞれの種類のパンの在庫にあるかどうかをチェックする。
　　・お客さんが指定する個数だけそれぞれのパンの在庫がある場合
　　　・購入に必要な合計金額を算出し、それぞれのパンの在庫の個数を、お客さんが指定した個数分だけ減らす。
　　・お客さんが指定する個数だけそれぞれのパンの在庫がない場合、在庫が足りないため、エラーとする。
　　　・このとき、購入はキャンセルされ在庫は減らない。
    また、パンが新たに焼きあげられた時はそれぞれのパンの在庫数を焼き上げられた個数だけ増やす。
=end

class MissionB076
  def run
    # パン屋の情報(パンの種類数 パンの操作(焼き上がりor購入))
    bakery_info = $stdin.gets.split
    # パンの価格を格納する配列
    bread_price = []
    # パンの残数を格納する配列
    bread_number = []
    # パンの種類数分ループ
    bakery_info[0].to_i.times { |num|
      # パンの情報(パンの価格 パンの残数)
      bread_info = $stdin.gets.split
      # パンの価格と残数をそれぞれの配列に格納
      bread_price[num] = bread_info[0].to_i
      bread_number[num] = bread_info[1].to_i
    }
    # パンの操作数分ループ
    bakery_info[1].to_i.times { |num|
      # 購入可能かどうかを表すフラグ
      available_purchase_flg = true
      # 購入金額
      purchased_amount = 0
      # パンの情報(パンの操作(焼き上がりor購入) それぞれのパンの個数)
      purchase = $stdin.gets.split
      # パンが焼き上がったらそれぞれのパンの残数に加算
      if purchase[0] == 'bake'
        bakery_info[0].to_i.times { |num2|
          bread_number[num2] += purchase[num2 + 1].to_i
        }
      else
        # パンの購入者が現れたらそれぞれのパンを購入可能かどうかチェック
        # 購入不可の場合にロールバックできないのでこの時点ではパンの残数を減算しない
        bakery_info[0].to_i.times { |num2|
          if bread_number[num2] - purchase[num2 + 1].to_i < 0
            available_purchase_flg = false
            break
          end
        }
        # 購入可能ならパンの残数を購入数で減算し、購入価格を算出
        if available_purchase_flg
          bakery_info[0].to_i.times { |num2|
            bread_number[num2] -= purchase[num2 + 1].to_i
            purchased_amount += bread_price[num2] * purchase[num2 + 1].to_i
          }
          puts purchased_amount
        # 購入できないなら価格を-1とする
        else
          puts(-1)
        end
      end
    }
  end
end
