=begin
  入場料を計算する。
=end

class MissionD155
  def run
    # 入場する人数
    person = $stdin.gets.to_i
    # 指定されたリスト[団体料金が適用される人数の下限 団体料金 個人料金]
    show_list = $stdin.gets.split.map!(&:to_i)
    # 団体料金が適用されるか
    puts person >= show_list[0] ? person * show_list[1] : person * show_list[2]
  end
end
