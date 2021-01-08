=begin
  売上データを棒グラフで表示する。
=end

class MissionC083
  def run
    # 売上データの個数とグラフの表示単位
    data = $stdin.gets.split
    # グラフ目盛りの最大値
    maxNum = 0
    # 売り上げを格納する配列
    money = []
    # データの個数分ループ
    data[0].to_i.times do |num|
      # 売り上げの配列に格納
      money.push($stdin.gets.to_i / data[1].to_i)
      # グラフ目盛りの最大値を更新
      maxNum = money[num] if maxNum < money[num]
    end
    # データの個数分ループ
    data[0].to_i.times do |num2|
      # 仮データとして'.'で目盛りの最大まで文字列を作成
      str = '.' * maxNum
      # 実データ分'*'に置換
      money[num2].times do |num3|
        str[num3] = '*'
      end
      # 結果を出力
      puts (num2 + 1).to_s + ':' + str
    end
  end
end
