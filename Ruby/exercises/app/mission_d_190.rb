=begin
  長さのcmをmmに変換する。
=end

class MissionD190
  def run
    # 長さ(cm)
    length = $stdin.gets.to_i
    # mmに変換
    puts length * 10
  end
end
