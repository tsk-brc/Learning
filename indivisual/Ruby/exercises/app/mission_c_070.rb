=begin
  簡易ポーカーを行う。ルールは以下の通り。
  ・手札が4枚で、この4枚の組み合わせにより以下の5種類の役が存在する。
    ・Four Card：同じ数字4枚からなる役
    ・Three Card：同じ数字3枚とそれ以外の数字1枚からなる役
    ・Two Pair：同じ数字2枚のペア2つからなる役
    ・One Pair：同じ数字2枚とそれ以外の相異なる数字2枚からなる役
    ・No Pair：上の4つ以外(4枚が全て相異なる数字)
  ・簡易ポーカーでは手札4枚の数字を小さい順に並べたものが配られる。
=end

class MissionC070

  def run
    # ゲームの回数
    count = STDIN.gets
    # ゲームの回数分ループ
    count.to_i.times do |num|
      # 配られたカード
      data = STDIN.gets
      # 配られたカードの1枚目
      one = data[0,1]
      # 配られたカードの2枚目
      two = data[1,1]
      # 配られたカードの3枚目
      three = data[2,1]
      # 配られたカードの4枚目
      four = data[3,1]
      # Pair check
      if one == two and two == three and three == four
        puts "Four Card"
      elsif (one == two and two == three) or (two == three and three == four)
        puts "Three Card"
      elsif one == two and  three == four
        puts "Two Pair"
      elsif one == two or two == three or three == four
        puts "One Pair"
      else
        puts "No Pair"
      end
    end
  end
end