=begin
  持ち時間の間に最大何曲を演奏できるかを算出する。
=end
class MissionC100
  def run
    # 必要情報(曲数 最大演奏時 最大演奏分)
    info = $stdin.gets.split.map!(&:to_i)
    # 最大演奏時間を分に変換
    max_min = info[1] * 60 + info[2]
    # 最大演奏曲数
    count = 0
    # 各曲の演奏時間を格納する配列
    record_min = []
    # 曲数分ループ
    info[0].times {
      # 1曲の時間
      song_time = $stdin.gets.split.map!(&:to_i)
      # 時間を分に変換
      record_min << song_time[0] * 60 + song_time[1]
    }
    # 曲時間が短い順にソート
    record_min.sort!
    # 曲数分ループ
    info[0].times { |i|
      # 演奏可能かどうか
      if max_min >= record_min[i]
        max_min -= record_min[i]
        count += 1
      else
        break
      end
    }
    # 最大演奏曲数を出力
    puts count
  end
end
