=begin
  節分の日に子供全員でいくつの豆を食べるかを求める。
=end

class MissionD201
  def run
    # 子供の人数
    children = $stdin.gets.to_i
    # 食べる豆の数
    beans = 0
    # 子供が食べる分を全て足す
    children.times {
      beans += $stdin.gets.to_i
    }
    # 結果を出力
    puts beans
  end
end
