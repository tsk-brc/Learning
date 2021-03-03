=begin
  入力された文字を縦に出力する
=end

class MissionD163
  def run
    # 入力文字
    str = $stdin.gets.chomp
    # 入力文字の文字数
    strLength = str.length
    # 1文字ずつ縦に出力
    strLength.times  do |num|
      puts str[num, 1]
    end
  end
end
