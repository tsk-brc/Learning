=begin
  入力した文字列で認証できるかどうかをチェックする。
  ルールは以下の通り。
　・合言葉と同じ文字列をそのまま入力すると、「合言葉が流出した」と判断し、認証エラーとする。
　・合言葉の文字列を並び替えて、合言葉そのものとは一致しない文字列だった場合には認証成功。
　　そうでない場合には認証エラーとする。
=end
class MissionC095
  def run
    # 認証文字列
    master = $stdin.gets
    # 入力した文字列
    input_str = $stdin.gets
    # ルール通りかどうか
    puts (master == input_str || master.split('').sort.join != input_str.split('').sort.join ?
      'NO' : 'YES')
  end
end
