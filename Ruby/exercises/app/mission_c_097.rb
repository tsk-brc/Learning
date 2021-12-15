=begin
  商品のAとBのどちらが当選したかを算出する。
=end
class MissionC097
  def run
    # 入力情報(応募者 Aの当選者 Bの当選者)
    info = $stdin.gets.split.map!(&:to_i)
    # 応募者数分ループ
    info[0].times { |i|
      # どの商品に当選したか
      if (i + 1) % info[1] == 0 && (i + 1) % info[2] == 0
        puts 'AB'
      elsif (i + 1) % info[1] == 0
        puts 'A'
      elsif (i + 1) % info[2] == 0
        puts 'B'
      else
        puts 'N'
      end
    }
  end
end
