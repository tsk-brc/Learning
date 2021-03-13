=begin
  通信料金を算出する。
=end

class MissionD177
  def run
    # 通信情報(1GBあたりの料金 使用量)
    info = $stdin.gets.split.map!(&:to_i)
    # 通信料金を出力
    puts info[0] * info[1]
  end
end
