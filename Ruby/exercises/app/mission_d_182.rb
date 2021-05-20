=begin
  燃料1リットルあたりの走行距離を求める。
=end

class MissionD182
  def run
    # 走行距離
    distance = $stdin.gets.to_i
    # 使用した燃料
    fuel = $stdin.gets.to_i
    # 燃費を整数値で求める
    puts distance / fuel
  end
end
