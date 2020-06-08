#!/usr/bin/env python
# coding: utf-8

from player import ComPlayer, HumanPlayer


class Game(object):

    def __init__(self, player1, player2):
        self.player1 = player1
        self.player2 = player2

    def main(self):
        # ターン数の初期値
        turns = 1
        # 試合が終わるまでループ
        while True:
            print('---------- Turn {} ----------'.format(turns))
            print('--- pleyer1のターン ---')
            player1.action(player2)
            print('--- pleyer2のターン ---')
            player2.action(player1)
            # ターンが終わるごとにターン数を加算
            turns += 1


if __name__ == '__main__':
    # プレイヤー1の情報
    player1 = HumanPlayer()
    # プレイヤー2の情報
    player2 = ComPlayer()
    # GAME START
    game = Game(player1, player2)
    game.main()
