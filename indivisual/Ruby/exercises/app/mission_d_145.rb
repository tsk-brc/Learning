=begin
  ゲームプレイヤーはスタミナのポイントNを所持しており、1プレイあたりMポイントを消費する。
  何回プレイ出来るかを出力する
=end

class MissionD145
  def run
    # パラメータ
    param = $stdin.gets.split
    # プレイ回数算出
    puts param[0].to_i / param[1].to_i
  end
end
