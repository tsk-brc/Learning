=begin
  入場料を計算する。
=end

class MissionD155

   def run
     # 入場する人数
     person = STDIN.gets.to_i
     # 指定されたリスト[団体料金が適用される人数の下限 団体料金 個人料金]
     show_list = STDIN.gets
     # 空白区切りで配列に格納
     list = show_list.split
     # 合計金額
     money = 0
     # 団体料金が適用されるか
     if person >= list[0].to_i
       money = person * list[1].to_i
     else
       money = person * list[2].to_i
     end
     # 結果を出力
     puts money
   end
end
