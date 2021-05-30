=begin
  ベルトコンベアで運べない商品の数を調べる。
  なお、ベルトコンベアは、あらかじめ進行方向が設定されており。同時に複数の方向に進むことはできない。
  また、ベルトコンベアの進みたい方向とそれぞれのコンベータが進みたい方向が一致している場合にのみ
  その部品は進むことができる。
=end
class MissionC092
  def run
    # 入力情報(スケジュールされた回数 conveyor_1で取り扱う商品数 conveyor_2で取り扱う商品数)
    info = $stdin.gets.split.map!(&:to_i)
    # コンベータの移動方向が設定されたスケジュール
    move_schedule = $stdin.gets.chomp
    # コンベータ1の情報
    conveyor_1 = $stdin.gets.chomp
    # コンベータ2の情報
    conveyor_2 = $stdin.gets.chomp
    # スケジュールされたものとコンベータ1が一致した回数
    match1 = 0
    # スケジュールされたものとコンベータ2が一致した回数
    match2 = 0
    # それぞれのコンベータが一致した回数を求める
    info[0].times { |num|
      match1 += 1 if move_schedule[num, 1] == conveyor_1[match1, 1]
      match2 += 1 if move_schedule[num, 1] == conveyor_2[match2, 1]
    }
    # 一致した回数を出力
    puts (info[1] - match1).to_s + ' ' + (info[2] - match2).to_s
  end
end
