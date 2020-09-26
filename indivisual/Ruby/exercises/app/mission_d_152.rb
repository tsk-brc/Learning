=begin
  ある文字列にRが指定した数以上含まれているかチェックする。
=end

# 対象文字列
str = gets
# 判定する数
check = gets.to_i
# 指定数以上含まれているか
if str.count('R') >= check
  puts 'Yes'
else
  puts 'No'
end