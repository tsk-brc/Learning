=begin
  バレンタインデーにもらったお菓子のお返しの値段を算出する。
=end

class MissionD151
  def run
    # もらったお菓子
    item = STDIN.gets.chomp
    # もらったお菓子の価格
    price = STDIN.gets.to_i
    # もらったお菓子によってお返しの額を算出する
    if item == 'chocolate'
      puts price * 2
    elsif  item == 'cake'
      puts price * 5
    else
      puts '不正な入力です'
    end
  end
end
