=begin
  家族全員が休みの日があるかどうかをチェックする。
=end
class MissionC096
  def run
    # 家族の人数
    family_num = $stdin.gets.to_i
    # 各人の休暇開始日
    start_date = []
    # 各人の休暇終了日
    end_date = []
    # 全員休みの日があるか
    family_holiday_check_flg = false
    # 各人の休暇開始日と終了日を配列に格納
    family_num.times {
      holiday = $stdin.gets.split.map!(&:to_i)
      start_date << holiday[0]
      end_date << holiday[1]
    }
    # 対象となる人の休みと被っている日にちがあるかをチェック
    start_date[0].upto(end_date[0]) { |i|
      family_num.times { |j|
        family_holiday_check_flg = start_date[j] <= i && end_date[j] >= i ? true : false
        break unless family_holiday_check_flg
      }
      break if family_holiday_check_flg
    }
    # 結果を出力
    puts family_holiday_check_flg ? 'OK' : 'NG'
  end
end
