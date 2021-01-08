=begin
  アメリカ形式で日付を出力する。
=end

class MissionD168
  def run
    # 年情報
    year = $stdin.gets.chomp!
    # 月情報
    month = $stdin.gets.chomp!
    # 日情報
    day = $stdin.gets.chomp!
    # アメリカ形式で出力
    puts month + '/' + day + '/' + year
  end
end
