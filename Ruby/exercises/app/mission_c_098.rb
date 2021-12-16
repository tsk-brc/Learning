=begin
  各プレイヤーがボールを渡していき、各プレイヤーの最終的な所持数をチェックする。
=end
class MissionC098
  def run
    # プレイヤーの数
    player = $stdin.gets.to_i
    # 各プレイヤーが持っているボールの数
    have_ball = []
    # 各プレイヤーが持っているボールの数を配列に格納
    player.times {
      have_ball << $stdin.gets.to_i
    }
    # ボールを渡す回数
    give_balls_count = $stdin.gets.to_i
    # 回数分ループ
    give_balls_count.times {
      # ボールを渡す情報(送り手 受け手 個数)
      info = $stdin.gets.split.map!(&:to_i)
      # 所持個数によって場合分け
      if have_ball[info[0] - 1] >= info[2]
        have_ball[info[0] - 1] -= info[2]
        have_ball[info[1] - 1] += info[2]
      else
        have_ball[info[1] - 1] += have_ball[info[0] - 1]
        have_ball[info[0] - 1] = 0
      end
    }
    # 各プレイヤーが持っている個数を出力
    player.times { |i|
      puts have_ball[i]
    }
  end
end
