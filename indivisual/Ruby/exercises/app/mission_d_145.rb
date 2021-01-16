=begin
  ゲームプレイヤーはスタミナのポイントNを所持しており、1プレイあたりMポイントを消費する。
  何回プレイ出来るかを出力する
=end

class MissionD145
  def run
    # パラメータ
    param = $stdin.gets.split.map!(&:to_i)
    # プレイ回数算出
    puts param[0] / param[1]
  end
end
