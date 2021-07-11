=begin
  今日が夏日かどうかを判定する。
=end

class MissionD186
  def run
    # 気温
    temperature = $stdin.gets.to_i
    # 結果を出力
    puts (30...35) === temperature ? 'M' : temperature
  end
end
