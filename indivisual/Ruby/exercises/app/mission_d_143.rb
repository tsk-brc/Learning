=begin
  制動距離を計算する。
=end

class MissionD143
  def run
    # パラメータ(重さ 速度 ブレーキの強さ)
    param = STDIN.gets.split
    # 計算式に当てはめる(L=mv^2/2f)
    puts param[0].to_i * param[1].to_i**2 / (2 * param[2].to_i)
  end
end
