=begin
  2番目に値の小さい数字を出力する。
=end

class MissionD153
  def run
    # 値を受け取る
    nums = $stdin.gets.split.map!(&:to_i)
    # 数値としてソート
    sort_nums = nums.sort { |a, b| a <=> b }
    # 2番目の値を出力
    puts sort_nums[1]
  end
end
