=begin
  炊いたお米が何kcalか求める。
=end

class MissionD194
  def run
    # 炊いた合数
    calorie  = $stdin.gets.to_i
    # 総カロリー数
    puts 540 * calorie
  end
end
