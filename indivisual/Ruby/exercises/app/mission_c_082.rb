=begin
  各生徒の赤点の強化数を算出する。
  赤点は各教科の得点下位N位までの生徒を赤点としN位の生徒が複数いた場合は、その全員が赤点となる。
  例えば、全員が同じ点数だった場合は全員が下から1位なので全員赤点となる。
=end

class MissionC082
  def run
    # 受験人数と赤点になる人数(受験人数 赤点)
    scoreInfo = $stdin.gets.split
    # 受験者の各教科の得点を格納する配列
    score = []
    # 受験者が赤点になった教科数を格納する配列
    failedScore = []
    # 受験人数分各教科の得点を配列に格納(国語 数学 英語)
    scoreInfo[0].to_i.times do |num1|
      score[num1] = $stdin.gets.split
      # 比較前は赤点教科数が0なので0を格納しておく
      failedScore[num1] = 0
    end
    # 受験教科は国数英の3教科なので3回ループ
    3.times do |subject|
      # 全受験者の対象教科の得点を格納する配列
      allStudentScore = []
      # 全受験者の対象教科の得点を配列に格納
      scoreInfo[0].to_i.times do |num2|
        # 数値化して格納
        allStudentScore[num2] = score[num2][subject].to_i
      end
      # 得点数でソート
      allStudentScore.sort!
      # 赤点の得点(最低点が0点なので初期値は-1とする)
      targetScore = -1
      # 赤点となる対象分だけループ
      scoreInfo[1].to_i.times do |target|
        # 各生徒の得点を比較
        scoreInfo[0].to_i.times do |num3|
          # 赤点の得点だった場合に赤点の教科数を1加算する
          if allStudentScore[target] == score[num3][subject].to_i &&
            targetScore != allStudentScore[target]
            failedScore[num3] += 1
          end
        end
        # 赤点となる得点で更新(同じ点数だった場合重複カウントしないようにここでセットする)
        targetScore = allStudentScore[target]
      end
    end
    # 各生徒の赤点の科目数を出力
    scoreInfo[0].to_i.times do |num4|
      puts failedScore[num4]
    end
  end
end
