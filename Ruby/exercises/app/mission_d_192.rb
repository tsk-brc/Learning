=begin
  文字列に感嘆符を付与する。
=end

class MissionD192
  def run
    # 対象の文字列
    str = $stdin.gets.chomp!
    # 感嘆符を付与して出力
    puts "#{str}!"
  end
end
