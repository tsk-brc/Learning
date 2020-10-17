=begin
  1週間の降水量で貯められる水の量を調査する。
=end

class MissionD161

  def run
    # 許容できる最大量
    maxNum = STDIN.gets.to_i
    # 1週間の降水量
    total = 0
    # 各日の降水量を加算
    7.times {
      total += STDIN.gets.to_i
    }
    # 貯水量を出力
    puts maxNum >= total ? total : maxNum
  end
end
