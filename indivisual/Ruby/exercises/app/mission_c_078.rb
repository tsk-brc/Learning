=begin
  株の売買での損益を計算する。
=end
class MissionC078

  def run
    # 取引する株の情報(日数 買値 売値)
    stockInfo = STDIN.gets.split
    # 株取引による損益
    money = 0
    # 所持している株数
    hasStocks = 0
    # 取引日数分ループ
    stockInfo[0].to_i.times do |num|
      # 各日の株価を取得
      stock = STDIN.gets.to_i
      # 最終日でないかつ指定する買値以上の場合、1株購入し損益計算する
      if stock <= stockInfo[1].to_i && num != stockInfo[0].to_i - 1
        money -= stock
        hasStocks += 1
      # 最終日または指定する売値以上の場合、全て売り、損益計算する
      elsif stock >= stockInfo[2].to_i || num == stockInfo[0].to_i - 1
        money += (stock *hasStocks)
        hasStocks = 0
      end
    end
    # 取引結果を出力
    puts money
  end
end