=begin
  タイトルの長さが20文字以内かチェックする。
=end

class MissionD176
  def run
    title = $stdin.gets.chomp!
    puts title.length <= 20 ? 'OK' : 'NG'
  end
end
