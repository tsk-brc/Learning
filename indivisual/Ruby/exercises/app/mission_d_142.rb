=begin
  必要な電球の数を計算する。
  一定の間隔で電飾を施すことにした場合に必要な電飾の数を求める。
  ただし、左端の木には必ず電飾を施すこととする。
=end

class MissionD142
  def run
    # パラメータ(木の本数 何本おきに電飾を施すか 一本当たるに必要な数)
    param = STDIN.gets.split
    # 必要な電球の数を算出
    puts (param[0].to_f / param[1].to_i).ceil * param[2].to_i
  end
end
