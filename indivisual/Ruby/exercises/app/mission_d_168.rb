=begin
  アメリカ形式で日付を出力する。
=end

class MissionD168
  def run
    # 年情報
    year = STDIN.gets.chomp!
    # 月情報
    month = STDIN.gets.chomp!
    # 日情報
    day = STDIN.gets.chomp!
    # アメリカ形式で出力
    puts month + '/' + day + '/' + year
  end
end
