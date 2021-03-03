=begin
  1桁の12進数を10進数に変換する。
=end

class MissionD175
  def run
    # 12進数の値を受け取る(英字もあるのでこの時点ではto_iしない)
    hex_12 = $stdin.gets.chomp!
    # 10進数に変換した値　
    hex_10 = 0
    # 10進数に変換
    if hex_12 == 'A'
      hex_10 = 10
    elsif hex_12 == 'B'
      hex_10 = 11
    else
      hex_10 = hex_12.to_i
    end
    puts hex_10
  end
end
