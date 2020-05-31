<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
 "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
<title>画像トレーニング</title>
</head>
<body>

<?php

// 対象となるディレクトリのファイルを取得
$files = glob('./images/*.jpg');

$files = $files[mt_rand(0, count($files)-1)];

if (is_file($files)) {
  // 不要な文字列をトリムする
  $str = ltrim($files, './images/');
  $str = rtrim($str, '.jpg');
  $answer = $str;
}
print('問題');
print('<br />');
print('次の画像は何でしょう');
print('<br />');
print '<img src="'.$files.'" alt="" width=450 height=360>';
print('<br />');
print('<br />');
echo <<<EOM
  <input type=button value=答えを見る style=width:100px; height:30px onclick=show() />
  <input type=button value=他の問題を選ぶ style=width:120px; height:30px onclick=location.href='imaging-quiz.php' />
  <br>
  <br>
  <div id=value hidden=hidden>$answer</div>
  <div id=lavel></div>
  <div id=answer></div>
  <script>
    var show = function(){
      //答えを表示する
      lavel = document.getElementById('lavel');
      lavel.innerHTML = '答え';
      answer = document.getElementById('answer');
      value = document.getElementById('value');
      answer.innerHTML = value.innerHTML;
    }
  </script>
EOM;
?>

<br>
<br>
<input type=button value=トップに戻る style='width:100px; height:30px' onclick=location.href='index.html' />
</body>
</html>
