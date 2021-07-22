=begin
  黒電話を使用して電話をかけるときにダイヤルが回る距離を求める。
=end
class MissionC090
  def run
    # 電話番号
    tel_num = $stdin.gets.chomp!
    # 移動距離の合計
    total = 0
    # 各番号を入力した時の移動距離
    distance = [12, 3, 4, 5, 6, 7, 8, 9, 10, 11]
    # 電話番号の桁数分ループ
    tel_num.length.times { |num|
      # '-'以外ならその番号に合わせた移動距離を加算する。
      # 黒電話は回した後に初期位置に戻るので距離は2倍になる。
      total += distance[tel_num[num, 1].to_i] * 2 if tel_num[num, 1] != '-'
    }
    # 結果を出力
    puts total
  end
end
