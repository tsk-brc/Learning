=begin
  1500円の商品をn個買った時の料金を求める。
=end

class MissionD174
  def run
    # 商品数
    num = $stdin.gets.to_i
    # 料金を求める
    puts num * 1500
  end
end
