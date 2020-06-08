#!/usr/bin/env python
# coding: utf-8


from itertools import permutations
from numpy.random import shuffle
from random import choice
from common import *
import copy
import sys

# プレイヤーがCOMの処理


class ComPlayer(object):

    def __init__(self, number=None):
        self.candidate = [''.join(i) for i in permutations(
            USABLED_CHARACTER, CHARACTER_LENGTH)]
        if number is None:
            number = choice(self.candidate)

        if type(number) in [str, int]:
            number = list(str(number))

        self.number = number
        self.turn = 1
        assert len(number) == CHARACTER_LENGTH
        self.all_candidate = copy.deepcopy(self.candidate)

    # 相手の宣言した数字に対し、getとtouchの数を返す
    def reply_coincidence(self, opponent_call_number):

        return coincidence(self.number, opponent_call_number)

    # 次に宣言する文字列を決める
    def decide_call_character(self, max_num=1000):

        if self.turn > 1:
            # 要素をシャッフルする
            shuffle(self.candidate)
            # 探査数
            if len(self.candidate) <= max_num:
                array = self.candidate + \
                    self.all_candidate[:max_num - len(self.candidate)]
            else:
                shuffle(self.all_candidate)
                array = self.all_candidate[:max_num]

            entropy_list = map(lambda x: entropy(
                x, self.candidate[:max_num]), array)
            # 最もエントロピーが高くなる数字を設定
            call_number = array[np.argmax(entropy_list)]

        else:
            # 1ターン目はランダムで決める
            call_number = choice(self.candidate)
        print('ワードをコールしてください: {}'.format(call_number))
        return call_number

    # 候補を更新する
    def update_candidate(self, judge, call_number):
        self.candidate = list(filter(lambda x: coincidence(
            x, call_number) == judge, self.candidate))

    # 1ターンのアクション
    def action(self, opponent):

        call_number = self.decide_call_character()
        j = opponent.reply_coincidence(call_number)
        print(j)
        # 全てがGETなら試合終了
        if j.get == CHARACTER_LENGTH:
            print('GAME SET!')
            exit()
        # 候補を更新する
        self.update_candidate(j, call_number)
        print('candidate: {}'.format(len(self.candidate)))
        self.turn += 1

# プレイヤーが人だったときの処理(COMだったときと違う部分だけ宣言)


class HumanPlayer(ComPlayer):

    def __init__(self):
        target = self.input_character(
            'アンサーワードを{}文字で決めてください: '.format(CHARACTER_LENGTH))
        assert len(target) == CHARACTER_LENGTH
        ComPlayer.__init__(self, target)

    # 文字の入力
    def input_character(self, message):
        while True:
            target = list(input(message))
            if is_valid_character(target, CHARACTER_LENGTH, USABLED_CHARACTER):
                return target

    # ワードのコール
    def decide_call_character(self, max_num=1000):
        target = self.input_character('ワードをコールしてください: ')
        assert len(target) == CHARACTER_LENGTH
        return target
