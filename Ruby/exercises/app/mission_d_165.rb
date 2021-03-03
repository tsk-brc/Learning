=begin
  パスワードのセキュリティチェックを行う。
  4桁のパスワードで、同じ文字列が使用されている場合はNGとする。
=end

class MissionD165
  def run
    # パスワードの文字列を配列に格納
    strArray = $stdin.gets.split('')
    # 比較しやすいようにソートしておく
    strSortArrat = strArray.sort
    # 同じ文字列があるか比較
    if (strSortArrat[1] != strSortArrat[2]) &&
      (strSortArrat[2] != strSortArrat[3]) &&
      (strSortArrat[3] != strSortArrat[4])
      puts 'OK'
    else
      puts 'NG'
    end
  end
end
