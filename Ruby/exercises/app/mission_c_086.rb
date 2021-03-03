=begin
  文字列から母音を取り除く。
=end

class MissionC086
  def run
    # 対象の文字列
    str = $stdin.gets.chomp
    # 小文字の母音を削除
    del_lower_str = str.delete('a-z', '^b-d', '^f-h', '^j-n', '^p-t', '^v-z')
    # 大文字の母音を削除して出力
    puts del_lower_str.delete('A-Z', '^B-D', '^F-H', '^J-N', '^P-T', '^V-Z')
  end
end
