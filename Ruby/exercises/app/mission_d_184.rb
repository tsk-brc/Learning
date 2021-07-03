=begin
  文字列を縦に出力する。
=end

class MissionD184
  def run
    # 文字列の長さ
    length = $stdin.gets.to_i
    # 出力する文字列
    str = $stdin.gets.chomp!
    # 1文字ずつ出力する
    length.times { |num|
      puts str[num, 1]
    }
  end
end
