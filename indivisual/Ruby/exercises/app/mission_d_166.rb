=begin
  週を日数に変換する。
=end

class MissionD166
  def run
    # 週数
    week = STDIN.gets.to_i
    # 日数に変換して出力
    puts week * 7
  end
end
