=begin
  文字列を逆順で出力する。
=end

class MissionD178
  def run
    # 文字列の長さ(使わない)
    $stdin.gets.to_i
    # 対象の文字列を逆順で出力
    puts $stdin.gets.chomp.reverse
  end
end
