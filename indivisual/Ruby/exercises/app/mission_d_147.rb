=begin
  溜められる水の量を計算する。
  ただし周囲を囲っている高さが不揃いで、一番背の低いところまでしか水がためられないものとする。
=end

class MissionD147

  def run
    # 底面積
    bottomArea = STDIN.gets.to_i
    # 四方の高さ
    heightArray = STDIN.gets.split
    # 四方の高さを格納する配列
    heightArraySort = []
    # 四方の高さをばらして配列に格納
    4.times do |num|
      heightArraySort[num] = heightArray[num].to_i
    end
    # 高さを昇順にソート
    heightArraySort.sort!
    # 底面積×最小の高さ
    puts bottomArea * heightArraySort[0]
  end
end