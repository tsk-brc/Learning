=begin
  自分が好きなグループのどちらのライブに行くかを考える。
  決定方法は以下の通り。
  　・ライブの日付が被っていない日は、ライブがある方に行く。
  　・ライブの日付が被った日は、グループAとグループBのライブを交互に行く。
=end
class MissionC102
  def run
    # グループAがライブを開催する回数
    count_hold_live_groupA = $stdin.gets.to_i
    # グループAがライブを開催する日を格納する配列
    days_live_groupA = []
    # グループBがライブを開催する日を格納する配列
    days_live_groupB = []
    # どちらのライブに行くか
    now_turn = 'A'
    # グループAがライブを開催する日
    count_hold_live_groupA.times {
      days_live_groupA << $stdin.gets.to_i
    }
    # グループBがライブを開催する回数
    count_hold_live_groupB = $stdin.gets.to_i
    # グループBがライブを開催する日
    count_hold_live_groupB.times {
      days_live_groupB << $stdin.gets.to_i
    }
    # 全日数分ループ
    1.upto(31) { |day|
      # グループAのみ開催している場合はグループAに行く
      if days_live_groupA.include?(day) && !days_live_groupB.include?(day)
        puts 'A'
      # グループBのみ開催している場合はグループAに行く
      elsif !days_live_groupA.include?(day + 1) && days_live_groupB.include?(day)
        puts 'B'
      # どちらも開催していない場合は行かない
      elsif !days_live_groupA.include?(day + 1) && !days_live_groupB.include?(day)
        puts 'x'
      # どちらも開催している場合は交互に行く
      else
        puts now_turn
        now_turn = now_turn == 'A' ? 'B' : 'A'
      end
    }
  end
end
