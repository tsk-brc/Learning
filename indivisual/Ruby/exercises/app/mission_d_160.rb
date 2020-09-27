=begin
  現在山の何mの高さにいるかを求める。
=end

class MissionD160

  def run
    # 山の高さ
    height = STDIN.gets.to_i
    # 何合目にいるか
    nowPosition = STDIN.gets.to_i
    # 高さを算出
    puts height / 10 * nowPosition
  end
end
