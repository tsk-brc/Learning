=begin
  室内の快適な湿度を保つためのチェックを行う。
=end

class MissionD158
  def run
    # 湿度の値
    humidity = STDIN.gets.to_i
    # 湿度チェック
    puts (humidity >= 40 && humidity <= 60) ? 'OK' : 'NG'
  end
end
