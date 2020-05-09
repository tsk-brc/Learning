# encoding: utf-8
def signature(word)
  # 単語のシグネチャーを作成(英字は大文字に変換)
  word.encode("utf-8").upcase.chars.sort.join.intern
end

def read_wordlist(path)
  File.open(path, mode = "rt:utf-8") do |wordlist|
    # 改行コード、重複の文字列、空行、1文字の単語を除去して読み込み(英字は大文字に変換)
    wordlist.map { |line| line.encode("utf-8").chomp.upcase }.uniq.reject { |word| word.size < 2 }
  end
end

def make_anagrams(words)
  words.map { |word| [signature(word), word] }
       .inject({}) { |hash, (signature, word)| hash[signature] ||= []; hash[signature] << word; hash }
       .select { |signature, words| words.size > 0 }
end

def find_anagrams(word)
  signature = signature(word)
  matching = Anagrams[signature]
  matching ? matching - [word] : []
end

# 調査対象の文字列
TARGET = "のにんれうしでお"

# 辞書を読み込み
WORDS = read_wordlist('./anagram/words_dic.csv')

# クラスを作成
Anagrams = make_anagrams(WORDS)

# アナグラムの結果を出力
puts find_anagrams(TARGET)

