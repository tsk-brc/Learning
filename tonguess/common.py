#!/usr/bin/env python
# coding: utf-8

from collections import Counter
import numpy as np

# 使用可能な文字
USABLED_CHARACTER = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
# 文字数
CHARACTER_LENGTH = 4


class Judge(object):
    # GETの数
    get = 0
    # TOUCHの数
    touch = 0

    def __repr__(self):
        return 'get: {}, touch: {}'.format(self.get, self.touch)

    def __eq__(self, other):
        return self.get == other.get and self.touch == other.touch

    def __ne__(self, other):
        return not (self.get == other.get and self.touch == other.touch)

    def __hash__(self):
        return self.get * 1e4 + self.touch


def coincidence(n1, n2):
    # getとtouchの数を算出
    judge = Judge()
    for i, n in enumerate(n1):
        if n == n2[i]:
            judge.get += 1
        elif n in n2:
            judge.touch += 1
    return judge


def is_valid_character(target, length, usabled_character):
    # 文字数が一致しているか
    if len(target) != length:
        print('Error: 文字数が一致しません', file=sys.stderr)
        return False
    # 同じ文字が使用されているか
    if len(target) != len(set(target)):
        print('Error: 同じ文字が使用されています', file=sys.stderr)
        return False
    # 使用可能な文字以外が使用されていないか
    for character in target:
        if not character in usabled_character:
            print('Error: 使用可能な文字以外が使用されています。使用可能文字：' +
                  USABLED_CHARACTER, file=sys.stderr)
            return False
    else:
        return True

# num_listが答えの候補の時にnumをcallすることで得られる情報量を求める


def entropy(num, num_list):

    n = len(num_list)
    j_list = [coincidence(num_, num).__hash__() for num_ in num_list]
    counter = Counter(j_list)
    pr = [x * 1.0 / n for x in counter.values()]
    # 情報量を返却
    return sum(map(lambda p: p * -np.log2(p), pr))
