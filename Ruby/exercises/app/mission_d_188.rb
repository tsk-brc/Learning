=begin
  ブラックジャックのスコアを出力する。
=end

class MissionD188
  def run
    # 1枚目のカード
    card1 = $stdin.gets.to_i
    # 2枚目のカード
    card2 = $stdin.gets.to_i
    # カードの結果を出力
    puts card1 + card2 == 21 ? 'Win' : card1 + card2
  end
end
