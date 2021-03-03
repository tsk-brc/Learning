=begin
  指定金額ギリギリまで使って、なるべく多くの種類のお菓子を買う。
  以下のルールに従ってお菓子を買い、残金がいくらになるかを求める。
  ・お菓子の総額は所持金以内
  ・種類の数を最大にする
  ・同じお菓子を複数個買わない
  ・お釣りを最小
  ・お釣りを最小にするよりも種類の数を最大にすることを優先する
=end

class MissionA034
  def run
    # 諸々の情報(お菓子の種類 所持金額)
    buying_info = $stdin.gets.split.map!(&:to_i)
    # お菓子の金額を格納する配列
    snacks = []
    # 残金の最小値(初期値は所持金にしておく)
    min_money = buying_info[1]
    # お菓子の最大の種類数
    max_snacks_count = 0
    # 各お菓子の金額を配列に格納
    buying_info[0].times { |num|
      snacks[num] = $stdin.gets.to_i
    }
    # 2のお菓子の数乗ループ
    (2**buying_info[0]).times { |num1|
      # ループ回数を2進数に直す(1:その配列番号のお菓子を買う,2:買わない)
      to_s2 = format("%0#{buying_info[0]}d", num1.to_s(2).to_i)
      # ループ内での購入金額
      target_price = 0
      # ループ内で購入したお菓子の種類
      target_snacks_count = 0
      # お菓子の種類分ループ
      buying_info[0].times { |num2|
        # 2進数に直した時の値が1の桁数のお菓子を購入する
        if to_s2[num2] == '1'
          target_price += snacks[num2]
          target_snacks_count += 1
        end
      }
      # 購入したお菓子の個数が今までの最大または購入したお菓子の個数が同じで、残金が少なければ情報を上書き
      if (target_snacks_count > max_snacks_count &&
        buying_info[1] - target_price >= 0) ||
        (target_snacks_count == max_snacks_count &&
          min_money > buying_info[1] - target_price &&
          buying_info[1] - target_price >= 0)
        min_money = buying_info[1] - target_price
        max_snacks_count = target_snacks_count
      end
    }
    # 残金を出力
    puts min_money
  end
end
