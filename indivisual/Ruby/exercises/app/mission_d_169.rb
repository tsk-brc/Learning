=begin
  寒暖差を出力する。
=end

class MissionD169
  def run
    # 気温情報(最高気温 最低気温)
    temperature_list = $stdin.gets.split.map!(&:to_i)
    # 1日の気温差を出力
    puts temperature_list[0] - temperature_list[1]
  end
end
