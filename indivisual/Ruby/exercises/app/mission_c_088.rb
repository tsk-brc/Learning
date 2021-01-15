=begin
  買い物を行い、残金を求める。
  ただし、購入時に所持金が足りない場合は、その注文は無視される。
=end
class MissionC088
  def run
    # アイテムの個数
    item_num = $stdin.gets.to_i
    # 各アイテムの金額(スペース区切り)
    items = $stdin.gets.split.map!(&:to_i)
    # 所持金と購入回数
    buying_info = $stdin.gets.split.map!(&:to_i)
    # 所持金だけ分かりやすいように切り出す
    money = buying_info[0]
    # 購入回数分ループ
    buying_info[1].times {
      # 購入した商品とその個数
      buy_item = $stdin.gets.split.map!(&:to_i)
      # 購入時に所持金が足りる場合は、その商品を購入する
      money -= items[buy_item[0] - 1] * buy_item[1] 
      if money >= items[buy_item[0] - 1] * buy_item[1]
    }
    # 残金を出力
    puts money
  end
end
