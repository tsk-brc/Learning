=begin
  ロボットがする動作を把握する。
  なお、ロボットはM倍数秒経過する度に、それぞれに設定された動作を行うものとし、
  複数の動作が起きる時間には、登録された順に全ての動作を行うものとする。
=end
class MissionC103
  def run
    # 必要情報(作動時間 動作数)
    info = $stdin.gets.split
    # 動作の情報を格納する配列
    action = []
    # 動作数分ループ
    info[1].to_i.times {
      # 動作情報(動作の規則 動作名)
      action << $stdin.gets.split
    }
    # 作動時間分ループ
    (1..info[0].to_i).each do |num1|
      # 動作内容の初期値
      print_str = ''
      # 動作数分ループしてチェック
      info[1].to_i.times { |num2|
        # 動作時間になっているか(複数ある場合はスペース区切りで追加)
        print_str.empty? ? print_str << action[num2][1] : print_str << ' ' + action[num2][1] \
          if num1 % action[num2][0].to_i == 0
      }
      # 結果を出力
      puts print_str.empty? ? num1 : print_str
    end
  end
end
