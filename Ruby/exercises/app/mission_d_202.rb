=begin
  ２つの店舗のうち、どちらの店舗のが安く購入できるかを求める。
=end

class MissionD202
  def run
    # ショップ1の価格(価格 送料)
    shop1 = $stdin.gets.split.map!(&:to_i)
    # ショップ2の価格(価格 送料)
    shop2 = $stdin.gets.split.map!(&:to_i)
    # 安い方の価格を出力
    puts shop1[0] + shop1[1] > shop2[0] + shop2[1] ? shop2[0] + shop2[1] : shop1[0] + shop1[1]
  end
end
