=begin
  対象の文字列の中に、ある文字がn文字目に存在するかどうかを確認する。
=end

class MissionD203
  def run
    # 対象の文字列
    str = $stdin.gets.chomp!
    # 調査する文字
    search_char = $stdin.gets.chomp!
    # 調査する文字目
    position = $stdin.gets.to_i
    # 一致しているかどうか
    puts str.slice(position - 1) == search_char ? 'Yes' : 'No'
  end
end
