=begin
  アイテムの総計を求める。
=end

class MissionD196
  def run
    # アイテムの数
    item_num = $stdin.gets.to_i
    # 総計
    price = 0
    # 商品の総計を求める
    item_num.times{
      price += $stdin.gets.to_i
    }
    puts price
  end
end
