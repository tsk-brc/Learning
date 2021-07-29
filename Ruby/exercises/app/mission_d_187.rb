=begin
  曲名と歌手名を1行で出力する。
=end

class MissionD187
  def run
    # 曲名
    title = $stdin.gets.chomp
    # 歌手名
    singer = $stdin.gets.chomp
    # 1行で出力
    puts "#{title}/#{singer}"
  end
end
