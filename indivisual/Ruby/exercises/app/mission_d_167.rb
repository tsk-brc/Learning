=begin
  購入金額を算出する。
  ただし、1000円以上の買い物の場合は3円する有料の袋も買うこととする。
=end

class MissionD167

  def run
    # 購入金額
    amount = STDIN.gets.to_i
    # 1000円以上なら買い物袋を購入する
    if amount >= 1000
      puts amount + 3
    else
      puts amount
    end
  end
end
