=begin
  ストラックアウトを行い、抜かれたパネルの合計を求める。
=end
class MissionC089
  def run
    # ボードのサイズ(縦 横)
    board_size = $stdin.gets.split.map!(&:to_i)
    # 各ボードに的中したかどうかを表す配列
    hit_score_board = []
    # 各ボードに書かれたスコアを表す配列
    score_board = []
    # 合計得点
    score = 0
    # 各ボードに的中したかの結果を格納
    board_size[0].times{
      hit_score_board << $stdin.gets
    }
    # 各ボードのスコアを格納
    board_size[0].times{
      score_board << $stdin.gets.split.map!(&:to_i)
    }
    # 的中したボードのスコアを加算していく
    board_size[0].times{ |num1|
      board_size[1].times{ |num2|
        score += score_board[num1][num2] if  hit_score_board[num1][num2, 1] == 'o'
      }
    }
    puts score
  end
end
