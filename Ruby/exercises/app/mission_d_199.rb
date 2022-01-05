=begin
  お正月に必要なお餅の数を算出する。
=end

class MissionD199
  def run
    # 1人が食べるお餅の数
    rice_cakes_per_person = $stdin.gets.to_i
    # 人数
    people = $stdin.gets.to_i
    # 必要な数を出力
    puts rice_cakes_per_person * people
  end
end
