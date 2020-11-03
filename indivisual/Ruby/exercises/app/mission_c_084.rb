=begin
  文字列を装飾して出力する。
=end

class MissionC084
  def run
    # 対象の文字列
    str = STDIN.gets.chomp
    # 文字数取得
    str_length = str.length

    # 装飾して出力
    puts '+' * (str_length + 2)
    puts '+' + str + '+'
    puts '+' * (str_length + 2)
  end
end
