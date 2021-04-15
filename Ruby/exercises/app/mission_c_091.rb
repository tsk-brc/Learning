=begin
  オレンジの出荷をする時に2つの箱のどちらを使用するかを決定する。
  箱はある倍数の重さの書かれた箱が用意され、
  オレンジの重さに最も近い数の重さに仕分けられる。
  なお、重さが一番近い箱が複数ある場合は重さが大きい方の箱に仕分けられる。
  また、0gの箱に仕分けられるものはないこととする。
=end
class MissionC091
  def run
    # 入力情報(重さが何g単位か オレンジの個数)
    info = $stdin.gets.split.map!(&:to_i)
    # オレンジの個数分ループ
    info[1].times {
      # 出荷するオレンジの重さ
      orange_weight = $stdin.gets.to_i
      # 軽い箱に提示されたグラム数(先に徐算することで小数点以下を切り捨てる)
      lighter = orange_weight / info[0] * info[0]
      # 重い箱に提示されたグラム数
      heavier = (orange_weight / info[0] + 1) * info[0]
      # 軽い箱が0または重い箱に近い値のときは重い箱を使用する
      if lighter == 0 || orange_weight - lighter >= heavier - orange_weight
        puts heavier
      else
        puts lighter
      end
    }
  end
end
