=begin
  1年のうち幸運な日がいくつあるかを算出する。
  なお、幸運な日の定義は、1月1日からの経過日数Xが含まれるものとする。
=end
class MissionC101
  def run
    # 幸運な日(1/1から何日目か)
    lucky_day = $stdin.gets.chomp!
    # 幸運な日の数
    count = 0
    # 1年分ループ(1/1は0日目とカウント)
    365.times { |i|
      count += 1 if i.to_s.include?(lucky_day)
    }
    # 結果を出力
    puts count
  end
end
