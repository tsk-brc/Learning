=begin
  今月の給料を算出する。
  ・9時から17時までの勤務:時給X円(通常の時給)
  ・17時から22時までの勤務:時給Y円(夜の時給)
  ・それ以外の時間の勤務:時給Z円(深夜の時給)
=end

class MissionC076

  def run
    # 時給情報
    salaryPerHour = STDIN.gets.split
    # 働いた日にち
    workCount = STDIN.gets.to_i
    # 給料の合計
    salary = 0
    # 勤務日数分ループ
    workCount.times{
      # 始業時間と終業時間
      work = STDIN.gets.split
      # 勤務した時間
      worktime = work[1].to_i - work[0].to_i
      # 時間数分ループ
      worktime.times do |num|
        # 通常の時給か
        if work[0].to_i + num >= 9 && work[0].to_i + num < 17
          salary += salaryPerHour[0].to_i
        # 夜の時給か
        elsif work[0].to_i + num >= 17 && work[0].to_i + num < 22
          salary += salaryPerHour[1].to_i
        # 深夜の時給か
        else
          salary += salaryPerHour[2].to_i
        end
      end
    }
    # 給料を出力
    puts salary
  end
end