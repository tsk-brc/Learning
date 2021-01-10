require "highline"
require 'yaml'

class AnalyzedString

  def start_process?
    # yかnが入力されるまでループする
    while true
      print '文字列解析を始めますか? [y|n]:'
      response = gets.chomp!
      if response.length == 1
        case response
        when /^[yY]/
          return true
        when /^[nN]/, /^$/
          return false
        else
          puts 'yまたはnで入力してください。'
        end
      else
        puts '1文字で入力してください。'
      end
    end	
  end

  def string_check(set_string, string_length, usable_chars)
    # エラーメッセージを格納する配列
    error_msg = []
    # 文字数が一致しているか
    error_msg.push("文字列は#{string_length}文字で設定してください。") if set_string.length != string_length
    # 使用可能文字以外が使用されていないか
    set_string.length.times do |num|
      if !usable_chars.include?(set_string.slice(num))
        error_msg.push("文字列に使用可能文字以外が設定されています。使用可能文字:#{usable_chars}")
        break
      end
    end
    return error_msg
  end

  def make_check_string(usable_chars, target_string, string_length)
    # 初回は使用可能文字の最初の文字を文字列の文字数分セットする
    if target_string.nil?
      target_string = usable_chars.slice(0) * string_length
      return target_string
    end
    # 文字列の文字数分ループ
    string_length.times do |num|
      # 使用可能文字の最後の文字かどうか
      if target_string.slice(num) != usable_chars.slice(usable_chars.length - 1)
        # 最後の文字でなければ現在の文字の次に記載されている文字に変更する
        usable_chars.length.times do |num2|
          if target_string.slice(num) == usable_chars.slice(num2)
            target_string.slice!(num)
            target_string.insert(num, usable_chars.slice(num2 + 1))
            return target_string
          end
        end
      # 使用可能文字の最後の文字なら最初の文字に戻す
      else
        target_string.slice!(num)
        target_string.insert(num, usable_chars.slice(0))
      end
    end
  end

  analyzed_string = AnalyzedString.new
  highline = HighLine.new
  config = YAML.load_file('config.yml')
  # 使用可能文字
  usable_chars = config['usable_chars']
  # 解析する文字列の長さ
  string_length = config['string_langth']
  # コンソールにメッセージ表示(コンソール上はアスタリスク表示)
  set_string = highline.ask('文字列を設定してください') {|q| q.echo = '*' }
  # 文字列のエラーチェック
  error_msg = analyzed_string.string_check(set_string, string_length, usable_chars)
  # エラーがあったらエラーメッセージを出して処理終了
  if !error_msg.empty?
    puts error_msg
    exit
  end
  # 処理をするかどうかをコンソール上に表示
  if !analyzed_string.start_process?
    # falseなら処理終了
    puts '処理を終了します。'
    exit
  end
  # 処理開始時間
  start_time = Time.now
  # 総当たり解析で使用する文字列
  target_string = nil
  # 処理件数
  count = 0
  # 解析終わるまでループ
  while true
    target_string = analyzed_string.make_check_string(usable_chars, target_string, string_length)
    count += 1
    puts "#{count}: #{target_string}"
    if target_string == set_string
      puts "あなたが設定した文字列は#{target_string}です。"
      break
    end
  end
  # 処理終了時間
  end_time = Time.now
  # 処理時間を出力
  puts "解析時間: #{end_time - start_time}s"
end