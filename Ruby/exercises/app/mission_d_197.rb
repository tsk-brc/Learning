=begin
  購入金額に応じて付与するポイントを算出する。
=end

class MissionD197
  def run
    # 購入金額
    price = gets.to_i
    # 購入金額に応じたポイントを付与
    puts price >= 1000 ? price / 10 : 0
  end
end
