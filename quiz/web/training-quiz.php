<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
 "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
<title>知識トレーニング</title>
</head>
<body>

<?php

$dsn = 'mysql:host=mysql; dbname=quiz';
$user = 'root';
$password = 'root-pass';

print('問題');
print('<br />');

try{
    $dbh = new PDO($dsn, $user, $password);

    if(@$_GET['key']){
      $key = $_GET['key'];
      if($_GET['result'] == '1'){
        $search = $dbh->query("SELECT right_answer_number FROM quiz WHERE id = $key;");
        $number = $search->fetch();
        $update = $dbh->query("UPDATE quiz SET right_answer_number = $number[0] + 1 WHERE id = $key;");
      } else {
        $search = $dbh->query("SELECT wrong_answer_number FROM quiz WHERE id = $key;");
        $number = $search->fetch();
        $update = $dbh->query("UPDATE quiz SET wrong_answer_number = $number[0] + 1 WHERE id = $key;");
      }
    }
    $select = 'SELECT * FROM quiz WHERE status = 1 ORDER BY RAND() LIMIT 1;';
    foreach ($dbh->query($select) as $row) {
        
        echo <<<EOM
          <p> $row[1] </p>
          <div id=value hidden=hidden>$row[2]</div>
          
          <input type=button value=答えを見る style='width:100px; height:30px' onclick=show() />
          <input type=button id=choice value=他の問題を選ぶ style='width:120px; height:30px; display:inline' onclick=location.href='training-quiz.php' />
          <br>
          <br>
          <div id=lavel></div>
          <div id=answer></div>
          <br>
          <form action=training-quiz.php method=get>
            <input type=hidden name=key value=$row[0]>
            <input type=hidden name=result value=1>
            <input type=submit id=right value=正解した！ style='width:150px; height:30px; display:none' >
          </form>
          <br>
          <form action=training-quiz.php method=get>
            <input type=hidden name=key value=$row[0]>
            <input type=hidden name=result value=2>
            <input type=submit id=wrong value=不正解だった… style='width:150px; height:30px; display:none' >
          </form>
          <script>
            var show = function(){
              //答えを表示する
              lavel = document.getElementById('lavel');
              lavel.innerHTML = '答え';
              answer = document.getElementById('answer');
              value = document.getElementById('value');
              answer.innerHTML = value.innerHTML;
              //ボタンを表示する
              document.getElementById('right').style.display = '';
              document.getElementById('wrong').style.display = '';
              //他の問題を選ぶボタンは非表示にする
              document.getElementById('choice').style.display = none;
            }
          </script>
        EOM;
    }
} catch (PDOException $e){
    print('Error:'.$e->getMessage());
    die();
}

$dbh = null;

?>

<br>
<br>
<input type=button value=トップに戻る style='width:100px; height:30px' onclick=location.href='index.html' />
</body>
</html>