=begin
  1つ150gの果物をN個買った時の重さを求める
=end

class MissionD162

  def run
    # 数量
    amount = STDIN.gets.to_i
    # 重量算出
    puts amount * 150
  end
end
