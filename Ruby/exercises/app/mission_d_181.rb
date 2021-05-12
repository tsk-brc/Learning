=begin
  電話番号を'-'付きで出力する。
=end

class MissionD181
  def run
    # 電話番号の要素を格納する配列
    tel_num = []
    # 各要素を配列に格納
    3.times {
      tel_num << $stdin.gets.chomp
    }
    # '-'区切りで出力
    puts tel_num.join('-')
  end
end
