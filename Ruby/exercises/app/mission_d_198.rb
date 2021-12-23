=begin
  日付形式にして出力をする。
=end

class MissionD198
  def run
    # 月
    month = $stdin.gets.chomp!
    # 日
    day = $stdin.gets.chomp!
    # 日付形式にして出力
    puts "#{month}/#{day}"
  end
end
