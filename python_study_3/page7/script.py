def print_hand(hand, name='ゲスト'):
    # 変数handsに、複数の文字列を要素に持つリストを代入してください
    hands = ['グー', 'チョキ', 'パー']
    
    # リストhandsを用いて、選択した手が出力されるように書き換えましょう
    print(name + 'は' + hands[hand] + 'を出しました')

print('じゃんけんをはじめます')
player_name = input('名前を入力してください：')
# 「何を出しますか？（0: グー, 1: チョキ, 2: パー）」と出力してください
print('何を出しますか？（0: グー, 1: チョキ, 2: パー）')

# inputを用いて入力を受け取り、数値に型変換してから変数player_handに代入してください
player_hand = int(input('数字で入力してください：'))

if player_name == '':
    # 第1引数を変数player_handに書き換えてください
    print_hand(player_hand)
else:
    # 第1引数を変数player_handに書き換えてください
    print_hand(player_hand, player_name)