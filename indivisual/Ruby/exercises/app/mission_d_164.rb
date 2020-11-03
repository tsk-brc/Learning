=begin
   2のn乗で割れる数字かどうかをチェックする。
=end

class MissionD164
  def run
    # 対象の数字
    num = STDIN.gets.to_i
    # 値が1になるまで2で割り続ける
    while num > 1 do
      if num % 2 == 0
        num /= 2
        if num == 1
          puts 'OK'
        end
      else
        puts 'NG'
        break
      end
    end
  end
end
