=begin
  二人の相性占いをする。占う際のルールは以下の通り
    1. 相性をチェックする二人の名前を結合する。
    2. aを1、bを2...、zを26とアルファベット昇順に文字列を数列に変換する。この数列をNとする。
    3. 数列Nの隣り合う2つの数を足して前から順番に並べた新しい数列N'を作り、これを新たにNとする。
    　　このとき、Nの要素の値が101を超えていた場合、その要素から101を引く。
    4. 数列Nの要素数が1になるまで3.の手順を繰り返し、Nの要素数が1となったときの値を「二人の相性」とする。

   名前の並べ方は2通りあるが、2通りの方法で計算した「二人の相性」のうち大きい方を相性として採用する。
=end

class MissionB079
  def name_score(name1, name2)
    # 2人の名前を結合
    join_name = name1 + name2
    # アルファベットの配列
    alphabet = %w(a b c d e f g h i j k l m n o p q r s t u v w x y z)
    # マッチしたアルファベットを数字に変換した配列
    alphabet_num_convert = []
    # 名前の文字数分ループ
    join_name.length.times { |num|
      # 1文字ずつマッチするアルファベットの番号を配列に格納
      alphabet.size.times { |num2|
        if join_name[num, 1] == alphabet[num2]
          alphabet_num_convert << num2 + 1
          break
        end
      }
    }
    # 配列のサイズが1になるまでループ
    while alphabet_num_convert.size > 1 do
      # 現在の配列数を取得
      loop_count = alphabet_num_convert.size
      # 配列数分ループ
      loop_count.times { |num|
        # 加算した値が101より大きい値なら101を引いてからnum番目の値を置き換え
        # (配列の前から順番に処理しているので、今後のループ処理内でもnum番目の値が置き換わっても影響しない)
        alphabet_num_convert[num] = alphabet_num_convert[num].to_i +
        alphabet_num_convert[num + 1].to_i < 101 ?
          alphabet_num_convert[num].to_i + alphabet_num_convert[num + 1].to_i :
          alphabet_num_convert[num].to_i +
          alphabet_num_convert[num + 1].to_i - 101
      }
      # 値が1つ減るので配列の末尾を削除
      alphabet_num_convert.pop(1)
    end
    # 配列が1つになっているので、格納されている値を呼び出し元に返却
    alphabet_num_convert[0]
  end

  def run
    # 2人の名前の配列
    name = $stdin.gets.split

    # それぞれのパターンのスコアを算出
    pattern1_score = name_score(name[0], name[1])
    pattern2_score = name_score(name[1], name[0])

    # 結果を出力
    puts pattern1_score > pattern2_score ? pattern1_score : pattern2_score
  end
end
