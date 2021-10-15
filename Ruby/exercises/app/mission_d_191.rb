=begin
  出社可能かどうかを判定する。
=end

class MissionD191
  def run
    # 体温
    temperature = $stdin.gets.to_f
    # 体温判定
    puts temperature < 37.0 ? 'OK' : 'NG'
  end
end
