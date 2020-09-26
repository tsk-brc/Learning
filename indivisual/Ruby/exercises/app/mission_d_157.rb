=begin
  コインの表と裏の出る組み合わせが何通り存在するか数える。
=end

class MissionD157

  def run
    # コインを投げる回数
    num = STDIN.gets.to_i
    # 組み合わせを出力
    puts 2 ** num
  end
end