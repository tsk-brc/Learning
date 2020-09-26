=begin
  テレビ電話を用いて行う会議に参加できる残りの人数を求める。
=end
# 画面サイズ
screen_size = gets.to_i
# 現在の参加人数
attendance = gets.to_i
# 参加可能な人数を算出
puts screen_size ** 2 - attendance