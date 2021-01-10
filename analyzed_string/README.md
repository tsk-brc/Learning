# 文字列解析ツール
適当な文字列を総当たりで検索した際にどれくらいの時間がかかるかを測定する。
 
使用可能な文字と設定する文字列の長さは全てymlファイルに設定する。(プログラムの変更は不要。)

検索方式は使用可能文字(usable_chars)の1文字目に記載されている文字から順に検索していく。
 
例:<br>
usable_chars: 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890'<br>
string_langth: 6<br>
の場合、aaaaaa→baaaaa→caaaaa→…→0aaaaa→abaaaa→bbaaaa→…→000000という順番に検索していく。
