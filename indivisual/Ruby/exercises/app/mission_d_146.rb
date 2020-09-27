=begin
  単語の省略形を作成する。
=end

class MissionD146

  def run
    # 対象の言葉
    str = STDIN.gets.chomp!
    # 省略形
    abbreviation = ''
    # 母音を削除
    str.length.times do |num|
      if str[num, 1] != 'a' && str[num, 1] != 'i' && str[num, 1] != 'u' && str[num, 1] != 'e' && str[num, 1] != 'o'
        abbreviation << str[num, 1]
      end
    end
    puts abbreviation
  end
end