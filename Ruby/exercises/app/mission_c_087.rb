=begin
  ある値のはじめに完成する回文数を求める。回文数の求め方は以下の通り。
  1. ある数字の桁を逆から並べ、反転させる。
  2. 元の数字と、反転させてできた数字を足し算する。
  3. 足し算してできた数字が回文数でなければ1の操作から繰り返す。
=end
class MissionC087
  def run
    # 回文数の初期値を取得
    palindrome_num = $stdin.gets.to_i
    # 回文数になったかを示すフラグ
    palindrome_unmatch_flg = true
    # 回文数になるまでループ
    while palindrome_unmatch_flg do
      # 反転数の初期値
      invert_num = 0
      # 回文数が完成したかどうかを示すフラグ
      complete_palindrome_unmatch_flg = true
      # 回文数の桁数分ループ
      palindrome_num.to_s.length.times do |i|
        # 1の位から桁の値を取得
        target = palindrome_num.to_s[palindrome_num.to_s.length - i - 1, 1]
        # 反転数に加算していく
        invert_num += target.to_i * 10**(palindrome_num.to_s.length - i - 1)
      end
      # 回文数に反転数を加算
      palindrome_num += invert_num
      # 回文数の桁数分ループ
      palindrome_num.to_s.length.times do |j|
        # 回文数になっているかどうか
        if palindrome_num.to_s[palindrome_num.to_s.length - j - 1,
1] != palindrome_num.to_s[j, 1]
          complete_palindrome_unmatch_flg = false
        end
      end
      # 回文数完成したらループを抜ける
      palindrome_unmatch_flg = false if complete_palindrome_unmatch_flg
    end
    # 回文数を出力
    puts palindrome_num
  end
end
