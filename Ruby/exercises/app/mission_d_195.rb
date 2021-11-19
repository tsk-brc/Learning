=begin
  ワインを作るのに必要な葡萄の量を求める。
=end

class MissionD195
  def run
    # 作成する本数
    bottles  = $stdin.gets.to_f
    # 必要な葡萄の量
    puts 1.5 * bottles
  end
end
