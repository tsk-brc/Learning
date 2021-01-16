=begin
  トレーディングカードを購入し、何枚目でコンプリートできたかを調査する。
=end
class MissionC079
  def run
    # カードを手に入れた枚数とカードの種類
    cardInfo = $stdin.gets.split.map!(&:to_i)
    # 手にしたカードのリスト
    cardlist = []
    # コンプリートできなかったか(初期値はカードを1枚も持っていないのでtrue)
    nonCompFlg = true
    # 手にしたカードの枚数分だけループ
    cardInfo[0].times do |num|
      # 所持カード枚数を取得
      list = cardlist.size
      # カードをリストに格納
      cardlist[list] = $stdin.gets.to_i
      # 重複を破棄
      cardlist.uniq!
      # カードをコンプリートしたか(重複削除した枚数がカードの種類と一致するか)
      if cardlist.size == cardInfo[1]
        # フラグを変更
        nonCompFlg = false
        # 何枚目で揃ったかを出力してループを抜ける
        puts num + 1
        break
      end
    end
    # 揃わなかったら出力
    if nonCompFlg
      puts 'unlucky'
    end
  end
end
