=begin
  チャンネル登録者数が目標値を超えたかどうかを求める。
=end

class MissionD150

  def run
    # 登録者数
    subscribers = STDIN.gets.to_i
    # 目標数
    target = STDIN.gets.to_i
    # 目標に到達しているか判定
    puts subscribers >= target ? 'Thank you' : target - subscribers
  end
end