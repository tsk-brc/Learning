=begin
  今月の給料を算出する。
  ・9時から17時までの勤務:時給X円(通常の時給)
  ・17時から22時までの勤務:時給Y円(夜の時給)
  ・それ以外の時間の勤務:時給Z円(深夜の時給)
=end

class MissionC076
  def run
    # 時給情報
    salaryPerHour = $stdin.gets.split.map!(&:to_i)
    # 働いた日にち
    workCount = $stdin.gets.to_i
    # 給料の合計
    salary = 0
    # 勤務日数分ループ
    workCount.times {
      # 始業時間と終業時間
      work = $stdin.gets.split.map!(&:to_i)
      # 勤務した時間
      worktime = work[1] - work[0]
      # 時間数分ループ
      worktime.times do |num|
        # 通常の時給か
        if work[0] + num >= 9 && work[0] + num < 17
          salary += salaryPerHour[0]
        # 夜の時給か
        elsif work[0] + num >= 17 && work[0] + num < 22
          salary += salaryPerHour[1]
        # 深夜の時給か
        else
          salary += salaryPerHour[2]
        end
      end
    }
    # 給料を出力
    puts salary
  end
end
