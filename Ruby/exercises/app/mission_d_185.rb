=begin
  時給従業員の給与を計算する。
=end

class MissionD185
  def run
    # 時給
    amount = $stdin.gets.to_i
    # 勤務時間
    hour = $stdin.gets.to_i
    # 給料を出力
    puts amount * hour
  end
end
