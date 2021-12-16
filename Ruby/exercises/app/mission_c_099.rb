=begin
  折り紙を重ねていった時の最終的な面積を求める。
=end
class MissionC099
  def run
    # 各情報(折り紙の枚数 1辺の長さ)
    info = $stdin.gets.split.map!(&:to_i)
    # 縦の長さ(不変)
    width = info[1]
    # 横の長さ(重ねていった時に変わるので仮の値)
    length = info[1]
    # (枚数 - 1)枚分ループ
    (info[0] - 1).times {
      # 重なっていない分だけ横の長さを加算
      length += (info[1] - $stdin.gets.to_i)
    }
    # 面積を出力
    puts width * length
  end
end
