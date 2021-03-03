=begin
  グラウンドを何m走ったかを算出する。
=end

class MissionD170
  def run
    # 周回距離
    round_distance = $stdin.gets.to_i
    # 何周走ったか
    run_times = $stdin.gets.to_i
    # 走った距離を出力
    puts round_distance * run_times
  end
end
