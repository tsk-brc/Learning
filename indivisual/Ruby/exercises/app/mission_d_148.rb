=begin
  試験の合計点を算出する。
  ただし1つ目の試験で合格点に届かなければ2つ目の試験は採点しない。
=end

class MissionD148
  def run
    # 得点の配列
    scoreArray = STDIN.gets.split
    # 合格点
    targetScore = STDIN.gets.to_i
    # 合計点
    puts scoreArray[0].to_i >= targetScore ?
    scoreArray[0].to_i + scoreArray[1].to_i :
    scoreArray[0].to_i
  end
end
