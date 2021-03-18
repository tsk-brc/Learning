=begin
  文字盤から特定の単語を見つける。
  ただし、特定の単語は「文字盤を特定の位置から右下方向に読んだ」時に見つかるものとする。
=end

class MissionB089
  def run
    # (文字盤の1辺の長さ 探す文字列の数)
    info = $stdin.gets.split.map!(&:to_i)
    # 文字盤の情報
    dial = []
    # 文字盤情報を格納
    info[0].times {
      dial << $stdin.gets.chomp!
    }
    # 探す文字列の数だけループ
    info[1].times{ |num1|
      # 対象の文字列
      target = $stdin.gets.chomp!
      # 斜めに探索できる回数だけループ
      (info[0] - target.length + 1).times { |num2|
        (info[0] - target.length + 1).times { |num3|
          # 斜めに探索した時に出来上がる文字列
          make_str = ''
          # 対象の文字列を文字盤から取得
          target.length.times { |num4|
            make_str += dial[num2 + num4][num3 + num4, 1]
          }
          # 一致したら最初の1文字目の場所を出力
          if target == make_str
            puts (num3 + 1).to_s + ' ' + (num2 + 1).to_s
            break
          end
        }
      }
    }
  end
end
