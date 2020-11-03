=begin
  正しいボタンを何回押したか判定するゲームを行う。
  M個のボタンを1番目からN番目まで順に押し、N番目までボタンを押した次は1番目のボタンを押すこととする。
  スコアは正しいボタンを押した回数*1000点でゲームオーバーになった場合には-1点とする。
=end
class MissionC080
  def run
    # ゲームのルール(ボタンの個数 ゲームオーバーになる不正解数)
    game_rule = STDIN.gets.split
    # ボタンを押した回数
    push_button_count = STDIN.gets.to_i
    # 正解のボタン番号
    should_push_button_number = 1
    # 不正解数
    wrong_count = 0
    # 合計得点
    score = 0
    # 押したボタン
    push_button = STDIN.gets.split
    # ボタンを押した回数分ループ
    push_button_count.times do |num|
      # 押したボタンの正誤判定(正解なら+1000点、不正解なら不正解数を1プラスする)
      if push_button[num].to_i == should_push_button_number
        score += 1000
      else
        wrong_count += 1
      end
      # 不正解数がゲームオーバーの回数に到達したらループを抜ける
      break if wrong_count == game_rule[1].to_i
      # 次に正解になるボタン番号を更新
      should_push_button_number == game_rule[0].to_i ? should_push_button_number = 1 : should_push_button_number += 1
    end
    # スコアを出力
    puts wrong_count != game_rule[1].to_i ? score : -1
  end
end
