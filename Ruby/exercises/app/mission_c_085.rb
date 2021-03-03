=begin
  キーボード入力した時の文字列を出力する。
  ただし、キーにはそれぞれ耐久度があり、キーを1回打つと、そのキーの耐久度が1減少する。
  耐久度が0になると、そのキーを入力しても何も反応しない。
  また、キーボードはアルファベット入力のみを行うものとする。
=end

class MissionC085
  def run
    # 各キーの耐久度
    durability = $stdin.gets.split.map(&:to_i)
    # アルファベットを格納する配列
    alphabet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
    'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    # 入力したキー
    input_key = $stdin.gets.chomp!
    # 出力する文字列
    str = ''
    # 入力したキー分だけループ
    input_key.size.times do |num|
      # アルファベットのマッチに使用するフラグ
      unmatchFlg = true
      # アルファベットの配列から何番目を取得するか
      count = 0
      # マッチするまでループ
      while unmatchFlg do
        # 入力したキーのアルファベットとアルファベットの配列が一致するか
        if input_key[num, 1] == alphabet[count]
          # 入力したキーに耐久度があるか
          if durability[count] > 0
            # 耐久度があれば出力文字列に反映し、耐久度を1減らす
            str << input_key[num, 1]
            durability[count] -= 1
          end
          # マッチしたのでフラグを折る
          unmatchFlg = false
        else
          # アンマッチなら次のアルファベットを探索するためインクリメント
          count += 1
        end
      end
    end
    # 文字列出力
    puts str
  end
end
