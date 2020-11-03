=begin
  入力されるデータを1行にして出力する。
=end

class MissionD141
  def run
    # データ数
    data_number = STDIN.gets.to_i
    # 全データを格納する配列
    all_data = []
    # データ数分ループ
    data_number.times {
      # データ名を取得し、配列に追加
      data_name = STDIN.gets.chomp
      all_data << data_name
    }
    # スペース区切りで出力
    puts all_data.join(' ')
  end
end
