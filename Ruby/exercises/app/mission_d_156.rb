=begin
  密を避けるために必要な面積を求める。
=end

class MissionD156
  def run
    # 1人あたりに必要な面積
    square = $stdin.gets.to_i
    # 人数
    person = $stdin.gets.to_i
    # 必要な面積を算出
    puts square * person
  end
end
