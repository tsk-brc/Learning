<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
 "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
<title>みんなでクイズ</title>
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

    $sql = 'SELECT * FROM quiz ORDER BY RAND() LIMIT 1;';
    foreach ($dbh->query($sql) as $row) {
        print($row['quiz_sentence']);
        print('<br />');
        print('<br />');
        print('答え');
        print('<br />');
        print($row['quiz_answer']);
    }
}catch (PDOException $e){
    print('Error:'.$e->getMessage());
    die();
}

$dbh = null;

?>
<br>
<br>
<input type=button value=他の問題を選ぶ style='width:120px; height:30px' onclick=location.href='enjoying-quiz.php' />
<input type=button value=トップに戻る style='width:100px; height:30px' onclick=location.href='index.html' />
</body>
</html>
