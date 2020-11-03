=begin
  n文字目の文字を取り除く。
=end

class MissionD149
  def run
    # 文字列
    str = STDIN.gets.chomp
    # 取り除く文字の場所(n番目)
    remove_target = STDIN.gets.to_i
    # 文字列から指定した場所の文字を取り除く
    str[remove_target - 1, 1] = ''
    # 結果を出力
    puts str
  end
end
