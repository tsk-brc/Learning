=begin
  イヴの日付を求める。
=end

class MissionD172
  def run
    # 対象の日付
    target_day = $stdin.gets.to_i
    # eveの日を求める
    puts target_day - 1
  end
end
