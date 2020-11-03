=begin
  大統領選挙の勝者を決める。
  大統領選挙では各党の代表を選ぶ予備選挙、予備選挙を勝ち上がった代表の中で本選挙を行う。
  ただし、いずれの選挙でも勝者は必ず1人に定まり、最大の得票数が同じになることはないものとする。
=end

class MissionB036
  def run
    # 候補者数
    candidates = STDIN.gets.to_i
    # 共和党の候補者を格納する配列
    republican = []
    # 民主党の候補者を格納する配列
    democratic = []
    # 共和党の代表者番号
    republican_represent = 0
    # 民主党の代表者番号
    democratic_represent = 0
    # 投票情報
    voters_info = []
    # 候補者数ループ
    candidates.times {
      # 候補者の党情報
      party = STDIN.gets.chomp!
      # 該当する党の獲得票数に0をセット(後続処理の判定で使用するので違う党には-1をセットしておく)
      if party == 'Republican'
        republican << 0
        democratic << -1
      else
        republican << -1
        democratic << 0
      end
    }
    # 投票者数
    voters = STDIN.gets.to_i
    ######## 予備選挙開始 ########
    voters.times {
      # 投票番号(1位から順番にスペース区切りで記載)
      voters_paper = STDIN.gets.split
      # 本選挙でも使用するので投票情報をコピーしておく
      voters_info << voters_paper
      # 共和党の候補者に投票したか
      republican_vote_flg = true
      # 民主党の候補者に投票したか
      democratic_vote_flg = true
      # 投票した候補者のN番目
      num = 0
      # 共和党と民主党の両方に投票するまでループ
      while republican_vote_flg || democratic_vote_flg do
        # 投票したのが共和党の候補者か
        if republican[voters_paper[num].to_i - 1] >= 0
          # 既に共和党候補者へ投票しているか
          if republican_vote_flg
            # 有効投票なら投票数を加算し、フラグをOFFに
            republican[voters_paper[num].to_i - 1] += 1
            republican_vote_flg = false
          end
        else
          # 既に民主党候補者へ投票しているか
          if democratic_vote_flg
            # 有効投票なら投票数を加算し、フラグをOFFに
            democratic[voters_paper[num].to_i - 1] += 1
            democratic_vote_flg = false
          end
        end
        num += 1
      end
    }
    # 各党の最大獲得票数
    republican_represent = republican.max
    democratic_represent = democratic.max
    # 共和党の最大票数を獲得した候補者を抽出
    candidates.times { |num|
      if republican[num] == republican_represent
        republican_represent = num + 1
        break
      end
    }
    # 民主党の最大票数を獲得した候補者を抽出
    candidates.times { |num|
      if democratic[num] == democratic_represent
        democratic_represent = num + 1
        break
      end
    }
    ######## 本選挙開始 ########
    # 各党の代表者の獲得票数
    republican_count = 0
    democratic_count = 0
    # 投票者数分ループ
    voters.times { |num|
      # 候補者数分ループ
      candidates.times { |num2|
        # どちらかの党の代表者と一致したら獲得票数を加算してbreak
        if voters_info[num][num2].to_i == democratic_represent
          democratic_count += 1
          break
        elsif voters_info[num][num2].to_i == republican_represent
          republican_count += 1
          break
        end
      }
    }
    # 獲得した票数が多い候補者の番号を出力
    puts republican_count > democratic_count ? republican_represent : democratic_represent
  end
end
