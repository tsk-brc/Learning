=begin
  学生のレポートを採点する。
  出題したレポートにはn問の問題があり、1問あたりの配点はそれぞれ100/n点とする。
  また、提出期限から遅れたレポートのうち、遅れた日数が9日以下のレポートは得点を8割とし、
  10日以上遅れたレポートの評価は0点とする。
=end
class MissionC077
  def run
    # 学生の人数とレポートの問題数の情報
    information = STDIN.gets.split
    # 学生分ループ
    information[0].to_i.times {
      # レポートの提出期限までの日とレポートの正解問題数
      score = STDIN.gets.split
      # レポートの提出期限から9日以内過ぎての提出の場合は得点を8割にする
      if score[0].to_i >= 1 && score[0].to_i <= 9
        score[1] = 100 / information[1].to_f * score[1].to_i * 0.8
      # レポートの提出期限から10日以上過ぎての提出の場合は得点を0点にする
      elsif score[0].to_i >= 10
        score[1] = 0
      # レポートの提出期限までの提出はそのままの得点とする
      else
        score[1] = 100 / information[1].to_f * score[1].to_i
      end
      # 得点による評価を出力
      if score[1] >= 80
        puts 'A'
      elsif score[1] >= 70
        puts 'B'
      elsif score[1] >= 60
        puts 'C'
      else
        puts 'D'
      end
    }
  end
end
