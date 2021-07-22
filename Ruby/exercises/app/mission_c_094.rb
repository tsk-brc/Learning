=begin
  市民からいくら税金を徴収したかを確認する。
  なお、所得が一定額以上になった場合、その超過金額に対してのみ、より高い税率を適用する。

  所得金額が
  ¥0〜¥100,000の場合、税率は0%
  ¥100,001〜¥750,000の場合、税率は10%
  ¥750,000〜¥1,500,000の場合、税率は20%
  ¥1,500,001以上の場合、税率は40%
  ただし、小数点以下の数字は切り捨てる。

  例えば、所得が¥850,000だった場合、
  ・¥0~¥100,000に対しては、税金がかからない。
  ・¥100,001~¥750,000に対しては10%の税率がかかり、税金は¥6,500。
  ・¥750,001~¥850,000に対しては20%の税率がかかり。税金は¥2,000。
  よって、税金の合計は¥8,500となる。
=end
class MissionC094
  def run
    # 税金を徴収する人数
    taxer = $stdin.gets.to_i
    # 徴収金額
    tax_amount = 0
    # 人数分ループ
    taxer.times {
      # 所得
      salary = $stdin.gets.to_i
      # 所得をルールによって徴収する
      if salary > 1500000
        tax_amount += ((salary - 1500000) * 0.4).to_i
      end
      if salary > 750000
        tax_amount += ([(salary - 750000), 750000].min * 0.2).to_i
      end
      if salary > 100000
        tax_amount += ([(salary - 100000), 650000].min * 0.1).to_i
      end
    }
    # 結果を出力
    puts tax_amount
  end
end
