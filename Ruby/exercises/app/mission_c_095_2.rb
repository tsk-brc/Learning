=begin
  自分が乗りたい時間に最も近い時間に来るバスの時間を算出する。
=end
class MissionC095_2
  def run
    # 算出情報(バスの時間 乗りたい時間)
    info = $stdin.gets.split.map!(&:to_i)
    # 乗りたいバスの時間(1本目)
    num1 = Float::INFINITY
    # 乗りたいバスの時間(2本目) 存在しない場合もあり
    num2 = Float::INFINITY
    # バスの本数分ループ
    info[0].times {
      # 到着時間
      time = $stdin.gets.to_i
      # 自分が乗りたい時間に最も近いか
      if (info[1] - time).abs < (info[1] - num1).abs
        num1 = time
      elsif (info[1] - time).abs == (info[1] - num1).abs
        num2 = time
      end
    }
    # バスの到着時間を出力
    if num2 != Float::INFINITY && num1 < num2
      puts num1
      puts num2
    elsif num2 != Float::INFINITY && num1 > num2
      puts num2
      puts num1
    else
      puts num1
    end
  end
end
