=begin
  グルメサイトから行きたいお店を探す。
  なお、グルメサイトは以下のルールで評価をつけることができる。
  ・各ユーザはお店を0〜3の4段階で評価することができる。
    ただし、行ったことのないお店の評価は0となり、行ったことのあるお店は1から3で評価することができる。
  今回は自分が行ったことのないお店かつ自分の好みが似ているユーザの評価が3であるお店を探すこととする。
  なお、「好みが似ている」とは、あるユーザーに対し、自分とそのユーザの両方とも評価3をつけたお店の数がM以上であるとき、
  「好みが似ているユーザ」と定義する。
=end

class MissionB084
  def run
    # 各情報のリスト(店数 自分以外のユーザー数 好みの基準M)
    info_list = $stdin.gets.split
    # 入力情報を各変数に分割
    shop = info_list[0].to_i
    user = info_list[1].to_i
    target = info_list[2].to_i
    # 自分の各店舗の評価
    myself_info = $stdin.gets.split
    # 行きたいお店の配列
    wanna_go_shop_list = []
    # その他のユーザ数分ループ
    user.times { |num|
      # 好みが一致する店舗数
      count = 0
      # あるユーザに対しての行きたいお店を格納する配列
      wanna_go_shop = []
      # あるユーザの各店舗の評価
      target_info = $stdin.gets.split
      # 店舗数分ループ
      shop.times { |num2|
        # 評価がどちらも3ならば好みの数に加算
        count += 1 if myself_info[num2].to_i == target_info[num2].to_i &&
        myself_info[num2].to_i == 3
        # 自分が行ったことないかつユーザの評価が3の店舗番号を追加
        wanna_go_shop << num2 + 1 if myself_info[num2].to_i == 0 &&
        target_info[num2].to_i == 3
      }
      # 好みの数が一定数以上なら行きたいお店の配列に追加([1,2,[3,4]]のような多次元配列になる場合あり)
      wanna_go_shop_list << wanna_go_shop if count >= target
    }
    # 多次元配列を一次元配列に戻す
    wanna_go_shop_list.flatten!
    # 重複を削除し、店舗番号昇順にして出力
    puts wanna_go_shop_list.size != 0 ?
    wanna_go_shop_list.uniq.sort.join(' ') : 'no'
  end
end
