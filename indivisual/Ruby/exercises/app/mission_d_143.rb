=begin
  制動距離を計算する。
=end

class MissionD143
  def run
    # パラメータ(重さ 速度 ブレーキの強さ)
    param = $stdin.gets.split.map!(&:to_i)
    # 計算式に当てはめる(L=mv^2/2f)
    puts param[0] * param[1] ** 2 / (2 * param[2])
  end
end
