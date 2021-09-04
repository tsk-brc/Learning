=begin
  何周年かを算出する。
=end

class MissionD189
  def run
    # 開始年
    start_year = $stdin.gets.to_i
    # 確認年
    end_year = $stdin.gets.to_i
    # 何周年か算出
    puts end_year - start_year
  end
end
