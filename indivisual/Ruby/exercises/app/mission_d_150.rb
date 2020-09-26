=begin
  チャンネル登録者数が目標値を超えたかどうかを求める。
=end

# 登録者数
subscribers = gets.to_i
# 目標数
target = gets.to_i
# 目標に到達しているか判定
if subscribers >= target
  puts "Thank you"
else
  puts target - subscribers
end