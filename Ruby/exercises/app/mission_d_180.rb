=begin
  楽器同士のうなりを求める。
=end

class MissionD180
  def run
    # 楽器の高さ
    info = $stdin.gets.split.map!(&:to_i)
    # うなりを求める(|F1 - F2|)
    puts (info[0] - info[1]).abs
  end
end
