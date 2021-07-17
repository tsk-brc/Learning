=begin
  ボブとアリスがテストの点数で勝負をし、どちらが勝ったか、あるいは引き分けたかを求める。
  ただし、テストの点数をそのまま比較するのではなく、テストの点数の各桁の数を足した数の一の位で勝負する。
  例えば、85点であれば 8 + 5 = 13、13の一の位である3が勝負する際の点となる。
=end
class MissionC093
  def run
    # 各人のスコア(ボブの点数 アリスの点数)
    scores = $stdin.gets.split
    # それぞれの最終的に使用する点
    bob_score = 0
    alice_score = 0
    # 各桁の数を足す
    scores[0].length.times { |num|
      bob_score += scores[0][num, 1].to_i
    }
    scores[1].length.times { |num|
      alice_score += scores[1][num, 1].to_i
    }
    # 勝者を求める
    if (bob_score % 10) > (alice_score % 10)
      puts 'Bob'
    elsif (alice_score % 10) > (bob_score % 10)
      puts 'Alice'
    else
      puts 'Draw'
    end
  end
end
