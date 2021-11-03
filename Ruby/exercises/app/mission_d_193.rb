=begin
  購入した電池で何回交換可能かを調べる。
=end

class MissionD193
  def run
    # 1回の交換で必要な電池数
    need_batteries = $stdin.gets.to_i
    # 購入した電池数
    bought_batteries = $stdin.gets.to_i
    # 交換可能な回数と余りの電池数を出力
    puts bought_batteries / need_batteries
    puts bought_batteries % need_batteries
  end
end
