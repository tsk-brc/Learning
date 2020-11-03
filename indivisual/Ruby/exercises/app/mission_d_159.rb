=begin
  文字の最大長を求める。
=end

class MissionD159
  def run
    # 各文字の文字数を取得
    str1_length = STDIN.gets.chomp.length
    str2_length = STDIN.gets.chomp.length
    str3_length = STDIN.gets.chomp.length
    # 文字数比較
    if (str1_length >= str2_length) && (str1_length >= str3_length)
      puts str1_length
    elsif str2_length >= str3_length
      puts str2_length
    else
      puts str3_length
    end
  end
end
