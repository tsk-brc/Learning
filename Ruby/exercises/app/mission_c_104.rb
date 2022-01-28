=begin
  xy * y = axbを満たす(x,y)の組み合わせが存在するかチェックする。
=end
class MissionC104
  def run
    # (a, b)のそれぞれの値
    input_line = $stdin.gets.split.map!(&:to_i)
    # xの初期値
    num1 = 0
    # yの初期値
    num2 = 0
    # 1〜9までチェックする(x, yは共に0になりえないのでチェック不要)
    (1..9).each do |num3|
      (1..9).each do |num4|
        # xy * y = axbの条件を満たしたら初期値を更新
        if (num3 * 10 + num4) * num4 == input_line[0] * 100 + num3 * 10 + input_line[1]
          num1 = num3
          num2 = num4
          break
        end
      end
    end
    # 結果を出力
    puts num1 != 0 ? num1.to_s + ' ' + num2.to_s : 'No'
  end
end
