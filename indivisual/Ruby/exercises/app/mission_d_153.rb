=begin
  2番目に値の小さい数字を出力する。
=end

# 値を受け取る
nums = gets
# 数値としてソート
sort_nums = nums.split.sort{|a, b| a.to_i <=> b.to_i }
# 2番目の値を出力
puts sort_nums[1]