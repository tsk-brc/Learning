=begin
  数値の余りを出力する。
=end

class MissionD179
  def run
    # 数値1
    num1 = $stdin.gets.to_i
    # 数値2
    num2 = $stdin.gets.to_i
    # あまりを出力
    puts num2 % num1
  end
end
