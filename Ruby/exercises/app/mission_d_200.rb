=begin
  使用した電気量から電気料金を算出する。
  ただし、1kW/hを使用すると25円かかるものとする。
=end

class MissionD200
  def run
    # 使用した電気量
    used_elec = $stdin.gets.to_i
    # 1日の電気料金
    puts used_elec * 25 * 24
  end
end
