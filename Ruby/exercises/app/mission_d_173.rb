=begin
  文字列を入れ替える。
=end

class MissionD173
  def run
    # 対象の文字列
    input_data = $stdin.gets.split
    # 順番を入れ替えて出力
    puts input_data[1] + ' ' + input_data[0]
  end
end
