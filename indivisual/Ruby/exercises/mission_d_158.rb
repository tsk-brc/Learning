=begin
  室内の快適な湿度を保つためのチェックを行う。
=end

# 湿度の値
humidity = gets.to_i
# 湿度チェック
if humidity >= 40 && humidity <= 60
  puts "OK"
else
  puts "NG"
end