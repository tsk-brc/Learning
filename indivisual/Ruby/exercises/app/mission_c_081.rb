=begin
  靴下のペア数を算出する。
=end
class MissionC081
  def run
    # 靴下の数
    sox_num = $stdin.gets.to_i
    # 靴下のペア数
    sox_pair = 0
    # 右足の靴下を入れておく配列
    right_sox = []
    # 左足の靴下を入れておく配列
    left_sox = []
    # 靴下の数分ループ
    sox_num.times {
      # 靴下の情報(色 どちらの足か)
      sox_info = $stdin.gets.split
      # 右足なら左足にペアがあるか検索
      if sox_info[1] == 'R'
        # 存在したらペア数を追加し、左足の配列からその色を削除
        if left_sox.include? sox_info[0]
          sox_pair += 1
          left_sox.delete_at(left_sox.index(sox_info[0]))
        # 存在しなければ配列に追加
        else
          right_sox << sox_info[0]
        end
      # 左足なら右足にペアがあるか検索
      else
        # 存在したらペア数を追加し、右足の配列からその色を削除
        if right_sox.include? sox_info[0]
          sox_pair += 1
          right_sox.delete_at(right_sox.index(sox_info[0]))
        else
          # 存在しなければ配列に追加
          left_sox << sox_info[0]
        end
      end
    }
    # ペア数を出力
    puts sox_pair
  end
end
