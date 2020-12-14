=begin
  目標値からの差分を求める。
=end

class MissionD171
  def run
    # 自分と対戦相手のスコア
    score = STDIN.gets.split.map!{|x| x.to_i}
    # 目標値
    num = STDIN.gets.to_i
    # 目標値との差を求める
    puts (score[0] - num).to_s + ' ' + (score[1] - num).to_s
  end
end
